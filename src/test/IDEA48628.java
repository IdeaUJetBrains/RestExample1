package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 10/1/2015.
 */
@Path("/custom/{postfix2}")
public class IDEA48628 {


    @PathParam("postfix")  //Correct.
    private String myPostfix;

    @GET
    @Produces({"text/plain"})
    @Path("{input2}")
    public String input(@PathParam("input") String p) {  //Bug. Here should be Warning about unresolved references
        return "Class path: /custom/" + myPostfix + " .\nMy path: /custom/" + myPostfix + "/" + p + " .";
    }


}
