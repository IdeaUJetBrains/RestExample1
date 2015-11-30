package test.IDEA119747_IDEA130052;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

/**
 * Created by Olga Pavlova on 11/30/2015.
 */
@Path("/messages/next1111")
public class ShouldNotBeDeployed {

    @GET
    public void readMessage(@Suspended AsyncResponse ar) throws InterruptedException {
        //return "rrr";
    }

    @GET
    @Path("f")
    public String readMessage1()  {
        return "rrr";
    }
}
