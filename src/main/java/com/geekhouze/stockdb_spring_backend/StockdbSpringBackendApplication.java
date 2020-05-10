package com.geekhouze.stockdb_spring_backend;

import com.geekhouze.stockdb_spring_backend.storage.StorageProperties;
import com.geekhouze.stockdb_spring_backend.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.geekhouze.stockdb_spring_backend.repository")
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class StockdbSpringBackendApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StockdbSpringBackendApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StockdbSpringBackendApplication.class);
    }

//    @Bean
//    CommandLineRunner init(StorageService storageService) {
//        return (args) -> {
//            storageService.deleteAll();
//            storageService.init();
//        };
//    }

}
