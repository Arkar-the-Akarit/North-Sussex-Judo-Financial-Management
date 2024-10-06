/* Output total & each cost of items for athlete of North Sussex Judo based on input */

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Display display = new Display();


        /* Intro Welcome Message */
        display.welcome();


        Athlete athlete = new Athlete();

        System.out.print("Please enter your name: ");
        athlete.name = s.nextLine();

        display.name_hello(athlete.name);


        /* ----------------------- Training_plan starts ------------------------------ */

        Validation validation = new Validation();


        display.training_plan();
        validation.training_plan(athlete);


        /* -------------------- Current Weight Starts ----------------------------- */

        validation.current_weight_input_type(athlete);

        /*----------------  Competition Weight Category Starts -------------------*/

         display.weight_category();
         validation.category_weight_input(athlete);


        /*------------------------- Num of Competition Starts -------------------------*/

        /* Compeition is only available for inter & elite */
        if(athlete.competition)
        {
            validation.num_of_competitions_input(athlete);
        }



        /*------------------ Private coaching hours starts ------------------------*/

          validation.apply_private_hours(athlete);



        /* --------------------- Final Output --------------------------------- */

        display.final_output(athlete);

    }
}