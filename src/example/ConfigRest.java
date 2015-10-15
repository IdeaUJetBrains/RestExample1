package example;


import test.IDEA103315;
import test.IDEA103972;
import test.IDEA107741_MB_Obsolete;
import test.IDEA112045.RestClass;
import test.IDEA114823;
import test.IDEA142939.AllinOneFile;
import test.IDEA142939.MyResource;
import test.IDEA60318.InOneFile;

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
        h.add(IDEA103972.class);
        h.add(IDEA107741_MB_Obsolete.class);
        h.add(IDEA103315.class);
        h.add(RestClass.class);
        h.add(AllinOneFile.class);
        h.add(MyResource.class);
        h.add(InOneFile.class);
        h.add(IDEA103315.class);
        return h;

    }

}
