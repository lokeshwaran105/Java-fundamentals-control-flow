// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if(num == 0){
            System.out.println("Zero");
        }
        else if(num > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        
        
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid number");
        }
        
        for(int i=1; i<=num; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        int i = num;
        
        while(i>0){
            System.out.print(i-- + " ");
        }

	System.out.println();
        
        int j = 1;
        
        do{
            System.out.print(j++ + " ");
        }while(j<=3);
    }
}