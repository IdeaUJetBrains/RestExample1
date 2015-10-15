package testForMe;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/as/{id}")
public class PathParamUsages {
    @PathParam("id") String myId;

    @GET
    public String getUserById(@PathParam("id") String id) {
        return null;
    }
}
