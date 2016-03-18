package cy.ac.ouc.WSEchoServer;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IEchoService {
	
	@WebMethod
	public String echo(String message);
}
