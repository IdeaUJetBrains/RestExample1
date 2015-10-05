package example;


import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.ClientConfig;
//import com.sun.jersey.core.util.MultivaluedMapImpl;
//import com.sun.jersey.json.impl.provider.entity.JSONListElementProvider;
//import com.sun.jersey.json.impl.provider.entity.JSONObjectProvider;
import org.springframework.boot.json.JsonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonSimpleJsonParser;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.concurrent.Future;
//import com.sun.jersey.api.client.WebResource;

public class HelloWorldClient {
  final static String url3JSON = "http://localhost:8080/RestApp/helloOlga/ext3"; //json
  final static String urlHTML = "http://localhost:8080/RestApp/helloOlga/ext5"; //html
  final static String url12JSON = "http://localhost:8080/RestApp/helloOlga/ext12"; //json



  public HelloWorldClient() {
    super();
  }


  public static void main(String[] args) {
    Client webClient = Client.create();
    webClient.getProperties().put(ClientConfig.PROPERTY_FOLLOW_REDIRECTS, true);
    webClient.setConnectTimeout(3000);

    System.out.println("text/html: " + urlHTML);
    AsyncWebResource webResource1 = webClient.asyncResource(urlHTML);
    Future<String> response1 = webResource1.accept("text/html").get(String.class);
    System.out.println(response1);

    System.out.println("json get: " + getBaseURI());
    WebResource webResource = webClient.resource( getBaseURI() );
    String response = webResource.get(String.class);
    System.out.println(response);




    //====================================================================
       /* response = webResource.entity(new Object(), MediaType.APPLICATION_JSON_TYPE).get(String.class);
        System.out.println(response);*/

    //webResource.entity(new Object(), MediaType.APPLICATION_JSON_TYPE)
    //JSONListElementProvider jsonPr = new JSONListElementProvider();

    System.out.println("json post: " + url12JSON);
    WebResource webResource2 = webClient.resource( url12JSON );
    String res = webResource2.post(String.class);
    System.out.println(res );

    webResource2.put( ClientResponse.class, "la la la"); ///??????
    System.out.println( webClient.resource( url12JSON ).post(String.class) );

    //entity
    System.out.println("entity: " );
    ClientResponse clRes = webResource2.get(ClientResponse.class);
    String entity = clRes.getEntity(String.class);

    System.out.println(  );


    //=====================================================

    //String response3 = webResource2.entity(fgdf, MediaType.TEXT_PLAIN_TYPE).get(String.class);


    //JsonJsonParser jsonParser = new JsonJsonParser();
    //System.out.println(jsonParser.parseList(res).contains("json F111"));
        /*webResource2.entity( MediaType.APPLICATION_JSON_TYPE).delete();
        System.out.println("json post-delete");
        System.out.println( webResource2.post(String.class) );*/


/*

        System.out.println("adding params: " );
        WebResource resource = webClient.resource("http://localhost:8080/RestApp/helloOlga/sayHello");
        MultivaluedMap queryParams = new MultivaluedMapImpl();
        queryParams.add("name", "SUPER!!!");
        String re = resource.queryParams(queryParams).get(String.class);
        System.out.println(re );
*/

  }

  private static URI getBaseURI() {
    return UriBuilder.fromUri(url3JSON).build();
  }
}
