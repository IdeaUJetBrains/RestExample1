package test.produceTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 11/27/2015.
 */
public class ForLocator {
    public ForLocator(String str) {
        post5(str);
    }

    @GET
    @Produces("")
    public String post5(String str) {   return str; }
}
