package test.IDEA112045;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by Olga Pavlova on 10/7/2015.
 */
public interface RestInterface {
    @GET
    @Path("/testRestClass")
    String getComments(@PathParam("article_id") String articleId);
}
