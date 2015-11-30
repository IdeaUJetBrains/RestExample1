package test.inheritanceTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

// http://localhost:8080/RestExample1_war_exploded/child2/childmethod
// http://localhost:8080/RestExample1_war_exploded/child2/parentMethod
@Path(value = "/child2")
public class Child2 extends Parent2 {

    @Path("/childmethod")
    @GET
    public String parentMethod(){return "test2";};
}
