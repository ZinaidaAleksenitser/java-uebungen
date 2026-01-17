import java.util.Scanner;

public class EveryNth {

    /*
     * Given a non-empty string and an int N, return the string made starting with
     * char 0, and then every Nth char of the string. So if N is 3, use char 0, 3,
     * 6, ... and so on. N is 1 or more.
     */

    public static void main(String[] args) {
        System.out.println("Please enter a line ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Please enter the number");
        int i = scanner.nextInt();
        System.out.println(parsedLine(str, i));
        scanner.close();
    }

    public static String parsedLine(String str, int n) {

        String modified = "";

        if (str.isEmpty()) {
            return "there is not text to modify";
        }
        for (int i = 0; i <= (str.length() - 1); i += n) {

            modified = modified + str.charAt(i);

        }

        return modified;

    }

}
