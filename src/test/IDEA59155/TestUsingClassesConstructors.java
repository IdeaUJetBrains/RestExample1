package test.IDEA59155;

import javax.ws.rs.*;

/**
 * Created by Olga Pavlova on 10/1/2015.
 */
public class TestUsingClassesConstructors {

    //=======================================================================================//
    //with/without constructors with 1 string arg
    //==============================================================

    //=======================================================================================//
    //OK
    //=======================================================================================//
    @Path("{input}/{input1}")
    public boolean input301(@PathParam("input") OKWithConstructorAndStrArg p,
                             @QueryParam("input1") OKWithConstructorAndStrArg p1,
                             @FormParam("myFormParam") OKWithConstructorAndStrArg p6,
                             @HeaderParam("myHeader") OKWithConstructorAndStrArg p7,
                             @MatrixParam("myMatrixParam") OKWithConstructorAndStrArg p8,
                             @CookieParam("myCookieParam") OKWithConstructorAndStrArg p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input302(@PathParam("input") OkWithFromString p,
                             @QueryParam("input1") OkWithFromString p1,
                             @FormParam("myFormParam") OkWithFromString p6,
                             @HeaderParam("myHeader") OkWithFromString p7,
                             @MatrixParam("myMatrixParam") OkWithFromString p8,
                             @CookieParam("myCookieParam") OkWithFromString p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input303(@PathParam("input") OKWithValueOf p,
                            @QueryParam("input1") OKWithValueOf p1,
                            @FormParam("myFormParam") OKWithValueOf p6,
                            @HeaderParam("myHeader") OKWithValueOf p7,
                            @MatrixParam("myMatrixParam") OKWithValueOf p8,
                            @CookieParam("myCookieParam") OKWithValueOf p9)
    {
        return true;
    }





    //=======================================================================================//
    //NotOk
    //=======================================================================================//

    @Path("{input}/{input1}")
    public boolean input401(@PathParam("input") NotOkEmptyClass p,
                            @QueryParam("input1") NotOkEmptyClass p1,
                            @FormParam("myFormParam") NotOkEmptyClass p6,
                            @HeaderParam("myHeader") NotOkEmptyClass p7,
                            @MatrixParam("myMatrixParam") NotOkEmptyClass p8,
                            @CookieParam("myCookieParam") NotOkEmptyClass p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input402(@PathParam("input") NotOkWithConstructorWithoutArgs p,
                            @QueryParam("input1") NotOkWithConstructorWithoutArgs p1,
                            @FormParam("myFormParam") NotOkWithConstructorWithoutArgs p6,
                            @HeaderParam("myHeader") NotOkWithConstructorWithoutArgs p7,
                            @MatrixParam("myMatrixParam") NotOkWithConstructorWithoutArgs p8,
                            @CookieParam("myCookieParam") NotOkWithConstructorWithoutArgs p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input407(@PathParam("input") NotOkWithConstructorWithTwoArgsOneStr p,
                            @QueryParam("input1") NotOkWithConstructorWithTwoArgsOneStr p1,
                            @FormParam("myFormParam") NotOkWithConstructorWithTwoArgsOneStr p6,
                            @HeaderParam("myHeader") NotOkWithConstructorWithTwoArgsOneStr p7,
                            @MatrixParam("myMatrixParam") NotOkWithConstructorWithTwoArgsOneStr p8,
                            @CookieParam("myCookieParam") NotOkWithConstructorWithTwoArgsOneStr p9)
    {
        return true;
    }


    @Path("{input}/{input1}")
    public boolean input403(@PathParam("input") NotOkWithConstructorWithoutStrArg p,
                            @QueryParam("input1") NotOkWithConstructorWithoutStrArg p1,
                            @FormParam("myFormParam") NotOkWithConstructorWithoutStrArg p6,
                            @HeaderParam("myHeader") NotOkWithConstructorWithoutStrArg p7,
                            @MatrixParam("myMatrixParam") NotOkWithConstructorWithoutStrArg p8,
                            @CookieParam("myCookieParam") NotOkWithConstructorWithoutStrArg p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input404(@PathParam("input") NotOkWithConstructorWithTwoStr p,
                            @QueryParam("input1") NotOkWithConstructorWithTwoStr p1,
                            @FormParam("myFormParam") NotOkWithConstructorWithTwoStr p6,
                            @HeaderParam("myHeader") NotOkWithConstructorWithTwoStr p7,
                            @MatrixParam("myMatrixParam") NotOkWithConstructorWithTwoStr p8,
                            @CookieParam("myCookieParam") NotOkWithConstructorWithTwoStr p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input405(@PathParam("input") NotOkWithFromStringNotStrArg p,
                            @QueryParam("input1") NotOkWithFromStringNotStrArg p1,
                            @FormParam("myFormParam") NotOkWithFromStringNotStrArg p6,
                            @HeaderParam("myHeader") NotOkWithFromStringNotStrArg p7,
                            @MatrixParam("myMatrixParam") NotOkWithFromStringNotStrArg p8,
                            @CookieParam("myCookieParam") NotOkWithFromStringNotStrArg p9)
    {
        return true;
    }

    @Path("{input}/{input1}")
    public boolean input406(@PathParam("input") NotOkWithValueOfNotStr p,
                            @QueryParam("input1") NotOkWithValueOfNotStr p1,
                            @FormParam("myFormParam") NotOkWithValueOfNotStr p6,
                            @HeaderParam("myHeader") NotOkWithValueOfNotStr p7,
                            @MatrixParam("myMatrixParam") NotOkWithValueOfNotStr p8,
                            @CookieParam("myCookieParam") NotOkWithValueOfNotStr p9)
    {
        return true;
    }


    //=======================================================================================//
    //NotOk
    //=======================================================================================//

}
