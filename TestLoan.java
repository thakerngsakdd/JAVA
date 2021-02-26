
// 6130260547 เถกิงศักดิ์ ดำรงมั่น Sec 870
import java.util.Scanner;

public class TestLoan {

    public static void main(String[] args) {

        Loan loan1 = new Loan();

        Scanner input = new Scanner(System.in);
        System.out.print("Input interrest rate : ");
        double rate = input.nextDouble();

        System.out.print("Input number of year : ");
        int year = input.nextInt();

        System.out.print("Input amount : ");
        double amount = input.nextDouble();
        // --------create object-----------
        Loan loan2 = new Loan(rate, year, amount); // contructor method
        System.out.printf("Loan was created on %s\n", loan2.getLoanDate().toString());
        System.out.printf("The monthly payment is %.2f\n", loan2.getMonthlyPaymet());
        System.out.printf("The total payment is %.2f'\n", loan2.getTotalPayment());
        input.close();
        // ---------end create object-------
    }

}
