package com.faderw.school.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by FaderW on 2018/7/17
 */
@Configuration
@EnableTransactionManagement
public class TransactionManagerConfig {

    //配置事物管理器
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(DruidDataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
