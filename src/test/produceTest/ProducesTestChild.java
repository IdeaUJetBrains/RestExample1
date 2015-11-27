package test.produceTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//   http://localhost:8080/RestExample1_war_exploded/child/t/
@Path("/child")
public class ProducesTestChild extends ProducesTest {

    @GET
    @Path("/t")
    public String post11() {   return new ProducesTest().post1();  }


}
