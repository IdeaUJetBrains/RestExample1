package test.IDEA112045;

import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 10/7/2015.
 */
@Path(value="helloOlga1")
public class RestClass implements RestInterface{
    //The generated code is OK and deployed Ok:
    //http://localhost:8080/RestExample1_war_exploded/helloOlga1/testRestClass

    @Override
    public String getComments(String articleId) {
        return "Hello, RestClass with the implemented method " + articleId;
    }
}
