package testForMe;

import javax.ws.rs.*;
import java.lang.String;

@Path("/")
public class WrongDefaultValue {
  @DefaultValue("a")  private int id;
  @DefaultValue("5")  private int id2;

  @GET
  public String foo(@DefaultValue("5") boolean p1,
                    @DefaultValue("5") int p2,
                    @DefaultValue("false") boolean p3) {
    return "";
  }
}
