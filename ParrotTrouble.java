import java.util.Scanner;

public class ParrotTrouble {

    /*
     * We have a loud talking parrot. The "hour" parameter is the current hour time
     * in the range 0..23. We are in trouble if the parrot is talking and the hour
     * is before 7 or after 20. Return true if we are in trouble.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = userInputHour(scanner);
        boolean talking = userInputParrot(scanner);

        System.out.println(parrotTrouble(talking, hour));
        scanner.close();

    }

    public static boolean parrotTrouble(boolean talking, int hour) {

        if (!talking)
            return false;
        if (talking && hour < 7 || talking && hour > 20)
            return true;
        else
            return false;
    }

    public static int userInputHour(Scanner scanner) {

        String line;

        while (true) {
            System.out.println("What time is it now?");
            line = scanner.nextLine().trim();

            try {
                int hour = Integer.parseInt(line);
                if (hour < 0 || hour > 24) {
                    System.out.println("please enter the correct time");
                    continue;
                }
                return hour;
            } catch (NumberFormatException e) {
                System.out.println("please enter 0-23");
            }

        }
    }

    public static boolean userInputParrot(Scanner scanner) {
        String parrot;

        while (true) {
            System.out.println("Is the parrot talking? Y/N");
            parrot = scanner.nextLine().trim().toLowerCase();
            switch (parrot) {
                case "y":

                    return true;

                case "n":

                    return false;

                default:
                    System.out.println("please enter 'y' or 'n'");

            }
        }

    }

}
