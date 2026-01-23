public class Unterrichtaufgabe {

    /*Folgende Aufgabenstellung:

Erstellen Sie eine Variable 'alter' mit dem Wert 10.
Daraufhin wird die String-Variable 'alterString' mit "jung" gefüllt
und beides ausgegeben.

Danach wird 'alter' der Wert 80 zugewiesen und die 'alterString' mit
"alt" gefüllt und beides ausgegeben.

Bitte zuerst den Pseudocode und dann das JAVA Programm erstellen */

public static void main(String[] args) {
    int alter = 10; 
    String alterString = "jung"; 

    System.out.println("Age: " + alter + '\n' + "Status: " + alterString);

    alter = 80; 
    alterString = "alt"; 

    System.out.println("Age: " + alter + '\n' + "Status: " + alterString);
}


    
}
