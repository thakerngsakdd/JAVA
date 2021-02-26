public class Assignment6 {
    public static void main(String[] args) {
        
        String str = "Example of string method"; int len = str.length();
        System.out.println("Length of " + str + " is : " + len);
         

        System.out.println("My name is ".concat("Thakerngsak")); */

        
        String s = "Strings are arrays of charecter"; char result = s.charAt(9);
        System.out.println(result);
         

        
        char[] Str1 = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
        String Str2 = ""; Str2 = Str2.copyValueOf(Str1);
        System.out.println("Returned String : " + Str2);
         

        
        double num1 = -10.675; double num2 = 9.70;
        System.out.println(Math.ceil(num1)); System.out.println(Math.ceil(num2));
        System.out.println(Math.floor(num1)); System.out.println(Math.floor(num2));
         

        
        double x = 11.635; double y = 2.76;
        
        System.out.printf("The value of e is %.4f%n", Math.PI);
        System.out.printf("pow(%.3f, %.3f) is  %.3fn", x, y, Math.pow(x, y));
         

        double sq1 = 11.635;
        double sq2 = 36.00;

        System.out.printf("sqrt(%.2f) is %.2f%n", sq1, Math.sqrt(sq1));
        System.out.printf("sqrt(%.2f) is %.2f%n", sq2, Math.sqrt(sq2));

    }

}
