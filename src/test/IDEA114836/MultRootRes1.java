package test.IDEA114836;

import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
@Path("/mult")
public class MultRootRes1 {
    @Path("/")
    public String foo() {
        return "ttt";
    }

    @Path("/")
    public String foo1() {
        return "ttt";
    }
}
