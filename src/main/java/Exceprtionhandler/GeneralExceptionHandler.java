package Exceprtionhandler;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class GeneralExceptionHandler implements ExceptionMapper<Throwable> {
    @Override
    public Response toResponse(Throwable throwable) {

        return Response.status(Response.Status.BAD_REQUEST).entity(
                throwable.getMessage()).build();
    }
}
