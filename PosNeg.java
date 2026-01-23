import java.util.Scanner;

public class PosNeg {

    /*Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative. */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the first value");
        int value1 = scanner.nextInt();
        System.out.println("please enter the second value");
        int value2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the negative parametr (Y/N) ");
        String  bool = scanner.nextLine().trim().toLowerCase(); 
        //System.out.println(bool);
        boolean negative = bool.equals("y"); 
        //System.out.println(negative);
        System.out.println(posNegative(value1, value2, negative)); 
  

    }
    
    public static boolean posNegative (int a, int b, boolean negative){

        if (negative) {
            return (a < 0 && b < 0);
        }

        else {
            return ((a < 0 && b > 0)||(a>0 &&  b<0));           
        }

    }
}
