package test.produceTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.TEXT_XML)
@Path(value = "/produces")
public class ProducesTest {

    public String htmlstr = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "\n" +
            "<h1>My First Heading</h1>\n" +
            "\n" +
            "<p>My first paragraph.</p>\n" +
            "\n" +
            "</body>\n" +
            "</html>";

    @GET
    @Produces("text/html")
    @Path("/html")
    public String post1() {   return htmlstr;  }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/plain")
    public String post2() {   return htmlstr;  }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/html1")
    public String post3(){   return htmlstr;  }

    @GET
    @Produces({MediaType.TEXT_XML, MediaType.TEXT_HTML, MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    @Path("/xml")
    public String post4() {   return htmlstr;  }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_XHTML_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    @Path("/xml1")
    public String post5() {   return htmlstr;  }


    @GET
    @Produces(MediaType.APPLICATION_XHTML_XML)
    @Path("/1")
    public String post6() {   return htmlstr;  }


    @GET
    @Produces()
    @Path("/html")
    public String post11() {   return htmlstr;  }


//Локаторы дочерних ресурсов -  методы, служащие для уточнения того,
// какой ресурс должен обрабатывать входящий запрос
    @Path(value="/{contactName}/ch")
    public ForLocator getContactDepartment(@PathParam(value="contactName")
                                                   String contactName) {
        ForLocator lock = new ForLocator(contactName);
        return lock;
    }
}
