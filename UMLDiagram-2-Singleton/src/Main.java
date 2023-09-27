public class Main {
    public static void main(String[] args) {
        Equipment equipment1 = Equipment.getInstance();
        Equipment equipment2 = Equipment.getInstance();

        EquipmentClass equipmentClass1 = EquipmentClass.getInstance();
        EquipmentClass equipmentClass2 = EquipmentClass.getInstance();

        EquipmentClassProperty equipmentProperty = EquipmentClassProperty.getInstance();
        EquipmentClassProperty equipmentClassProperty = EquipmentClassProperty.getInstance();

        equipment1.addEquipment(equipment2);
        equipment1.addProperty(equipmentProperty);
        equipment1.addProperty(equipmentClassProperty);

        equipmentClass1.addIncludedClass(equipmentClass2);

        equipment1.displayProperties();
        equipment1.displayEquipment();
        equipmentClass1.displayIncludedClasses();
    }
}
