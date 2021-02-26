// 6130260547 เถกิงศักดิ์ ดำรงมั่น Sec 870

public class Encapsulation {
    private String name;
    private int roll;
    private int age;

    // ----------getter method------------
    public String getName() {
        return name; // this.name
    }

    public int getRoll() {
        return roll;
    }

    public int getAge() {
        return age;
    }

    // ----------setter method -------

    public void setName(String newName) {
        name = newName;
    }

    public void setRoll(int newRoll) {
        roll = newRoll;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

}
