import java.util.List;
public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("Mathew");
        Personnel personnel1 = new Personnel("Stokes");
        Personnel personnel2 = new Personnel("John");
        Personnel personnel3 = new Personnel("Walter");

        PersonProperty property1 = new PersonProperty("Perseverance");
        PersonProperty property2 = new PersonProperty("Punctual");
        PersonProperty property3 = new PersonProperty("Proactive");

        person.addPersonnel(personnel1);
        person.addPersonnel(personnel2);
        person.addPersonnel(personnel3);

        personnel1.addProperty(property1);
        personnel2.addProperty(property2);
        personnel3.addProperty(property3);

        System.out.println(person.getName() + " has personnel:");
        List<Personnel> personnelList = person.getPersonnelList();
        for (int i = 0; i < personnelList.size(); i++)
        {
            Personnel personnel = personnelList.get(i);
            System.out.println("- " + personnel.getName());}
        System.out.println(personnel1.getName() + " has properties:");

        List<PersonProperty> propertyList1 = personnel1.getProperties();
        for (int i = 0; i < propertyList1.size(); i++) {
            PersonProperty property = propertyList1.get(i);
            System.out.println("- " + property.getName());}
        System.out.println(personnel2.getName() + " has properties:");
        List<PersonProperty> propertyList2 = personnel2.getProperties();
        for (int i = 0; i < propertyList2.size(); i++) {
            PersonProperty property = propertyList2.get(i);
            System.out.println("- " + property.getName());}
        System.out.println(personnel3.getName() + " has properties:");
        List<PersonProperty> propertyList3 = personnel3.getProperties();
        for (int i = 0; i < propertyList3.size(); i++) {
            PersonProperty property = propertyList3.get(i);
            System.out.println("- " + property.getName());
        }
    }
}