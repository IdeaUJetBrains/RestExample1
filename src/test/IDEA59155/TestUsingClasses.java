package test.IDEA59155;

import javax.ws.rs.*;

/**
 * Created by Olga Pavlova on 10/1/2015.
 */
public class TestUsingClasses {

    @GET
    @Produces({"text/plain"})
    @Path("{input}")
    public ClassWithStringArg input1(@PathParam("input") ClassWithStringArg p, @QueryParam("input1") ClassWithStringArg p1 ) {
        return new ClassWithStringArg();
    }


    @Path("{input}")
    public EmptyClass input2(@PathParam("input") EmptyClass p, @QueryParam("input1") EmptyClass p1 ) { //should be error
        return new EmptyClass();
    }

    @Path("{input}")
    public ClassWithConstructor input3(@PathParam("input") ClassWithConstructor p, @QueryParam("input1") ClassWithConstructor p1 ) { //should be error
        return new ClassWithConstructor("bla");
    }


}
