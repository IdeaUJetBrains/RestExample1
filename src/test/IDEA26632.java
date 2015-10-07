package test;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;

/**
 * Created by Olga Pavlova on 10/7/2015.
 */
public class IDEA26632 {
    /**
     * Adds a single tag to a build
     * @param buildLocator build locator
     * @param tagName name of a tag to add
     */
    @POST
    @Path("/{buildLocator}/tags/")
    @Consumes({"text/plain"})
    public void addTag(@PathParam("buildLocator") String buildLocator, String tagName, @Context HttpServletRequest request) {
        //...
    }
}
