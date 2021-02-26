import java.util.Scanner;
public class CalDay {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter today's day : ");
    int d = input.nextInt();
    System.out.print("Enter the number of days since today  : ");
    int n = input.nextInt();
    int f = (d+n) %7;
    switch(f){
        case 0 :
        System.out.println("The future day is Sunday");break;
        case 1 :
        System.out.println("The future day is Monday");break;
        case 2 :
        System.out.println("The future day is Tuesday");break;
        case 3 :
        System.out.println("The future day is Wednesday");break;
        case 4 :
        System.out.println("The future day is thursday");break;
        case 5 :
        System.out.println("The future day is Friday");break;
        case 6 :
        System.out.println("The future day is Saturday");break;
        default: System.out.println("Error");
    }
}
    
}
