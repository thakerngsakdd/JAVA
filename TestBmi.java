
//6130260547 เถกิงศักดิ์ ดำรงมั่น
import java.util.Scanner;

public class TestBmi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your name : ");
        String name = input.next();

        System.out.print("Input your age  : ");
        int age = input.nextInt();

        System.out.print("Input your weight : ");
        double weight = input.nextDouble();

        System.out.print("Input your height : ");
        double height = input.nextDouble();

        Bmi Bmi2 = new Bmi(name, age, weight, height);
        System.out.println("------------------------------");
        System.out.printf("Your name : %s\n", name);
        System.out.printf("Your age  : %d\n", age);
        System.out.printf("Your BMI  : %.2f\n", Bmi2.getBmi());

    }

}
