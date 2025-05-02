package com.example.wsrest;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;



@Path("/tanks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TankResource {
    private TankService service = new TankService();

    @GET
    public List<Tank> getAll() {
        return service.getAll();
    }

    @GET
    @Path("/{name}")
    public Tank getTank(@PathParam("name") String name) {
        return service.get(name);
    }

    @POST
    public void addTank(Tank tank) {
        service.add(tank);
    }

    @PUT
    @Path("/{name}")
    public void updateTank(@PathParam("name") String name, Tank tank) {
        service.update(name, tank);
    }

    @DELETE
    @Path("/{name}")
    public void deleteTank(@PathParam("name") String name) {
        service.delete(name);
    }
    @OPTIONS
    @Path("{any:.*}")
    public Response handlePreflight() {
        return Response.ok().build();
    }

}
