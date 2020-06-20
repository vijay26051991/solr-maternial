package com.samples.springsolrsearchsample.config;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author vijaykumar.s
 *
 * Configuration for dozer bean mappings.
 */
@Configuration
public class DozerBeanConfig {

    @Bean
    public DozerBeanMapper dozerBeanMapper() {
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        dozerBeanMapper.setMappingFiles(Arrays.asList("classpath:///mappings/product-mapper.xml"));
        return dozerBeanMapper;
    }

}
