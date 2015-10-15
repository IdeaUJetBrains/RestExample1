package test.IDEA60318;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Deployed to http://localhost:8080/RestExample1_war_exploded/test/sub/subparam
 */
@Path("test")
public class InOneFile {

    @Path("/sub/{subparam}")
    public Sub1Resource foo(){return new Sub1Resource();}

    public class Sub1Resource {
        @PathParam("subparam")
        private String subparam="subparam";


        @GET
        public String foo(){return subparam;}
    }

}
