package test.IDEA81389;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 10/7/2015.
 */
@Produces("text/plain")
@Path(value="helloOlga2")
public class A implements Letter, Case{ //<-place the cursor on the class definition: propose to move all / chosen annotations to parent or child

    @Override
    @GET  // <-here! place the cursor on an annotation: propose to move this annotation to the parent class or interface
    public void method() {  } //<-place the cursor on the method definition: propose to move all / chosen annotations to parent or child


    @Override
    public void methodCase() {

    }
}
