import java.util.ArrayList;
import java.util.List;
public class Person {
    private String name;
    private List<Personnel> personnelList;

    private static class PersonSingleton {
        private static final Person INSTANCE = new Person();
    }
    private Person() {
        this.name = "Stokes";
        this.personnelList = new ArrayList<>();
    }
    public static Person getInstance() {
        return PersonSingleton.INSTANCE;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addPersonnel(Personnel personnel) {
        personnelList.add(personnel);
    }
    public List<Personnel> getPersonnelList() {
        return personnelList;
    }
    public String getName() {
        return name;
    }
}
