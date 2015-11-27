package test.IDEA59155;

import javax.ws.rs.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/**
 * Created by Olga Pavlova on 10/1/2015.
 */
@Path("test1")
public class TestPrimitiveTypes {

    //==============================================================
    //String
    //==============================================================
    @GET
    @Produces({"text/plain"})
    @Path("{input}")
    public String input1(@PathParam("input") String p,
                         @QueryParam("myQueryParam") String p1,
                         @FormParam("myFormParam") String p6,
                         @HeaderParam("myHeader") String p7,
                         @MatrixParam("myMatrixParam") String p8,
                         @CookieParam("myCookieParam") String p9

    ) {
        return "la-la";
    }

    //==============================================================
    //Primitive Types and their corresponding classes
    //==============================================================
    @Path("{input}/{input1}")
    public boolean input2(@PathParam("input") boolean p,
                          @QueryParam("input1") boolean p1,
                          @FormParam("myFormParam") boolean p6,
                          @HeaderParam("myHeader") boolean p7,
                          @MatrixParam("myMatrixParam") boolean p8,
                          @CookieParam("myCookieParam") boolean p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input100(@PathParam("input") Boolean p,
                          @QueryParam("input1") Boolean p1,
                          @FormParam("myFormParam") Boolean p6,
                          @HeaderParam("myHeader") Boolean p7,
                          @MatrixParam("myMatrixParam") Boolean p8,
                          @CookieParam("myCookieParam") Boolean p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input101(@PathParam("input") short p,
                            @QueryParam("input1") short p1,
                            @FormParam("myFormParam") short p6,
                            @HeaderParam("myHeader") short p7,
                            @MatrixParam("myMatrixParam") short p8,
                            @CookieParam("myCookieParam") short p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input102(@PathParam("input") Short p,
                            @QueryParam("input1") Short p1,
                            @FormParam("myFormParam") Short p6,
                            @HeaderParam("myHeader") Short p7,
                            @MatrixParam("myMatrixParam") Short p8,
                            @CookieParam("myCookieParam") Short p9)
    {
        return true;
    }


    @Path("{input}/{input1}")
    public boolean input103(@PathParam("input") long p,
                            @QueryParam("input1") long p1,
                            @FormParam("myFormParam") long p6,
                            @HeaderParam("myHeader") long p7,
                            @MatrixParam("myMatrixParam") long p8,
                            @CookieParam("myCookieParam") long p9)
    {
        return true;
    }



    @Path("{input}/{input1}")
    public boolean input1040(@PathParam("input") Long p,
                            @QueryParam("input1") Long p1,
                            @FormParam("myFormParam") Long p6,
                            @HeaderParam("myHeader") Long p7,
                            @MatrixParam("myMatrixParam") Long p8,
                            @CookieParam("myCookieParam") Long p9)
    {
        return true;
    }


    @Path("{input}/{input1}")
    public boolean input105(@PathParam("input") float p,
                            @QueryParam("input1") float p1,
                            @FormParam("myFormParam") float p6,
                            @HeaderParam("myHeader") float p7,
                            @MatrixParam("myMatrixParam") float p8,
                            @CookieParam("myCookieParam") float p9)
    {
        return true;
    }


    @Path("{input}/{input1}")
    public boolean input106(@PathParam("input") Float p,
                            @QueryParam("input1") Float p1,
                            @FormParam("myFormParam") Float p6,
                            @HeaderParam("myHeader") Float p7,
                            @MatrixParam("myMatrixParam") Float p8,
                            @CookieParam("myCookieParam") Float p9)
    {
        return true;
    }


    @Path("{input}/{input1}")
    public boolean input107(@PathParam("input") double p,
                            @QueryParam("input1") double p1,
                            @FormParam("myFormParam") double p6,
                            @HeaderParam("myHeader") double p7,
                            @MatrixParam("myMatrixParam") double p8,
                            @CookieParam("myCookieParam") double p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input108(@PathParam("input") Double p,
                            @QueryParam("input1") Double p1,
                            @FormParam("myFormParam") Double p6,
                            @HeaderParam("myHeader") Double p7,
                            @MatrixParam("myMatrixParam") Double p8,
                            @CookieParam("myCookieParam") Double p9)
    {
        return true;
    }



    //========================================================================================//
    //========================================================================================//
    //NOT OK:
    //========================================================================================//

    @Path("{input}/{input1}")
    public boolean input201(@PathParam("input") char p,
                            @QueryParam("input1") char p1,
                            @FormParam("myFormParam") char p6,
                            @HeaderParam("myHeader") char p7,
                            @MatrixParam("myMatrixParam") char p8,
                            @CookieParam("myCookieParam") char p9)
    {
        return true;//Bug. Should show error Warning
    }

    @Path("{input}/{input1}")
    public boolean input202(@PathParam("input") Character p,
                            @QueryParam("input1") Character p1,
                            @FormParam("myFormParam") Character p6,
                            @HeaderParam("myHeader") Character p7,
                            @MatrixParam("myMatrixParam") Character p8,
                            @CookieParam("myCookieParam") Character p9)
    {
        return true;//Bug. Should show error Warning
    }










}
