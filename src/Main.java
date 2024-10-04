import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Object Declaraion
        Display display = new Display();
        Athlete athlete = new Athlete();
        Training_Plan training_plan = new Training_Plan();
        Competition_weight competition_weight = new Competition_weight();
        Validation validation = new Validation();

        display.welcome();

        System.out.print("Please enter your name: ");
        athlete.name = s.nextLine();

        display.name_hello(athlete.name);


        // ----------------------- Training_plan starts ------------------------------

        display.training_plan();

        System.out.print("Please choose your training plan: ");
        String input_plan = s.nextLine();

        while(!(training_plan.input_validation(input_plan,athlete)))
        {
            System.out.println("Please only choose the available plan.");
            System.out.print("Please choose your training plan: ");
            input_plan = s.nextLine();
        }

        System.out.println("Congratulations, you have enrolled for "+athlete.training_plan+" level training plan.\n");

        // -------------------- Training Plan Ended -------------------------------------


        // -------------------- Current Weight Starts ----------------------------------

        System.out.print("Please enter your current weight (kg) in numbers: ");
        while(!(s.hasNextInt()))
        {
            System.out.println("Please only enter in numbers");
            System.out.print("Please enter your current weight (kg) in number: ");
            s.next();
        }

        // -------------------- Current Weight Ended -----------------------------------


        // ------------- Competition Weight Category Starts ---------------------


//        int weight = s.nextInt();
//        athlete.current_weight = weight;
//
//        display.weight_category();
//        System.out.println("Please enter your competition weight category: ");
//        String input_competition_weight = s.nextLine();
//
//        while(!competition_weight.input_validation(input_competition_weight))
//        {
//            System.out.println("Please only choose from available category.");
//            System.out.print("Please enter your competition weight category: ");
//            input_competition_weight = s.next();
//        }

         display.weight_category();
         validation.category_weight_input();


        // --------- Competition Weight Category Ended --------------------------



        // ------------ Private hours Starts ----------------------------------
        char choice;
        if(athlete.competition)
        {
            choice = validation.apply_private_hours();


        }







    }
}