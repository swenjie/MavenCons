package com.ctvit.db.test;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

import com.ctvit.db.services.CXFDemoWS;
import com.ctvit.db.services.CXFDemoWSImpl;

import javax.xml.ws.Endpoint;  
public class TestWsEndPoint {
	private static final String ADDRESS = "http://localhost:9000/cxfdemo";
	public static void main(String[] args) {
		System.out.println("Starting Server");  
		CXFDemoWSImpl demo = new CXFDemoWSImpl();  
  
        Endpoint.publish(ADDRESS, demo);  
        System.out.println("Start success");
	}
	@Test  
    public void testSayHello(){  
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
        factory.setServiceClass(CXFDemoWS.class);  
        factory.setAddress(ADDRESS);  
        CXFDemoWS client = (CXFDemoWS)factory.create();  
        String respone= client.sayHello("foo");  
        System.out.println(respone);  
    }  

}
