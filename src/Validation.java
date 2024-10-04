import java.util.Scanner;

public class Validation  {

    Training_Plan training_plan = new Training_Plan();
    Athlete athlete = new Athlete();
    Display display = new Display();
    Competition_weight competition_weight = new Competition_weight();

    Scanner s = new Scanner(System.in);

     char apply_private_hours()
    {
        display.private_hours();

        String input = s.next().toLowerCase();
        char choice = input.charAt(0);

        if(!(choice == 'y') || !(choice == 'n'))
        {
            apply_private_hours();
        }

        return choice;
    }




}
