package com.drzinks.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("sth")
public class WelcomeController {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getSthElse(){
		return "sth elese";
	}
}
