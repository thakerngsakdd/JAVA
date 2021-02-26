import java.util.Scanner;
import java.util.Arrays;

public class inputnameandage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = new String[5]; // รับค่าชื่อคนเป็น string
        int[] age = new int[5];// รับค่าเป็นอายุ int
        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter names: ");
            name[i] = input.next();// ชื่อเก็บไว้ในตัวแปล i
            System.out.print("Enter Age: ");
            age[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(age));
        System.out.print("Who you want to know age ? : ");
        String selectName = input.next();
        for (int i = 0; i < name.length; i++) {
            if (selectName.equals(name[i])) {
                System.out.println(age[i]);
                break;
            }
        }

    }

}
