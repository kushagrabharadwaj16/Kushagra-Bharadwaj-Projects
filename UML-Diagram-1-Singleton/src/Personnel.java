import java.util.ArrayList;
import java.util.List;
public class Personnel {
    private List<PersonProperty> properties;

    private static class PersonnelSingleton {
        private static final Personnel INSTANCE = new Personnel("Walter");
        private static final Personnel INSTANCE2 = new Personnel("Walter");
    }
    Personnel(String walter) {
        this.properties = new ArrayList<>();
    }
    public static Personnel getInstance() {
        return PersonnelSingleton.INSTANCE;
    }
    public void addProperty(PersonProperty property) {
        properties.add(property);
    }
    public List<PersonProperty> getProperties() {
        return properties;
    }
    public String getName() {
        return " ";
    }
}
