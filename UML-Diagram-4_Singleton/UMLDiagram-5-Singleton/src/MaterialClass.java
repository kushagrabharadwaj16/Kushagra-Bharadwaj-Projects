import java.util.ArrayList;
import java.util.List;
public class MaterialClass {
    private static MaterialClass instance = new MaterialClass(); // Singleton instance
    private List<MaterialClassProperty> properties = new ArrayList<>();
    private List<MaterialClass> includesPropertiesOf = new ArrayList<>();
    private List<MaterialClass> isAssembledFrom = new ArrayList<>();
    private MaterialClass() {}
    public static MaterialClass getInstance() {
        return instance;
    }
    public void addProperty(MaterialClassProperty property) {
        properties.add(property);
    }
    public void addIncludesPropertiesOf(MaterialClass materialClass) {
        includesPropertiesOf.add(materialClass);
    }
    public void addIsAssembledFrom(MaterialClass materialClass) {
        isAssembledFrom.add(materialClass);
    }
    public List<MaterialClassProperty> getProperties() {
        return properties;
    }
    public List<MaterialClass> getIncludesPropertiesOf() {
        return includesPropertiesOf;
    }
    public List<MaterialClass> getIsAssembledFrom() {
        return isAssembledFrom;
    }
}
