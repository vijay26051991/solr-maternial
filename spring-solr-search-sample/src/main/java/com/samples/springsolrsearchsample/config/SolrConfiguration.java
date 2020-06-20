package com.samples.springsolrsearchsample.config;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

/**
 * @author vijaykumar.s
 *
 * Configuration for solr client.
 *
 */
@Configuration
@EnableSolrRepositories(basePackages = {"com.samples.springsolrsearchsample.repository"})
@ComponentScan
public class SolrConfiguration {

    @Bean
    public SolrClient solrClient() {
        return new HttpSolrClient.Builder("http://localhost:8983/solr").build();
    }

    @Bean
    public SolrTemplate solrTemplate(SolrClient client) {
        return new SolrTemplate(client);
    }
}
