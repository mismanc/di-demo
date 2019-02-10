package com.misman.didemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {
		System.out.println("## LifeCycleBean Constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## Application context has been set");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## Bean Factory has been set");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## Bean name has been set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## LifeCycleBean has been destroy");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## LifeCycleBean has set its properties");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("## The Post Construct annotated method has been called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("## The Predestroy annotated method has been called");
	}
	
	public void beforeInit() {
		System.out.println("## - Before Init - Called by Bean Post Processor");
	}

	public void afterInit() {
		System.out.println("## - After Init - Called by Bean Post Processor");
	}
}
