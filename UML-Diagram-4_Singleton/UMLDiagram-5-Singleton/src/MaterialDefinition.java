import java.util.ArrayList;
import java.util.List;
public class MaterialDefinition {
    private static MaterialDefinition instance = new MaterialDefinition(); // Singleton instance
    private List<MaterialDefinitionProperty> properties = new ArrayList<>();
    private List<MaterialClass> isMemberOf = new ArrayList<>();
    private List<MaterialDefinition> isAssembledFrom = new ArrayList<>();
    private MaterialDefinition() {}
    public static MaterialDefinition getInstance() {
        return instance;
    }
    public void addProperty(MaterialDefinitionProperty property) {
        properties.add(property);
    }
    public void addIsMemberOf(MaterialClass materialClass) {
        isMemberOf.add(materialClass);
    }
    public void addIsAssembledFrom(MaterialDefinition materialDefinition) {
        isAssembledFrom.add(materialDefinition);
    }
    public List<MaterialDefinitionProperty> getProperties() {
        return properties;
    }

    public List<MaterialClass> getIsMemberOf() {
        return isMemberOf;
    }
    public List<MaterialDefinition> getIsAssembledFrom() {
        return isAssembledFrom;
    }
}
