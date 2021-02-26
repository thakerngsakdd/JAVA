import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int num = 5;
        int[] arr = new int[num];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 number : ");
        //วนรับค่า
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();     
        }
        System.out.print("Your number are: ");

        for (int i = 0; i < num; i++){
            System.out.print(arr[i] + " ");    
        }
        System.out.println(" ");

        //max
        int max = arr[0];
        for(int i = 0; i<num;++i){
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println("The Maximum number is : "+max);
        
        //min
        int min =arr[0];
        for(int i = 0; i<num; i++){
            if(min>arr[i])
            min=arr[i];
        }
        System.out.println("The Minimum number is : "+min);
    } 
}