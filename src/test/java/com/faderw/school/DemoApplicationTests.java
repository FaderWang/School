package com.faderw.school;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.PlatformTransactionManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	PlatformTransactionManager platformTransactionManager;

	@Test
	public void contextLoads() {
	}

	@Test
	public void transactionTest() {
		System.out.println(platformTransactionManager.getClass().getName());
		System.out.println(((DataSourceTransactionManager)platformTransactionManager).getDataSource().getClass().getName());
	}

}
