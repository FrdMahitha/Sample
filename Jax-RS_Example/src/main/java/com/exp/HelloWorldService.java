package com.exp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldService {
	/*
	 * @GET
	 * 
	 * @Path("/{param}")
	 * 
	 * @Produces("text/html") public Response getMsg(@PathParam("param") String
	 * msg) {
	 * 
	 * String output = "Mahitha PG say : " + msg;
	 * 
	 * return Response.status(200).entity(output).build();
	 * 
	 * }
	 */
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMsg(@PathParam("param") String msg) {

		// String output = "Mahitha PG say : " + msg;

		Message m = new Message();
		m.setMsg(msg);

		return m;

	}

}
