package test.IDEA59155;

import javax.ws.rs.*;
import java.util.*;

/**
 * Created by Olga Pavlova on 10/1/2015.
 */
@Path("test1")
public class TestListSetSortedSet {
    //==============================================================
    // List<T>, Set<T>, or SortedSet<T>, where T matches the already listed criteria.
    //==============================================================

    //==============================================================
    //Ok
    //==============================================================
    @Path("{input}")
    public String input7(@PathParam("input") List<Boolean> p,
                         @QueryParam("input1") List<Boolean> p1,
                         @FormParam("myFormParam") List<Boolean> p6,
                         @HeaderParam("myHeader") List<Boolean> p7,
                         @MatrixParam("myMatrixParam") List<Boolean> p8,
                         @CookieParam("myCookieParam") List<Boolean> p9)

    {
        return "la-la";
    }

    @Path("{input}")
    public String input9(@PathParam("input") Set<Boolean> p,
                         @QueryParam("input1") Set<Boolean> p1,
                         @FormParam("myFormParam") Set<Boolean> p6,
                         @HeaderParam("myHeader") Set<Boolean> p7,
                         @MatrixParam("myMatrixParam") Set<Boolean> p8,
                         @CookieParam("myCookieParam") Set<Boolean> p9)
    {
        return "la-la";
    }

    @Path("{input}")
    public String input10(@PathParam("input") SortedSet<Boolean> p,
                          @QueryParam("input1") SortedSet<Boolean> p1,
                          @FormParam("myFormParam") SortedSet<Boolean> p6,
                          @HeaderParam("myHeader") SortedSet<Boolean> p7,
                          @MatrixParam("myMatrixParam") SortedSet<Boolean> p8,
                          @CookieParam("myCookieParam") SortedSet<Boolean> p9)
    {
        return "la-la";
    }

    //========Other inherrited types
    @Path("{input}")
    public String input11(@PathParam("input") ArrayList<Long> p,
                         @QueryParam("input1") Vector<Long> p1,
                         @FormParam("myFormParam") LinkedList<Long> p6,
                         @HeaderParam("myHeader") HashSet<Long> p7,
                         @MatrixParam("myMatrixParam") LinkedHashSet<Long> p8,
                         @CookieParam("myCookieParam") TreeSet<Long> p9)

    {
        return "la-la";
    }

    //===================

    @Path("{input}")
    public String input500(@PathParam("input") List<OKWithConstructorAndStrArg> p,
                           @QueryParam("input1") SortedSet<OkWithFromString> p1,
                           @FormParam("myFormParam") SortedSet<OKWithValueOf> p6,
                           @HeaderParam("myHeader") SortedSet<OKWithConstructorAndStrArg> p7,
                           @MatrixParam("myMatrixParam") SortedSet<OkWithFromString> p8,
                           @CookieParam("myCookieParam") SortedSet<OKWithValueOf> p9)
    {
        return "la-la";
    }

    @Path("{input}")
    public String input501(@PathParam("input") List<OKWithConstructorAndStrArg> p,
                           @QueryParam("input1") SortedSet<OkWithFromString> p1,
                           @FormParam("myFormParam") SortedSet<OKWithValueOf> p6,
                           @HeaderParam("myHeader") SortedSet<OKWithConstructorAndStrArg> p7,
                           @MatrixParam("myMatrixParam") SortedSet<OkWithFromString> p8,
                           @CookieParam("myCookieParam") SortedSet<OKWithValueOf> p9)
    {
        return "la-la";
    }

    //==============================================================
    //NotOk
    //==============================================================



    //NotOk
    @Path("{input}/input1}")
    public String input500(@PathParam("input") List<NotOkEmptyClass> p,
                           @QueryParam("input1") SortedSet<NotOkWithConstructorWithoutArgs> p1,
                           @FormParam("myFormParam") SortedSet<NotOkWithConstructorWithoutStrArg> p6,
                           @HeaderParam("myHeader") SortedSet<NotOkWithConstructorWithTwoArgsOneStr> p7,
                           @MatrixParam("myMatrixParam") SortedSet<NotOkWithConstructorWithTwoStr> p8,
                           @CookieParam("myCookieParam") SortedSet<NotOkWithFromStringNotStrArg> p9,
                           @QueryParam("input1") SortedSet<NotOkWithValueOfNotStr> p10)
    {
        return "la-la";
    }

    @Path("{input}")
    public String input501(@PathParam("input") List<Character> p,
                         @QueryParam("input1") Set<Character> p1,
                         @FormParam("myFormParam") SortedSet<Character> p6,
                         @HeaderParam("myHeader") HashSet<Character> p7,
                         @MatrixParam("myMatrixParam") LinkedHashSet<Character> p8,
                         @CookieParam("myCookieParam") TreeSet<Character> p9)

    {
        return "la-la";
    }

    //Not pointed in jersey spec, but should work - check
    @Path("{input}")
    public String input502(@PathParam("input") Collection<String> p,
                         @QueryParam("input1") Queue<String> p1,
                         @FormParam("myFormParam") Deque<String> p6,
                         @HeaderParam("myHeader") PriorityQueue<String> p7)
    {
        return "la-la";
    }


    //==============================================================

}
