package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 10/1/2015.
 */
@Path("/custom")
public class IDEA48627_obsolete {
    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        return "Cliche.";
    }
}
