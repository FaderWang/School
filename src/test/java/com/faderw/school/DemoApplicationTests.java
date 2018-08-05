package com.faderw.school;

import com.faderw.school.config.MapperAutoConfig;
import com.faderw.school.domain.CountryMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.PlatformTransactionManager;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {MapperAutoConfig.class})
public class DemoApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	CountryMapper countryMapper;

	@Test
	public void contextLoads() {
		System.out.println(countryMapper.getClass());
	}
//
//	@Test
//	public void transactionTest() {
//		System.out.println(platformTransactionManager.getClass().getName());
//		System.out.println(((DataSourceTransactionManager)platformTransactionManager).getDataSource().getClass().getName());
//	}

}
