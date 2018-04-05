package br.com.saraiva.ws.client.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import br.com.saraiva.negocio.ejb.HelloWorldEJBService;

@Stateless
@Path("/hello_world")
public class HelloWorldBean {
	
	@EJB
	private HelloWorldEJBService serviceHelloWorldEJB;
	
	@GET
	@Path("/first")
	public String helloWorldSample() {
		
		return "hello".concat(serviceHelloWorldEJB.teste());
		
	}

}
