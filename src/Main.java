import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Display object
        Display display = new Display();
        display.welcome();

        // Athlete object
        Athlete athlete = new Athlete();

        System.out.println("Please enter your name: ");
        athlete.name = s.nextLine();

        display.name_hello(athlete.name);
        display.training_plan();

        System.out.println("Enter your current weight: ");
        athlete.current_weight = s.nextInt();

        // Training Plan object
        Training_Plan training_plan = new Training_Plan();
        training_plan.validation(athlete.training_plan,beginner)




    }
}