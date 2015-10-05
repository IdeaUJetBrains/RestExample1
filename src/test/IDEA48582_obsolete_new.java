package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 10/1/2015.
 * place cursor after  "i" in @PathParam("input").
 * Press Ctrl + Space
 * After the "i" should remain only input, but remains two: import and postfix
 */
@Path("/custom/{postfix}")
public class IDEA48582_obsolete_new {
        @PathParam("postfix") private String myPostfix;

        @GET
        @Produces({"text/plain"})
        @Path("{input}")
        public String input(@PathParam("input") String p) {
            return "Class path: /custom/" + myPostfix + " .\nMy path: /custom/" + myPostfix + "/" + p + " .";
        }

}
