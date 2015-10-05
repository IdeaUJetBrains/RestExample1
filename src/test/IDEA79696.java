package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 10/1/2015.
 */
public class IDEA79696 {

    @GET
    @Path("/{btLocator}")
    @Produces({"application/xml", "application/json"})
    public String foo(@PathParam("btLocator_wrong") String buildTypeLocator) {
        return "bla";
    };


}
