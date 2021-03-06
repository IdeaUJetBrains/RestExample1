package example;


import test.IDEA103315;
import test.IDEA112045.RestClass;
import test.IDEA114823;
import test.IDEA119747_IDEA130052.AsyncResource;
import test.IDEA119747_IDEA130052.AsyncResource1;
import test.IDEA119747_IDEA130052.ShouldNotBeDeployed;
import test.IDEA142939.AllinOneFile;
import test.IDEA142939.MyResource;
import test.IDEA60318.InOneFile;
import test.inheritanceTest.Child2;
import test.inheritanceTest.ImpInterfaceClass;
import test.inheritanceTest.Interface1;
import test.produceTest.ConsumesTest;
import test.produceTest.ProducesChild1;
import test.produceTest.ProducesTest;
import test.produceTest.ProducesTestChild;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Olga Pavlova on 22/09/2015.
 */
@ApplicationPath("res")
public class ConfigRest  extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(HelloWorld.class);
        h.add(IDEA114823.class);
        //h.add(IDEA103972.class);
        //h.add(IDEA107741_MB_Obsolete.class);
        h.add(IDEA103315.class);
        h.add(RestClass.class);
        h.add(AllinOneFile.class);
        h.add(MyResource.class);
        h.add(InOneFile.class);
        h.add(IDEA103315.class);
        h.add(ProducesTestChild.class);
        h.add(ProducesTest.class);
        h.add(ProducesChild1.class);
        h.add(ImpInterfaceClass.class);
        h.add(Child2.class);
        h.add(ConsumesTest.class);
        h.add(AsyncResource.class);
        h.add(AsyncResource1.class);
        h.add(ShouldNotBeDeployed.class);

        return h;

    }

}
