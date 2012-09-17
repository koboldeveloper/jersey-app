package com.apps.jersey.controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.sun.jersey.spi.resource.Singleton;

@Singleton
@Path("/users")
public class UserController {
	
	@GET
	@Path("/get/{guid}")
	@Produces({MediaType.APPLICATION_JSON})
	public String getUser(@PathParam("guid") String image) {
		JSONObject json = new JSONObject();
		try {
			json.put("status", "active");
			json.put("service", "user");
			json.put("ouput", "json");
		} catch (JSONException je) {
			je.printStackTrace();
		}
		return json.toString();
	}
	
}
