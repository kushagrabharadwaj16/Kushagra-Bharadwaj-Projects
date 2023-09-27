import java.util.ArrayList;
import java.util.List;

public class PersonProperty {
    private String name;
    private List<PersonProperty> containedProperties;

    public PersonProperty(String name) {
        this.name = name;
        this.containedProperties = new ArrayList<>();
    }
    public void addContainedProperty(PersonProperty property) {
        containedProperties.add(property);
    }

    public List<PersonProperty> getContainedProperties() {
        return containedProperties;
    }

    public String getName() {
        return name;
    }
}
