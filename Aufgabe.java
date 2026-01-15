import java.util.Scanner;

public class Aufgabe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int number1 = scanner.nextInt();
        System.out.println("Enter a number 2");
        int number2 = scanner.nextInt();

        System.out.println("you entered: "+number1 + " and " + number2);

        //absolute value 
        int absoluteValue = Math.abs(number1 + number2); 
        System.out.println("absolute value " + absoluteValue);



        scanner.close();

        
    }
}