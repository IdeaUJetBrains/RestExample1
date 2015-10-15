package test.IDEA142939;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Deployed to http://localhost:8080/RestExample1_war_exploded/messages/2/comments/3
 */
@Path("/")
public class SubResource {

    @GET
    @Path("/{cID}")
    public String getSubSrc(@PathParam("msgId") long messageId, @PathParam("cID") long commentId) {
        return "comments sub src , messageId: " + messageId + " , commentId: " + commentId;
    }

}
