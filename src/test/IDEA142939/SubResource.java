package test.IDEA142939;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class SubResource {

    @GET
    @Path("/{cID}")
    public String getSubSrc(@PathParam("msgId") long messageId, @PathParam("cID") long commentId) {
        return "comments sub src , messageId: " + messageId + " , commentId: " + commentId;
    }

}
