import java.util.Scanner;
public class CalDayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2020) : ");
        int y = input.nextInt();
        System.out.print("Enter month: 1-12:   ");
        int m = input.nextInt();
        System.out.print("Enter day of month: 1-31 : ");
        int q = input.nextInt();
        int j = y /100;
        int k = y %100;
        int h = (q+((26*(m + 1))/10) + k + k/4 + j/4 + 5*j)%7;

        if( h == 0 ) 
            System.out.print("Saturday");
        else if ( h == 1)
            System.out.print("Sunday");
        else if ( h == 2)
            System.out.print("Monday");
        else if ( h == 3)
        System.out.print("Tuesday");
        else if ( h == 4)
            System.out.print("Wednesday");
        else if ( h == 5)
            System.out.print("thursday");
        else if ( h == 6)
            System.out.print("Friday");
        else 
            System.out.print("Error");
        

        



    
        

        
    }
    
}
