
public class Main {
    public static void main(String[] args) {
        Equipment equipment1 = new Equipment();
        Equipment equipment2 = new Equipment();

        EquipmentClass equipmentClass1 = new EquipmentClass();
        EquipmentClass equipmentClass2 = new EquipmentClass();

        EquipmentClassProperty equipmentProperty = new EquipmentClassProperty();
        EquipmentClassProperty equipmentClassProperty = new EquipmentClassProperty();

        equipment1.addEquipment(equipment2);
        equipment1.addProperty(equipmentProperty);
        equipment1.addProperty(equipmentClassProperty);

        equipmentClass1.addIncludedClass(equipmentClass2);
        
        equipment1.displayProperties();
        equipment1.displayEquipment();
        equipmentClass1.displayIncludedClasses();
    }
}