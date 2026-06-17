package com.example.resource;

import com.example.model.User;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @GET
    public Response getUser() {

        User user = new User(1, "200 bayrem");

        return Response.ok(user).build();
    }

    @POST
    public Response createUser(User user) {

        return Response
                .status(Response.Status.CREATED)
                .entity(user)
                .build();
    }
}
