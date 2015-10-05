package test;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * This is valid for JAX-RS 2.0, but not 1.0.
 * There is   CHARSET_PARAMETER	"charset" for javax.ws.rs.core.MediaType
 * see https://jersey.java.net/apidocs/latest/jersey/index.html
 */
@Path("/foo")
public class IDEA108445 {
    @GET
    @Produces("text/plain; charset=utf-8") // << marked as red, should be valid.
    public String post() {
        return "";
    }
}
