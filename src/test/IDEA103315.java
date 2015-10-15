package test;

import sun.security.krb5.internal.AuthContext;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;


@Path("users")
@Produces("application/json")
@Consumes("application/x-www-formurlencoded")
//@WebService   //<-All works without this annotation Ok. But the User has this annotation not-commented.
public class IDEA103315 {

    @Path("/me1")
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
        throw new WebApplicationException(Response.Status.NOT_FOUND);
    }


    // created for compilation
     public class UserProfileWrapper{
        private IGameObject ttt;

        public UserProfileWrapper(String s) {}
    }
     class IGameObject{}

}
