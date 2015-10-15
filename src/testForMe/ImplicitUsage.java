package testForMe;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/path/{id}")
public class ImplicitUsage {
  @Context
  private Object myContext;
  @PathParam("id")
  private String id;
  private Object aaa;

  @GET
  @Produces("text/plain")
  public String getMessage() {
    return "" + myContext + aaa + id;
  }
}
