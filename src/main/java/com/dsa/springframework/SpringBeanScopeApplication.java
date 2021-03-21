package com.dsa.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBeanScopeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBeanScopeApplication.class, args);
		
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println("singletonBean1: "+singletonBean1.getMyScope());
		
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println("singletonBean2: "+singletonBean2.getMyScope());
		
		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println("prototypeBean1: "+prototypeBean1.getMyScope());
		
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println("prototypeBean2: "+prototypeBean2.getMyScope());
	}

}
