package test.IDEA119747_IDEA130052;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

/**
 * Created by Olga Pavlova on 11/30/2015.
 */
@Path("/AsyncResource")
public class AsyncResource {
    @GET
    public String asyncGet(@Suspended final AsyncResponse asyncResponse) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                String result = veryExpensiveOperation();
                asyncResponse.resume(result);
            }

            private String veryExpensiveOperation() {
                // ... very expensive operation
                return "bla";
            }
        }).start();
        return "bla-bla";
    }
}
