package test.IDEA119747_IDEA130052;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Response;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


/**
 * Created by Olga Pavlova on 10/2/2015.
 */
@Path("/series")
public class IDEA130052 {

    @GET
    @Path("/series")
    public void series(@Suspended final AsyncResponse asyncResponse,
                       @QueryParam("q") String queryString) {
                Response.ResponseBuilder builder = Response.ok();
                asyncResponse.resume(builder.build());  // <<-- here
    }



    private static final BlockingQueue<AsyncResponse> suspended =
            new ArrayBlockingQueue<AsyncResponse>(5);
    @GET
    public void readMessage(@Suspended final AsyncResponse ar) throws InterruptedException {
        Object[] s = suspended.toArray();
        suspended.put(ar);
    }


}
