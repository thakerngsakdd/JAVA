public class Lab202 {

    public static void main(String[] args) {
        int day = 6;
        int week = 7;
        int x = ((day+10)%week);
        if(x == 1){
            System.out.println("Monday");
        }
        if(x == 2){
            System.out.println("Tuesday");
        }

        if(x == 3){
            System.out.println("Wednesday");
        }

        if(x == 4){
            System.out.println("thursday");
        }

        if(x == 5){
            System.out.println("Friday");
        }
        if(x == 6){
            System.out.println("Saturday");
        }
        if(x == 7){
            System.out.println("Sunday");
        }


    }

}

    

