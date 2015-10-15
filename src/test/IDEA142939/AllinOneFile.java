package test.IDEA142939;

import javax.ws.rs.*;

/**
 * Deployed to http://localhost:8080/RestExample1_war_exploded/test/2/subResource
 */
@Path("test")
public class AllinOneFile {

        @Path("/{msgId}")
        public Sub1Resource foo() { return new Sub1Resource();  }


    public class Sub1Resource {
        @GET
        @Path("subResource")
        public String getSubSrc(@PathParam("msgId") long messageId) {
            return "messageId: " + messageId;
        }
    }

}
