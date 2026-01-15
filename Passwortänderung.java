import java.util.Scanner;

public class Passwortänderung {

    public static void main(String[] args) {
        String originalUserName = "Benutzer Name";
        String originalPassword = "123";
        String userName; 
        String password;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Giben Sie den Benutzername ein: ");
            userName = scanner.nextLine();
            System.out.println("Giben Sie das Passwort ein: ");
            password = scanner.nextLine();
        }
        while(!(originalUserName.equals(userName)) & !(originalPassword.equals(password)));

        while (!newPassword) {
            
        }



        scanner.close();
    }
    
}
