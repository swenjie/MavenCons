package org.test.webservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.test.webservice.client package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _TestWs_QNAME = new QName("http://ws.com/",
			"testWs");
	private final static QName _TestWsResponse_QNAME = new QName(
			"http://ws.com/", "testWsResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.test.webservice.client
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link TestWs }
	 * 
	 */
	public TestWs createTestWs() {
		return new TestWs();
	}

	/**
	 * Create an instance of {@link TestWsResponse }
	 * 
	 */
	public TestWsResponse createTestWsResponse() {
		return new TestWsResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TestWs }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.com/", name = "testWs")
	public JAXBElement<TestWs> createTestWs(TestWs value) {
		return new JAXBElement<TestWs>(_TestWs_QNAME, TestWs.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TestWsResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.com/", name = "testWsResponse")
	public JAXBElement<TestWsResponse> createTestWsResponse(TestWsResponse value) {
		return new JAXBElement<TestWsResponse>(_TestWsResponse_QNAME,
				TestWsResponse.class, null, value);
	}

}
