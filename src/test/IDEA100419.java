package test;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Warn if a Jax-RS class has no public methods
 */
@Stateless
@Path("/foo")
public class IDEA100419 {

        @Path("bla")
        @GET
        String hello() { return "Hello World"; }
}
