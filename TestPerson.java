public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("01", "john", 35);
        Person p2 = new Person("02", "Dessy", 20);
        p1.displayData();
        p2.displayData();

        p2.setName("Done");
        p2.displayData();

    }
}

class Person {
    String id;
    String name;
    int age;

    Person(String Nid, String Nname, int Nage) {
        id = Nid;
        name = Nname;
        age = Nage;
    }

    void displayData() {
        System.out.println(id + " " + name + " " + age);
    }

    void setName(String newName) {
        name = newName;
    }

    String getName() {
        return name;
    }
}
