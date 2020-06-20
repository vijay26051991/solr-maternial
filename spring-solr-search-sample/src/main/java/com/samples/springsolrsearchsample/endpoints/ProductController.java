package com.samples.springsolrsearchsample.endpoints;

import java.util.List;

import com.samples.springsolrsearchsample.model.fulltext.ProductDocument;
import com.samples.springsolrsearchsample.model.request.Product;
import com.samples.springsolrsearchsample.service.IProductService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vijaykumar.s
 *
 * Controller for product endpoints.
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController implements AbstractController<Product> {

    @Autowired
    private IProductService iProductService;

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    public String create(Product product) {
        ProductDocument productDocument = dozerBeanMapper.map(product, ProductDocument.class);
        return iProductService.createProduct(productDocument);
    }

    @Override
    public Product update(Product product, String id) {
        return iProductService.updateProduct(dozerBeanMapper.map(product, ProductDocument.class));
    }

    @Override
    public List<Product> getAll() {
        return iProductService.getAllProductDocuments();
    }

    @Override
    public Product getById(String id) {
        ProductDocument productById = iProductService.getProductById(id);
        return dozerBeanMapper.map(productById, Product.class);
    }

    @Override
    public void deleteAll() {
        iProductService.deleteAll();
    }

    @Override
    public void deleteById(String id) {
        iProductService.deleteByProductId(id);
    }

    @Override
    public Product searchByName(String name) {
        return null;
    }
}
