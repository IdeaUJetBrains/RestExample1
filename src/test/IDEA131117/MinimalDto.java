package test.IDEA131117;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
@XmlRootElement(name = "dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class MinimalDto {

    private final String value;

    public MinimalDto(String value) {
        this.value = value;
    }

    public String getValue() { //Bug: the getter is marked as "is never used" despite its responsibility of serializing.
        return value;
    }
}
