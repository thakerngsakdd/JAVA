import java.util.Scanner;
import java.util.Arrays;

public class SumArrayClass {
    public static void main(String[] args) {
        int[][] num_arry = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        Scanner input = new Scanner(System.in);
        System.out.print("Input your choice : ");
        String choice = input.next();
        summary(choice, num_arry);
    }

    private static void summary(String choose, int[][] num) {
        if (choose.equals("V") || choose.equals("v")) {

            for (int i = 0; i <= num.length; i++) {
                int sum = 0;
                for (int j = 0; j < num.length; j++) {
                    sum = sum + num[j][i];

                }
                System.out.print(sum + " ");

            }
        } else if (choose.equals("H") || choose.equals("h")) {
            for (int i = 0; i < num.length; i++) {
                int sum = 0;
                for (int j = 0; j <= num.length; j++) {
                    sum = sum + num[i][j];

                }
                System.out.print(sum + " ");
            }
        }

    }
}
