package com.misman.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.misman.didemo.examplebeans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Value("${misman.username}")
	String user;
	
	@Value("${misman.password}")
	String password;
	
	@Value("${misman.dburl}")
	String dburl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fk = new FakeDataSource();
		fk.setPassword(password);
		fk.setUser(user);
		fk.setUrl(dburl);
		
		return fk;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
	
}
