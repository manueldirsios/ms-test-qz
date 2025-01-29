package com.gd.controller;

import java.util.List;

import com.gd.model.UserDTO;
import com.gd.service.UserService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    UserService userService;

    @GET
    public List<UserDTO> getAllUsers() {
        return userService.listAll();
    }

    @POST
    @Path("/createUser")
    @Consumes(MediaType.APPLICATION_JSON) // Debe estar aquí, no en el parámetro


    public void createUser( UserDTO user) {
    	System.out.println("hello");
        userService.addUser(user);
    }
}
