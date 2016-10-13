package org.test.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "TestWebServiceDelegate", targetNamespace = "http://ws.com/")
public interface TestWebServiceDelegate {

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "testWs", targetNamespace = "http://ws.com/", className = "org.test.webservice.client.TestWs")
	@ResponseWrapper(localName = "testWsResponse", targetNamespace = "http://ws.com/", className = "org.test.webservice.client.TestWsResponse")
	public String testWs(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

}
