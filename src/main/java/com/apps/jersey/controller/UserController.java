package com.apps.jersey.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.apps.jersey.model.Role;
import com.apps.jersey.model.User;
import com.sun.jersey.spi.resource.Singleton;

@Singleton
@Path("/users")
public class UserController {
	
	private static Map<Long, User> users = new HashMap<Long, User>();
	
	static {
		users.put(369L, 
			new User(369L, "javadev", "Java", "Developer", Arrays.asList(
				new Role(123L, "Read", Boolean.TRUE), 
				new Role(456L, "Write", Boolean.FALSE),
				new Role(789L, "Execute", Boolean.TRUE)
				)
			)
		);
		users.put(258L, 
			new User(258L, "c2xplusdev", "C++", "Developer", Arrays.asList(
					new Role(123L, "Read", Boolean.TRUE), 
					new Role(456L, "Write", Boolean.TRUE),
					new Role(789L, "Execute", Boolean.TRUE)
					)
				)
		);
		users.put(147L, 
			new User(147L, "htmldev", "HTML", "Developer", Arrays.asList(
					new Role(123L, "Read", Boolean.TRUE), 
					new Role(456L, "Write", Boolean.TRUE),
					new Role(789L, "Execute", Boolean.FALSE)
					)
				)
			);
	}
	
	private List<User> getUser() {
		return new ArrayList<User>(users.values());
	}
	
	private User getUser(Long userId) {
		return users.get(userId);
	}
	
	@GET
	@Path("/get/json")
	@Produces({MediaType.APPLICATION_JSON})
	public List<User> getUserAsJson() {
		return getUser();
	}
	
	@GET
	@Path("/get/{userId}/json")
	@Produces({MediaType.APPLICATION_JSON})
	public User getUserAsJson(@PathParam("userId") Long userId) {
		return getUser(userId);
	}
	
	@GET
	@Path("/get/xml")
	@Produces({MediaType.APPLICATION_XML})
	public List<User> getUserAsXml() {
		return getUser();
	}
	
	@GET
	@Path("/get/{userId}/xml")
	@Produces({MediaType.APPLICATION_XML})
	public User getUserAsXml(@PathParam("userId") Long userId) {
		return getUser(userId);
	}
}
