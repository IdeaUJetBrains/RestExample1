package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Olga Pavlova on 11/26/2015.
 */
@Path("/foo")
public class IDEA119264 {
        @GET
        @Produces("text/plain; charset=utf-8") // << marked as red, should be valid.
        public String post() {
            return "";
        }

    @GET
    @Produces(value = {"r/scsa" , MediaType.TEXT_PLAIN, MediaType.CHARSET_PARAMETER, MediaType.APPLICATION_ATOM_XML})
    public String post1() {
        return "";
    }

    @GET
    @Produces({"foo/foo", "foo/plain", "text/foo"})
    public String post3() {
        return "";
    }

    @GET
    @Produces({"foo", "/plain", "text/"})
    public String post2() {
        return "";
    }

    @GET
    @Produces("")
    public String post4() {
        return "";
    }
}
