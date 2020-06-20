package com.samples.springsolrsearchsample.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.samples.springsolrsearchsample.model.fulltext.ProductDocument;
import com.samples.springsolrsearchsample.model.request.Product;
import com.samples.springsolrsearchsample.repository.SolrProductRepository;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author vijaykumar.s
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    SolrProductRepository solrProductRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String createProduct(ProductDocument productDocument) {
        Optional<ProductDocument> synchronizedProductDocument
                = Optional.ofNullable(solrProductRepository.save(productDocument));

        if (synchronizedProductDocument.isPresent()) {
            return synchronizedProductDocument.get().getId();
        }
        return null;
    }

    @Override
    public ProductDocument getProductById(String productId) {
        return solrProductRepository.findByProductId(productId);
    }

    @Override
    public void deleteByProductId(String productId) {
        solrProductRepository.deleteById(productId);
    }

    @Override
    public Product updateProductFields(Map<?, ?> productFields) {
        return null;
    }

    @Override
    public List<Product> getAllProductDocuments() {
        List<Product> products = List.of();
        solrProductRepository.findAll().forEach(productDocument -> {
            products.add(dozerBeanMapper.map(productDocument, Product.class));
        });
        return products;
    }

    @Override
    public Product updateProduct(ProductDocument productDocument) {
        return dozerBeanMapper.map(solrProductRepository.save(productDocument), Product.class);
    }

    @Override
    public void deleteAll() {
        solrProductRepository.deleteAll();
    }
}
