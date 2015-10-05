package test;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
@Path(value="one")
public class IDEA103972 {

    //@GET, @PUT, @POST and so on.

    @Path("bla1")
    @PUT
    String put() { return "put"; } //<- should be error warning because @PUT should be public

    @Path("bla2")
    @POST
    protected String post() { return "post";} //<- should be error warning because @POST should be public

    @Path("bla3")
    @GET
    protected String get3() { return "get";} //<- should be error warning because @GET should be public

// http://localhost:8080/RestApp/one/bla3


}
