package com.my.junitdemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "myDataSource")
    public DataSource mysDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false");
        dataSourceBuilder.username("springstudent");
        dataSourceBuilder.password("springstudent");
        return dataSourceBuilder.build();
    }
}
