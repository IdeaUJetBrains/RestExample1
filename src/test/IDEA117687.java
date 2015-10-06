package test;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
public class IDEA117687 {

    //unresolved references, related to https://youtrack.jetbrains.com/issue/IDEA-48628
    @Path("{input}")
    public String foo(@PathParam("input1") String str ) {
        return "ttt";
    }
    //=======================================
    //invalid unresolved references

    @Path("{input}")
    public String foo1(@PathParam("=") String str ) {
        return "ttt";
    }

    @Path("{input}")
    public String foo2(@PathParam("5599") String str ) {
        return "ttt";
    }

    @Path("{input}")
    public String foo3(@PathParam(",$%^*()") String str ) {
        return "ttt";
    }


}


