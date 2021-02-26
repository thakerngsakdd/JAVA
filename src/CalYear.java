import java.util.Scanner;
public class CalYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Year : ");
        int year = input.nextInt();
        int y = year %12;
        switch(y){
            case 1 :
            System.out.println("This year is : ระกา");break;
            case 2 :
            System.out.println("This year is : จอ");break;
            case 3 :
            System.out.println("This year is : กุน");break;
            case 4 :
            System.out.println("This year is : ชวด");break;
            case 5 :
            System.out.println("This year is : ฉลู");break;
            case 6 :
            System.out.println("This year is : ขาล");break;
            case 7 :
            System.out.println("This year is : เถาะ");break;
            case 8 :
            System.out.println("This year is : มะโรง");break;
            case 9 :
            System.out.println("This year is : มะเส็ง");break;
            case 10:
            System.out.println("This year is : มะเมีย");break;
            case 11:
            System.out.println("This year is : มะแม");break;
            case 12 :
            System.out.println("This year is : วอก");break;
            default :
            System.out.println("Error");
        }
    }
    
}
