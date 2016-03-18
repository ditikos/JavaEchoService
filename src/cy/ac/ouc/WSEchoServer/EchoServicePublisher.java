package cy.ac.ouc.WSEchoServer;

import javax.xml.ws.Endpoint;

public class EchoServicePublisher {

	public static void main(String[] args) {
		String endpointURL = "http://localhost:11880/echo";
		Endpoint.publish(endpointURL, new EchoServiceImpl());

	}

}
