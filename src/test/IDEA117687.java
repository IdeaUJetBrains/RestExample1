package test;

import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
public class IDEA117687 {

    @Path("{input}")
    public String foo() {
        return "ttt";
    }

    @Path("=")   //<-  highlight unresolved references
    public String foo1() {
        return "ttt";
    }

    @Path("5599")   //<-  highlight unresolved references
    public String foo2() {
        return "ttt";
    }

    @Path(",$%^*()")   //<-  highlight unresolved references
    public String foo3() {
        return "ttt";
    }
}


