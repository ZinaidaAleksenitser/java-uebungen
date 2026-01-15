
import java.time.DayOfWeek;
import java.time.LocalDate;

public class SleepIn {

public static void main(String[] args) 

{
    LocalDate currentDate = LocalDate.now(); 
    DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

    //System.out.println(dayOfWeek);

    if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY ) {
        System.out.println( "Go home.");
    }
    else System.out.println("Work"); 
}

}