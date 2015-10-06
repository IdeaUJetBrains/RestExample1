package test.IDEA119747_IDEA130052;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
//import com.google.common.util.concurrent.*;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
public class IDEA130052 {

    @GET
    @Path("/series")
    public void series(@Suspended final AsyncResponse asyncResponse,
                       @QueryParam("q") String queryString) {

        /*ListenableFuture<List<String>> future = ServiceKeeper.getInstance().service.listMetrics();
        Futures.addCallback(future, new FutureCallback<List<String>>() {
            @Override
            public void onSuccess(List<String> result) {
                //[...]
                //------

                Response.ResponseBuilder builder = Response.ok();
                asyncResponse.resume(builder.build());  // <<-- here
            }
            // [...]
        }*/
    }
}
