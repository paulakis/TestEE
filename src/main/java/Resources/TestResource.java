package Resources;


import Domain.Dto;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestResource {





    @GET
    @Path("/1")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTest(Dto dto){
        System.out.println(dto.toString());
        return Response.ok(dto).build();
    }

}
