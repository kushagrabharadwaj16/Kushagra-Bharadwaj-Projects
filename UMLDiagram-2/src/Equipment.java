import java.util.ArrayList;
import java.util.List;
class Equipment {
    private List<Equipment> equipmentList;
    public List<EquipmentClassProperty> properties;
    public Equipment() {
        this.equipmentList = new ArrayList<>();
        this.properties = new ArrayList<EquipmentClassProperty>();
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
    }public void displayEquipment() {
        System.out.println("Equipment List:");
        for (Equipment equipment : equipmentList) {
            System.out.println("- " + equipment);
        }
    }@Override
    public String toString() {
        return "Equipment Object";
    }
}