package com.example.wsrest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
    @GET
    @Produces(MediaType.TEXT_HTML)

    public String getHtml() {
        return "<html><body><h1>Hello from the RESTful Server!</h1></body></html>";
    }
}
