package com.samples.springsolrsearchsample.service;

import java.util.List;
import java.util.Map;

import com.samples.springsolrsearchsample.model.fulltext.ProductDocument;
import com.samples.springsolrsearchsample.model.request.Product;

/**
 * @author vijaykumar.s
 */
public interface IProductService {
    String createProduct(final ProductDocument productDocument);

    ProductDocument getProductById(final String productId);

    List<Product> getAllProductDocuments();

    Product updateProduct(final ProductDocument productDocument);

    void deleteAll();

    void deleteByProductId(final String productId);

    Product updateProductFields(Map<?, ?> productFields);
}
