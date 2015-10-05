package test.IDEA60318;

import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
public class MyResource{

    @Path("/sub/{subparam}") //Bug: the 'template is never used' error is shown, but it is used in SubResource
    public SubResource getSubResource(){
        return new SubResource();
    }

}