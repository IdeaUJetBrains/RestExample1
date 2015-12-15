package test;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;

/**
 * Created by Olga Pavlova on 12/15/2015.
 */
@Path("/helloworld1/{t}")
public class TestConstructor {


    public TestConstructor(@Context String t1,
                      @HeaderParam("user-agent") String t2,
                      @CookieParam("sessionid") String t3,
                      @MatrixParam("name") String t4,
                      @QueryParam("t") @DefaultValue("3QueryParam") String t5,
                      @PathParam("t") String t6,
                      @FormParam("name") @DefaultValue("name1") String name,
                      @FormParam("age") @DefaultValue("age1") String age
    ) {
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        /*System.out.println( name);
        System.out.println( age);*/
    }


    @POST
    @Produces("text/plain")
    public String getClichedMessage(
            /*@FormParam("name") String name,
            @FormParam("age") String age*/
    ) {
        //HelloWorld dd = new HelloWorld("t1","t1","t1", "t1", "t1", "t1");
        // Return some cliched textual content
        return "Hello World, "// + name + ", " + age
                ;
    }


    @GET
    @Path("test1") ///helloworld/t1/test1
    public String form() {
        return "<html>\n" +
                "<body>\n" +
                "\t<h1>JAX-RS @FormQuery Testing</h1>\n" +
                "\n" +
                "\t<form action=\"/helloworld/t1\" method=\"post\">\n" +
                "\t\t<p>\n" +
                "\t\t\tName : <input type=\"text\" name=\"name\" />\n" +
                "\t\t</p>\n" +
                "\t\t<p>\n" +
                "\t\t\tAge : <input type=\"text\" name=\"age\" />\n" +
                "\t\t</p>\n" +
                "\t\t<input type=\"submit\" value=\"Add User\" />\n" +
                "\t</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }

}

