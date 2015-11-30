package test.IDEA119747_IDEA130052;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import java.util.concurrent.TimeUnit;

@Stateless
@Path("/")
public class MyEjbResource {

    @GET
    @Asynchronous
    public void longRunningOperation(@Suspended AsyncResponse ar
    ) {
        ar.setTimeoutHandler(null);
        ar.setTimeout(10, TimeUnit.SECONDS);
        final String result = executeLongRunningOperation();
        ar.resume(result);
    }

    private String executeLongRunningOperation() { return  "bla"; }
}