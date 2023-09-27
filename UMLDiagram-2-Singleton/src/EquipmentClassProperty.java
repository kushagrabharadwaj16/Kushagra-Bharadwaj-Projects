public class EquipmentClassProperty {
    private static EquipmentClassProperty instance;

    private EquipmentClassProperty() {

    }

    public static EquipmentClassProperty getInstance() {
        if (instance == null) {
            instance = new EquipmentClassProperty();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Equipment Class Property Object";
    }
}
