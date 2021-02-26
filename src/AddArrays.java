public class AddArrays {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] b = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                count = a[i][j] + b[i][j];
                System.out.print(count + " ");
            }
            System.out.println();
            count = 0;
        }
    }

}
