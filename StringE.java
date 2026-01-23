import java.util.Scanner;

public class StringE {

    /*Return true if the given string contains between 1 and 3 'e' chars. */
    public static void main(String[] args) {

        System.out.println("Please enter text");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(inhaltE(str));
        scanner.close();

    }

    public static boolean inhaltE(String str) {

        int index = 0;
        char[] letters = str.toCharArray();

        for (char c : letters) {

            if (c == 'e' || c == 'E')
                index++;
        }

        if (index > 0 && index < 4)
            return true;

        else
            return false;
    }

}
