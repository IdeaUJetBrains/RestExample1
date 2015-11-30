package test.inheritanceTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value = "/interface")
public interface Interface1 {

    @Path("/foo")
    @GET
    String foo5();
}
