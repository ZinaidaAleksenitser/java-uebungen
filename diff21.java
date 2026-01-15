import java.util.Scanner;

public class diff21 {

    public static void main(String[] args) {
        

    final int number = 21;
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Enter the number");
    int number2 = scanner.nextInt(); 
    System.out.println("Absolute difference: " + Math.abs(number2 - number));
    
    scanner.close();

}
}
