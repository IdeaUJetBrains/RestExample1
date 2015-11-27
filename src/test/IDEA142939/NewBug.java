package test.IDEA142939;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/custom/{postfix}")
public class NewBug {
        @PathParam("postfix") private String myPostfix;

        @GET
        @Path("{input}")
        public String foo(@PathParam("input") String p) {
            return "bla";
        }
}
