package test;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Olga Pavlova on 9/28/2015.
 */
@XmlType(propOrder = {"wrong", "id"})
public class Issue {
    public Issue() {
    }

    @XmlAttribute
    public String getId() {
        return "some id";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @XmlAttribute(name ="aaa")
    public String getUrl() {
        return "some url";
    }


}
