package com.samples.springsolrsearchsample.repository;

import com.samples.springsolrsearchsample.model.fulltext.ProductDocument;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolrProductRepository  extends SolrCrudRepository<ProductDocument, String> {

    @Query("id:*?0*")
    ProductDocument findByProductId(String id);

    void deleteProductDocumentById();

}
