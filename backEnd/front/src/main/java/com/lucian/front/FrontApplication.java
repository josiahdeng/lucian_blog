package com.lucian.front;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @author lingxiangdeng
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@MapperScan(basePackages = {"com.lucian.front.dao", "com.lucian.common.dao"})
@ComponentScan(basePackages = {"com.lucian.common", "com.lucian.front"})
@EnableElasticsearchRepositories(basePackages = "com.lucian.front.es_repository")
public class FrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontApplication.class, args);
    }
}
