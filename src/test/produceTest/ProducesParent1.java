package test.produceTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value = "/parent1")
public class ProducesParent1 {

    @GET
    @Path("/html")
    public String parentMethod() {   return "test";  }
}
