package test.IDEA59155;

import javax.ws.rs.*;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/**
 * Created by Olga Pavlova on 10/1/2015.
 */
public class TestDiffTypes {

    //==============================================================
    @GET
    @Produces({"text/plain"})
    @Path("{input}")
    public String input1(@PathParam("input") String p, @QueryParam("input1") String p1) {
        return "la-la";
    }


    @Path("{input}/{input1}")
    public boolean input2(@PathParam("input") boolean p, @QueryParam("input1") boolean p1, @PathParam("input1") Boolean p3) {
        return true;
    }

    @Path("{input}/{input1}")
    public char input3(@PathParam("input") char p, @QueryParam("input1") char p1, @PathParam("input1") Character p3) { //Bug. Should show error Warning for both params
        return 'a';
    }

    @Path("{input}/{input1}")
    public short input4(@PathParam("input") short p, @QueryParam("input1") short p1, @PathParam("input1") Short p3) {
        return 4;
    }

    @Path("{input}/{input1}")
    public long input5(@PathParam("input") long p, @QueryParam("input1") long p1, @PathParam("input1") Long p3) {
        return 5;
    }

    @Path("{input}/{input1}")
    public float input6(@PathParam("input") float p, @QueryParam("input1") float p1, @PathParam("input1") Float p3) {
        return 6;
    }

    @Path("{input}/{input1}")
    public double input8(@PathParam("input") double p, @QueryParam("input1") double p1, @PathParam("input1") Double p3) {
        return 8;
    }


//==============================================================
    // List<T>, Set<T>, or SortedSet<T>, where T matches the already listed criteria.


    @Path("{input}")
    public String input7(@PathParam("input") List<Boolean> p, @QueryParam("input1") List<Boolean> p1) {
        return "la-la";
    }

    @Path("{input}")
    public String input9(@PathParam("input") Set<Boolean> p, @QueryParam("input1") Set<Boolean> p1) {
        return "la-la";
    }

    @Path("{input}")
    public String input10(@PathParam("input") SortedSet<Boolean> p, @QueryParam("input1") SortedSet<Boolean> p1) {
        return "la-la";
    }

    @Path("{input}")
    public String input11(@PathParam("input") List<ClassWithConstructor> p, @QueryParam("input1") List<ClassWithConstructor> p1) {
        return "la-la";

    }
    @Path("{input}")
    public String input12(@PathParam("input") List<ClassWithStringArg> p, @QueryParam("input1") List<ClassWithStringArg> p1) {
        return "la-la";

    }

    //Should display error for interface types as params
   /* @Path("{input}")
    public String input13(@PathParam("input") Collection<Boolean> p,@QueryParam("input1") Collection<Boolean> p1) {  //Error Warning
        return "la-la";

    }
    @Path("{input}")
    public String input14(@PathParam("input") Collection<EmptyClass> p, @QueryParam("input1") Collection<EmptyClass> p1) { //Error Warning 2
        return "la-la";

    }*/
//====================================================================
    //@MatrixParam, @HeaderParam, @CookieParam, and @FormParam
    @Path("{input}")
    public String input15(@MatrixParam("input1") char p,  //Error Warning
                          @HeaderParam("input2") char p1, //Error Warning
                          @CookieParam("input3") char p2, //Error Warning
                          @FormParam("input4") char p3 ) { //Error Warning
        return "la-la";
    }



}
