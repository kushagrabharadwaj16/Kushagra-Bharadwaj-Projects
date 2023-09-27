import java.util.List;

public class Main {
    public static void main(String[] args) {
        MaterialClass mat1Class = MaterialClass.getInstance();
        MaterialDefinition mat1Definition = MaterialDefinition.getInstance();
        MaterialLot mat1Lot = MaterialLot.getInstance();

        mat1Lot.setMaterialDefinition(mat1Definition);
        
        mat1Class.addProperty(new MaterialClassProperty("New Property", "New Description"));
        mat1Definition.addProperty(new MaterialDefinitionProperty("New Property", "New Value"));
        mat1Lot.addProperty(new MaterialLotProperty());

        List<MaterialClassProperty> mat1ClassProperties = mat1Class.getProperties();
        for (MaterialClassProperty property : mat1ClassProperties) {
            System.out.println("MAT1 Class Property: " + property.getName() + " - " + property.getDescription());
        }

        List<MaterialDefinitionProperty> mat1DefinitionProperties = mat1Definition.getProperties();
        for (MaterialDefinitionProperty property : mat1DefinitionProperties) {
            System.out.println("MAT1 Definition Property: " + property.getName() + " - " + property.getValue());
        }

        List<MaterialLotProperty> mat1LotProperties = mat1Lot.getProperties();
        for (MaterialLotProperty property : mat1LotProperties) {
            System.out.println("MAT1 Lot Property: Contains - " + property.getContains().size() + " items");
            System.out.println("MAT1 Lot Property: Has Values Of - " + property.getHasValuesOf().size() + " items");
        }
    }
}
