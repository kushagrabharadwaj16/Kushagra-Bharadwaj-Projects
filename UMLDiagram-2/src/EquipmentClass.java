import java.util.ArrayList;
import java.util.List;

class EquipmentClass extends Equipment {
    private List<EquipmentClass> includedClasses;

    public EquipmentClass() {
        super();
        this.includedClasses = new ArrayList<>();
    }

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
    }
}