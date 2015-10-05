package test;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

@Path("/employee")
public class IDEA107741_MB_Obsolete {

    /**
     * HeaderParam
     *
     * @param userAgent
     * @return
     */
    @GET
    @Path("/get")
    public Response addEmployee(@HeaderParam("user-agent") String userAgent) {

        return Response.status(200)
                .entity("addEmployee is called, userAgent : " + userAgent)
                .build();

    }

    /**
     * QueryParam
     *
     * @param from
     * @param to
     * @param orderBy
     * @return
     */
    @GET
    @Path("/query")
    public Response getUsers(
            @QueryParam("from") int from,
            @QueryParam("to") int to,
            @QueryParam("orderBy") List<String> orderBy) {

        return Response
                .status(200)
                .entity("getUsers is called, from : " + from + ", to : " + to
                        + ", orderBy" + orderBy.toString()).build();

    }



    /**
     * request body
     *
     * @param request
     * @param requestBody
     * @return
     * @throws IOException
     */
    @GET
    @Path("/body")
    public Response doAThing(@Context HttpServletRequest request, InputStream requestBody) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(requestBody));
        StringBuilder out = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            out.append(line);
        }
        System.out.println(out.toString());   //Prints the string content read from input stream
        reader.close();

        return Response.ok().entity("{\"Submit\": \"Success\"}").build();

    }

}
