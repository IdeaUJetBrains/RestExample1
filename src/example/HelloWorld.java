package example;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Olga Pavlova on 22/09/2015.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path(value="helloOlga")
public class HelloWorld {

    @GET
    @Path(value="hello")
    public String getMessage1() {
        return "Hello1";
    }

//    @GET
//    @Produces("text/plain")
//    public String getMessage2() {
//        return "Hello2";
//    }


    @Path("sayHello")
    @GET
    public String doSayHelloWithRequestParam(@QueryParam("name") String name) {
        return "Hi there "+name;
    }


    @GET
    @Path(value="/ext")
    public String getMessage3() {
        return "Hello3";
    }


//====================================================================================//
    //GET
//====================================================================================//

    @GET
    @Path(value="/ext1")
    @Produces("application/atom+xml")
    public String say1() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n" +

                "<feed xmlns=\"http://www.w3.org/2005/Atom\">"+ "\n" +

                "<title>Example Feed</title>"+ "\n" +
                "<subtitle>A subtitle.</subtitle>"+ "\n" +
                "<link href=\"http://example.org/feed/\" rel=\"self\" />" + "\n" +
                "<link href=\"http://example.org/\" />"+ "\n" +
                "<id>urn:uuid:60a76c80-d399-11d9-b91C-0003939e0af6</id>"+ "\n" +
                "<updated>2003-12-13T18:30:02Z</updated>"+ "\n" +

                "<entry>"+ "\n" +
                "<title>Atom-Powered Robots Run Amok</title>"+ "\n" +
                "<link href=\"http://example.org/2003/12/13/atom03\" />"+ "\n" +

                "<content type=\"xhtml\">"+ "\n" +
                "<div xmlns=\"http://www.w3.org/1999/xhtml\">" + "\n" +
                "<p>This is the entry content.</p>" + "\n" +
                "</div>" + "\n" +
                "</content>" + "\n" +
                "<author>" + "\n" +
                "<name>John Doe</name>" + "\n" +
                "<email>johndoe@example.com</email>" + "\n" +
                "</author>" + "\n" +

                "</entry>" + "\n" +

                "</feed>";
    }

    //// TODO: 23/09/2015
    @GET
    @Path(value="/ext2")
    @Produces({"image/jpeg,image/png"})
    public String say2() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello image/jpeg,image/png" + "</hello>";
    }


    @GET
    @Path(value="/ext3")
    @Produces("application/json" )
    public String say3() {
        return "{" + "\n" +
                "\"firstName\": \"json F\"," + "\n" +
                "\"lastName\": \"json L\"," + "\n" +
                "}";
    }


    @GET
    @Path(value="/ext4")
    @Produces("application/xml")
    public String say4() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello xml" + "</hello>";
    }


    @GET
    @Path(value="/ext5")
    @Produces("text/html")
    public String say5() {
        return "<html> " + "<title>" + "Hello HTML title" + "</title>" + "<body><h1>" + "Hello HTML" + "</body></h1>" + "</html> ";
    }


    @GET
    @Path(value="/ext6")
    @Produces("text/plain")
    public String say6() {
        return "tra la la";
    }

    /*
    Any format
     */
    @GET
    @Path(value="/ext7")
    @Produces("*/*")
    public String say7() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
    }


    /*
   Any format
    */
    @GET
    @Path(value="/ext8")
    @Produces(MediaType.TEXT_XML)
    public String say8() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
    }

    /*
   Any format
    */
    @GET
    @Path(value="/ext9")
    @Produces(MediaType.TEXT_HTML)
    public String say9() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
    }


    /*
   Any format
    */
    @GET
    @Path(value="/ext10")
    @Produces(MediaType.TEXT_XML)
    public String say10() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
    }


    @GET
    @Produces({ MediaType.APPLICATION_XML})
    @Path("/ext11")
    public String say11() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
    }


    @Path("sayHello/{name}")
    @GET
    public String doSayHello(@PathParam("name") String name) {
        return "Hello there "+name;
    }

//====================================================================================//
    //GET
//====================================================================================//


    @Path("sayHello1")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String doSayHelloWithFormParam(@FormParam("name1") String name) {
        return "Hi there1 " + name;
    }

    @POST
    @Path(value="/ext12")
    @Produces("application/json" )
    public String say12() {
        return "{" + "\n" +
                "\"firstName\": \"json F111\"," + "\n" +
                "\"lastName\": \"json L111\"," + "\n" +
                "}";
    }

    /*@GET
    @Path(value="/{lastName}")....33
    @Produces(value="text/xml")
    public ContactInfo getByLastName(@PathParam(value="lastName") String lastName) {
        ...
    }

    @POST
    @Consumes(value={"text/xml", "application/json"})
    public void addContactInfo(ContactInfo contactInfo) {
        ...
    }*/


    /*public static void main(String[] args) throws IOException {

        HttpServer server = HttpServerFactory.create("http://localhost:9998/");
        server.start();

        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9998/helloworld");
        System.out.println("Hit return to stop...");
        System.in.read();


        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
    }*/
}
