package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
public class IDEA103926 {

    @GET
    @Produces("image/jpeg")
    @Path("{skuImagePath:.*}")
    @SuppressWarnings("EjbProhibitedPackageUsageInspection")
    public String getSkuImageData(@PathParam("{skuImagePath}") String skuImagePath) { //here should be warning
        //...
        return "bla";
    }
}
