import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int num_array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        Scanner input = new Scanner(System.in);
        System.out.println("Please Input 'H' or 'V'");
        System.out.print("Input your choice: ");
        String choice = input.nextLine();
        Summary(choice.toUpperCase(), num_array);
    }

    private static void Summary(String choice, int[][] num_array) {
        if (choice.equals("V")) {

            for (int i = 0; i <= num_array.length; i++) {
                int sum = 0;
                for (int j = 0; j < num_array.length; j++) {
                    sum = sum + num_array[j][i];
                }
                System.out.print(sum + " ");
            }
        } else if (choice.equals("H")) {
            for (int i = 0; i < num_array.length; i++) {
                int sum = 0;
                for (int j = 0; j <= num_array.length; j++) {
                    sum = sum + num_array[i][j];

                }
                System.out.print(sum + " ");
            }
        }
    }
}