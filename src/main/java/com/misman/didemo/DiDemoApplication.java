package com.misman.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.misman.didemo.controller.ConstructorInjectedController;
import com.misman.didemo.controller.GetterInjectedController;
import com.misman.didemo.controller.MyController;
import com.misman.didemo.controller.PropertyInjectedController;
import com.misman.didemo.examplebeans.FakeDataSource;
import com.misman.didemo.examplebeans.FakeJMSBroker;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		
		FakeDataSource fds = (FakeDataSource) ctx.getBean("fakeDataSource");
		System.out.println(fds.getUser()+ ":" + fds.getPassword());
		System.out.println("url:" + fds.getUrl());
		
		FakeJMSBroker fjmsBroker = ctx.getBean(FakeJMSBroker.class);
		System.out.println(fjmsBroker.getUser()+ ":" + fjmsBroker.getPassword());
		System.out.println("url:" + fjmsBroker.getUrl());
		/*System.out.println(myController.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());*/
	}

}

