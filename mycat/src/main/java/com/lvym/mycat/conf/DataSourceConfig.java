package com.lvym.mycat.conf;

import javax.sql.DataSource;
 
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
 * 配置多个数据源
 */
 
@Configuration
public class DataSourceConfig {
    
    // 创建可读数据源
    @Bean(name = "selectDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.select") // application.yml中对应属性的前缀
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }
 
    // 创建可写数据源
    @Bean(name = "updateDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.update") // application.yml中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }
 
}
