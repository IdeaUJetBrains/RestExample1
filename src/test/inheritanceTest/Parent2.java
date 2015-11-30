package test.inheritanceTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


//@Path(value = "/parent2")
public class Parent2 {

    @Path("/parentMethod")
    @GET
    @Produces("text/html")
    public String parentMethod(){return "test";};

}
