import java.util.Scanner;

public class Validation  {

    Training_Plan training_plan = new Training_Plan();
    Athlete athlete = new Athlete();
    Display display = new Display();
    Competition_weight competition_weight = new Competition_weight();

    Scanner s = new Scanner(System.in);

   final String[] category = competition_weight.getCategory();


   void category_weight_input()
   {
       System.out.print("Please enter your competition weight category: ");
       String input = s.nextLine();

       boolean flag = false;

       for(int i = 0, l = category.length; i < l; i++)
       {
           if(category[i].equalsIgnoreCase(input))
           {
               flag = true;
           }
       }

       if(!flag)
       {
           category_weight_input();
       }
   }



     char apply_private_hours()
    {
        display.private_hours();

        String input = s.next().toLowerCase();
        char choice = input.charAt(0);

        if(!(choice == 'y') || !(choice == 'n'))
        {
            System.out.println("\nPlease only enter 'y' or 'n'\n");
            apply_private_hours();
        }

        return choice;
    }




}
