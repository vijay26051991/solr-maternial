package com.samples.springsolrsearchsample;

import com.samples.springsolrsearchsample.config.SolrConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = "com.samples.springsolrsearchsample")
@Import(SolrConfiguration.class)
public class SpringSolrSearchSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSolrSearchSampleApplication.class, args);
    }

}
