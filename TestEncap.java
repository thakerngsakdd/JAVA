// 6130260547 เถกิงศักดิ์ ดำรงมั่น Sec 870

public class TestEncap {
    public static void main(String[] args) {
        // สร้าง object
        // ชื่อ Class-- ชื่อ object = new ชื่อ Class()
        Encapsulation obj = new Encapsulation();
        obj.setName("Thakerngsak");
        obj.setRoll(7);
        obj.setAge(21);

        // Displaying values
        System.out.println("My name is : " + obj.getName());
        System.out.println("My roll is : " + obj.getRoll());
        System.out.println("My age  is : " + obj.getAge());
    }

}
