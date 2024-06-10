package com.myapp.myapp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.driverClassName}")
	private String driverClassName;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	
	@Value("${spring.mysql.datasource.url}")
	private String mySqlUrl;
	@Value("${spring.mysql.datasource.username}")
	private String mySqlUserName;
	@Value("${spring.mysql.datasource.password}")
	private String mySqlPassword;
	@Value("${spring.mysql.datasource.driverClassName}")
	private String mySqlDriverClassName;
	
    @Bean(name = "dataSource")
    DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
    
    @Bean(name="mySqlDataSource")
    DataSource mysqlDataSource() {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	dataSource.setDriverClassName(mySqlDriverClassName);
		dataSource.setUrl(mySqlUrl);
		dataSource.setUsername(mySqlUserName);
		dataSource.setPassword(mySqlPassword);
		return dataSource;
    }
}
