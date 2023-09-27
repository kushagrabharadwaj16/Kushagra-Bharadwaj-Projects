import java.util.ArrayList;
import java.util.List;
public class EquipmentClass {
    private static EquipmentClass instance;
    private List<EquipmentClass> includedClasses;
    private EquipmentClass() {
        includedClasses = new ArrayList<>();
    }public static EquipmentClass getInstance() {
        if (instance == null) {
            instance = new EquipmentClass();
        }
        return instance;}
    public void addIncludedClass(EquipmentClass includedClass) {
        includedClasses.add(includedClass);
    }
    public void displayIncludedClasses() {
        System.out.println("Included Classes:");
        for (EquipmentClass includedClass : includedClasses) {
            System.out.println("- " + includedClass);
        }
    }
    @Override
    public String toString() {
        return "Equipment Class Object";
    }}
