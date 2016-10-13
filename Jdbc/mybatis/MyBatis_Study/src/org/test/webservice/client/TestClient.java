package org.test.webservice.client;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestWebServiceDelegate test=new TestWebServiceService().getTestWebServicePort();
		String result=test.testWs("123");
		System.out.println(result);
		
	}

}
