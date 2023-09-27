import java.util.ArrayList;
import java.util.List;
public class Equipment {
    private static Equipment instance;
    private List<Equipment> equipmentList;
    public List<EquipmentClassProperty> properties;

    private Equipment() {
        equipmentList = new ArrayList<>();
        properties = new ArrayList<>();
    }
    public static Equipment getInstance() {
        if (instance == null) {
            instance = new Equipment();
        }
        return instance;
    }
    public void addEquipment(Equipment equipment) {
        equipmentList.add(equipment);
    }
    public void addProperty(EquipmentClassProperty property) {
        properties.add(property);
    }
    public void displayProperties() {
        System.out.println("Equipment Properties:");
        for (EquipmentClassProperty property : properties) {
            System.out.println("- " + property);
        }
    }
    public void displayEquipment() {
        System.out.println("Equipment List:");
        for (Equipment equipment : equipmentList) {
            System.out.println("- " + equipment);
        }
    }

    @Override
    public String toString() {
        return "Equipment Object";
    }
}
