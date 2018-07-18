package com.faderw.school.config;

import java.io.IOException;

import com.alibaba.druid.pool.DruidDataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;


@Configuration
@MapperScan("com.faderw.school.dao")
public class DataSourceConfig {

    private static final String SPRING_DATASOURCE = "spring.datasource";
    private static final String MAPPER_LOCATIONS = "mapper/*.xml";

    @Value("${mybatis.type-aliases-package}")
    private String typeAliasesPackage; 

	@Bean(name = "dataSource")
    @ConfigurationProperties(prefix = SPRING_DATASOURCE)
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sessionFactoryBean() throws IOException{
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());

        String patternPath = ResourcePatternResolver.CLASSPATH_URL_PREFIX + MAPPER_LOCATIONS;
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(patternPath));
        sessionFactoryBean.setTypeAliasesPackage(typeAliasesPackage);

        return sessionFactoryBean;
    }
}