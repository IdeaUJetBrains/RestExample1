package testForMe;

import javax.annotation.PostConstruct;
import javax.ws.rs.*;

@Path("/")
class Hello {
  @GET
  @Produces("wrong/mime type")
  @Consumes("another one/wrong mime")
  //Method annotated with @GET must return non-void value
  public void sayHello() {
  }

  @GET
  @POST
  @DELETE
  @PUT
  @OPTIONS
  @HEAD
  public Object test() {
    return null;
  }

  @GET
  @Produces("correct/mime+type")
  @Consumes("and+this/correct-too")
  public String sayHello2() {
    return "Hello";
  }

  public static class Foo {
    @GET
    public String sayFoo() {
      return "foo";
    }
  }

  @Path("/hello")
  public static class Bar {
    @GET public String bar() {return "";}
  }
  @Path("/hello")
  public static class Bar2 {
    @GET public String bar() {return "";}
  }

  @Path("/A")
  public static class A {}

  public static class B extends A {
    @GET public String foo() {return "";}
  }
}
