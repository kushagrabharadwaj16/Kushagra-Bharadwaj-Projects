import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        person.setName("Mathew");

        Personnel personnel1 = new Personnel("Stokes");
        Personnel personnel2 = new Personnel("John");
        Personnel personnel3 = new Personnel("Walter");

        personnel1 = Personnel.getInstance();
        personnel1.addProperty(new PersonProperty("Perseverance"));

        personnel2 = Personnel.getInstance();
        personnel2.addProperty(new PersonProperty("Punctual"));

        personnel3 = Personnel.getInstance();
        personnel3.addProperty(new PersonProperty("Proactive"));

        person.addPersonnel(personnel1);
        person.addPersonnel(personnel2);
        person.addPersonnel(personnel3);

        System.out.println(person.getName() + " has personnel:");
        List<Personnel> personnelList = person.getPersonnelList();
        for (Personnel personnel : personnelList) {
            System.out.println("- " + personnel.getName());
        }
        for (Personnel personnel : personnelList) {
            System.out.println(personnel1.getName() + " has properties:");
            List<PersonProperty> propertyList = personnel1.getProperties();
            for (PersonProperty property : propertyList) {
                System.out.println("- " + property.getName());
            }
        }
        for (Personnel personnel: personnelList) {
            System.out.println(personnel2.getName() + " has properties:");
            List<PersonProperty> propertyList2 = personnel2.getProperties();
            for (PersonProperty property : propertyList2) {
                System.out.println("- " + property.getName());

            }
        }
        for (Personnel personnel : personnelList) {
            System.out.println(personnel3.getName() + " has properties:");
            List<PersonProperty> propertyList3 = personnel3.getProperties();
            for (PersonProperty property : propertyList3) {
                System.out.println("- " + property.getName());
            }
        }
    }
}



