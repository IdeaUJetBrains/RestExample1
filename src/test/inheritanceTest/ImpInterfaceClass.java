package test.inheritanceTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// http://localhost:8080/RestExample1_war_exploded/impclass/impmethod
@Path(value = "/impclass")

public class ImpInterfaceClass implements Interface1 {
    @Path("/impmethod")
    @GET
    public String foo5(){return "test";};

}