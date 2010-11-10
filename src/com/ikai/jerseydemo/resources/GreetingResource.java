/**
 * 
 */
package com.ikai.jerseydemo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author Ikai Lan
 * 
 * Web service demonstrating path parameters
 *
 */
@Path("/greeting/{name}")
public class GreetingResource {
	
	@GET
	@Produces("text/plain")
	public String getGreeting(@PathParam("name") String name) {
		return "Greetings, " + name + "!";
	}

}
