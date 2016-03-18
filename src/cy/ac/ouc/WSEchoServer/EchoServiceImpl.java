package cy.ac.ouc.WSEchoServer;

import javax.jws.WebService;

@WebService(endpointInterface = "cy.ac.ouc.WSEchoServer.IEchoService",
			targetNamespace   = "http://pes642.org/javaws/echo")
public class EchoServiceImpl implements IEchoService {

	@Override
	public String echo(String message) {
		return message.toUpperCase();
	}

}
