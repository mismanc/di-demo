package com.misman.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.misman.didemo.examplebeans.FakeDataSource;
import com.misman.didemo.examplebeans.FakeJMSBroker;

@Configuration
@PropertySource({"classpath:datasource.properties","classpath:application.yml"})
public class PropertyConfig {

	@Autowired
	private Environment env;
	
	@Value("${misman.username}")
	String user;
	
	@Value("${misman.password}")
	String password;
	
	@Value("${misman.dburl}")
	String dburl;
	
	@Value("${jms.username}")
	String jmsUser;
	
	@Value("${jms.password}")
	String jmsPassword;
	
	@Value("${jms.url}")
	String jmsUrl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fk = new FakeDataSource();
		fk.setPassword(password);
		fk.setUser(user);
		fk.setUrl(env.getProperty("MISMAN_CONF"));
		
		return fk;
	}
	
	@Bean
	public FakeJMSBroker fakeJMSBroker() {
		FakeJMSBroker fk = new FakeJMSBroker();
		fk.setPassword(jmsPassword);
		fk.setUser(jmsUser);
		fk.setUrl(jmsUrl);
		return fk;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
	
}
