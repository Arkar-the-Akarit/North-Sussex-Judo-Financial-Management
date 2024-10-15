/* Output total & each cost of items for athlete of North Sussex Judo based on input */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String choice;

        do {
            Scanner s = new Scanner(System.in);
            Display display = new Display();

            /* Intro Welcome Message */
            display.welcome();

            Athlete athlete = new Athlete();

            System.out.print("Please enter your name: ");
            athlete.name = s.nextLine();

            display.nameHello(athlete.name);

            /* ----------------------- Training_plan starts ------------------------------ */
            Validation validation = new Validation();

            display.trainingPlan();
            validation.trainingPlan(athlete);

            /* -------------------- Current Weight Starts ----------------------------- */
            validation.currentWeightInputType(athlete);

            /*----------------  Competition Weight Category Starts -------------------*/
            display.weightCategory();
            validation.categoryWeightInput(athlete);

            /*------------------------- Num of Competition Starts -------------------------*/
            /* Compeition is only available for inter & elite */
            if (athlete.competition) {
                validation.numOfCompetitionsInput(athlete);
            }

            /*------------------ Private coaching hours starts ------------------------*/
            validation.applyPrivateHours(athlete);

            /* --------------------- Final Output --------------------------------- */
            display.finalOutput(athlete);


            /* ------------------------ Reply or not Decision ----------- */
            choice = validation.replay();

        } while (choice.equalsIgnoreCase("yes"));


    }
}