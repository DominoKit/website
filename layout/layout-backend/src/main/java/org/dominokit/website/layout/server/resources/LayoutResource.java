package org.dominokit.website.layout.server.resources;

import org.dominokit.website.layout.shared.model.LayoutResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class LayoutResource {

    @Path("LayoutRequest")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public LayoutResponse sayHello() {
        return new LayoutResponse("Hello from server");
    }
}