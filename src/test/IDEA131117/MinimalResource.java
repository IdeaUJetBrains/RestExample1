package test.IDEA131117;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
@Path("dto")
public class MinimalResource {

    @GET
    public MinimalDto get() {
        return new MinimalDto("IntelliJ");
    }
}
