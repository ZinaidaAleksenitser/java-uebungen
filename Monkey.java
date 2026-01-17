import java.util.Scanner;

public class Monkey {

    /*
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
     * if each is smiling. We are in trouble if they are both smiling or if neither
     * of them is smiling. Return true if we are in trouble.
     * 
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean aSmile, bSmile;
        aSmile = requestMonkeyStatus("MonkeyA", scanner);
        bSmile = requestMonkeyStatus("MonkeyB", scanner);

        System.out.println(monkeyTrouble(aSmile, bSmile));

        scanner.close();

    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile && bSmile)
            return true;
        else if (!aSmile && !bSmile)
            return true;
        else
            return false;
    }

    public static boolean userAnswerVerification(String input) {
        boolean userAnswer;

        switch (input) {
            case "yes":
                userAnswer = true;
                break;

            case "no":
                userAnswer = false;
                break;

            default:
                throw new IllegalArgumentException("The answer is not recognized");

        }

        return userAnswer;

    }

    public static boolean requestMonkeyStatus(String name, Scanner scanner) {
        while (true) {

            System.out.println("Is the monkey " + name + " smiling? (yes/no)");
            String input = scanner.nextLine().trim().toLowerCase();
            try {
                return userAnswerVerification(input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
