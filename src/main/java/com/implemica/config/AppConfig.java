package com.implemica.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @author malex
 */

@Configuration
@ComponentScan(basePackages = "com.implemica")
public class AppConfig {

    /**
     * CommonsMultipartResolver config
     */
    private static final String DEFAULT_ENCODING = "utf-8";
    private static final long MAX_UPLOAD_SIZE = 20971520;
    private static final int MAX_IN_MEMORY_SIZE = 1048576;


    @Bean
    public static PropertyPlaceholderConfigurer propertyConfigurer() {
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();

        ClassPathResource dataSource = new ClassPathResource("db.properties");
        ClassPathResource hibernate = new ClassPathResource("hibernate.properties");
        ClassPathResource dbcp = new ClassPathResource("dbcp.properties");

        configurer.setLocations(dataSource, hibernate, dbcp);
        return configurer;
    }

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver resolver=new CommonsMultipartResolver();
        resolver.setDefaultEncoding(DEFAULT_ENCODING);
        resolver.setMaxUploadSize(MAX_UPLOAD_SIZE);
        resolver.setMaxInMemorySize(MAX_IN_MEMORY_SIZE);
        return resolver;
    }

}
