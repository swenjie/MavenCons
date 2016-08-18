package com.ctvit.db.services;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by oracle on 2016/8/18.
 */
public class Client {

	@Autowired
	private RestServiceForDb rESTSample;

	private WebClient webClient;

	@Before
	public void initContext() {
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		webClient = (WebClient) ac.getBean("webClient");
		rESTSample = (RestServiceForDb) ac.getBean("rESTSample");
	}

	@Test
	public void testWebService() { // 第一种调用接口方式
		String user = webClient.path("sample/message/6").
				accept("MediaType.APPLICATION_JSON").get(String.class);
		System.out.println(user);
	}

	@Test
	public void testWebService2() { // 第二种调用接口方式
		String user = rESTSample.getMessage(6);
		System.out.println(user);
	}

}
