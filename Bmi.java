//6130260547 เถกิงศักดิ์ ดำรงมั่น
public class Bmi {
    private String name;
    private int age;
    private double weight;
    private double height;
    private int bmi;

    public Bmi(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBmi() {
        double centimaterTomate = height / 100;
        double bmi = this.weight / (centimaterTomate * centimaterTomate);
        if (bmi >= 30)
            System.out.print("Your figure : Fat\n");
        else if (bmi >= 25.0)
            System.out.print("Your figure : Obesity\n");
        else if (bmi >= 23.0)
            System.out.print("Your figure : Over weight\n");
        else if (bmi >= 18.5)
            System.out.print("Your figure : slim\n");
        else if (bmi <= 18.5)
            System.out.print("Your figure : thin\n");
        else
            System.out.print("Eerror");
        return bmi;

    }

}
