package test.IDEA119747_IDEA130052;

import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Olga Pavlova on 10/16/2015.
 */
@Path("/messages/next")
public class MessagingResource {

        private static final BlockingQueue<AsyncResponse> suspended =
                new ArrayBlockingQueue<AsyncResponse>(5);

        @GET
        public void readMessage(@Suspended AsyncResponse ar) throws InterruptedException {
            suspended.put(ar);
        }

        @POST
        public String postMessage(final String message) throws InterruptedException {
            final AsyncResponse ar = suspended.take();
            ar.resume(message); // resumes the processing of one GET request
            return "Message sent";
        }
}
