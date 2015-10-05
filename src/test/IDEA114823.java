package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
@Path(value = "hello1")
public class IDEA114823 {

    @GET
    @Path("test1")
    public String foo() {
        return "Hello1";
    }

    @GET
    @Path("test2.")   //For example, http://localhost:8080/RestApp/hello1/test2a  <- Now doesn't work
    public String foo1() {
        return "Hello1";
    }

    //---------------------------------------------------------
    @GET
    @Path("t.s*t[^abc][xyz]*")   //For example, http://localhost:8080/RestApp/hello1/testdx  <- Now doesn't work
    public String foo2() {
        return "Hello1";
    }

    //info: for {m,n} regexp - error warning (checked only few regexp)


}
