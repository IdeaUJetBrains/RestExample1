package test.IDEA142939;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/messages")
@Consumes("application/json")
@Produces("application/json")
public class MyResource {

    @Path("/{msgId}/comments")
    public SubResource getCommentsResource() {
        return new SubResource();
    }


}
