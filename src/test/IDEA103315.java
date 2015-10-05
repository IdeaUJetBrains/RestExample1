package test;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("users")
@Produces("application/json")
@Consumes("application/x-www-formurlencoded")
//@WebService
public class IDEA103315 {
//TODO uncomment (commented, because it is not deployed)
    /*
    @Path("/me")
    @GET
    public String getProfile1(@Context AuthContext authContext) {
        return "bla";
    }




    @Path("/me")
    @GET
    public UserProfileWrapper getProfile(@Context AuthContext authContext) {
        if (authContext.toString() != null) {
            return new UserProfileWrapper(authContext.toString() );
        }
        throw new WebApplicationException(Status.NOT_FOUND);
    }

     class UserProfileWrapper{
        private IGameObject ttt;

        public UserProfileWrapper(String s) {}
    }

     class IGameObject{}
     */
}
