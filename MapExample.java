import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a new HashMap with generics
        Map<String, Person> people = new HashMap<>();

        // Create some Person objects
        Person joe = new Person("joe", 25);
        Person monica = new Person("monica", 31);
        Person rachel = new Person("David", 22);

        // Put the Person objects into the map
        people.put("joe", joe);
        people.put("monica", monica);
        people.put("David", rachel);

        // Get a Person object from the map
        Person person = people.get("monica");
        System.out.println("monica's age is " + person.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}