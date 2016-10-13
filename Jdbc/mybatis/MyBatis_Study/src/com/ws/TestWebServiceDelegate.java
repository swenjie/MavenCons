package com.ws;

@javax.jws.WebService(targetNamespace = "http://ws.com/", serviceName = "TestWebServiceService", portName = "TestWebServicePort", wsdlLocation = "WEB-INF/wsdl/TestWebServiceService.wsdl")
public class TestWebServiceDelegate {

	com.ws.TestWebService testWebService = new com.ws.TestWebService();

	public String testWs(String string) {
		return testWebService.testWs(string);
	}

}