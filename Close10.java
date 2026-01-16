

import java.util.Scanner;

public class Close10 {

    /*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number. */


    public static void main(String[] args) {

        System.out.println("Please enter sequentially two number for comparison");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt(); 
        System.out.println(closeTen(x,y)); 
        scanner.close();
        
    }

    public static int closeTen(int x,int y){
        if (Math.abs(x-10) < Math.abs(y-10)) return x;
        if (Math.abs(x-10) > Math.abs(y-10)) return y;
        else return 0;
    }
    
}
