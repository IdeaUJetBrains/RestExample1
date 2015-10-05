package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 10/1/2015.
 */
@Path("/custom")
public class IDEA48581 {

    @GET
    @Produces("text/plain")
    public String getClichedMessage1() {
        return "Cliche.";
    }

    @GET
    @Produces("text/")
    public String getClichedMessage2() {
        return "Cliche.";
    }


}
