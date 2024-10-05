import java.util.Scanner;

public class Validation {

    Training_Plan training_plan = new Training_Plan();
    Athlete athlete = new Athlete();
    Display display = new Display();
    Competition_weight competition_weight = new Competition_weight();
    Private_hours privateHours = new Private_hours();
    Total_fee total_fee = new Total_fee();

    Scanner s = new Scanner(System.in);

    final String[] category = competition_weight.getCategory();



    void current_weight_input_type()
    {
        System.out.print("Please input your current weight (kg) : ");

        if(s.hasNextInt())
        {
            int weight = s.nextInt();
            s.nextLine();  // to consume leftover new line char, so it doesn't affect
            // next time scanner is used
            current_weight(weight);
        }
        else
        {
            s.next();
            System.out.println("Please only input positive numbers");
            current_weight_input_type();
        }
    }

    void current_weight(int weight)
    {
        if(weight < 40)
        {
            System.out.println("You must weigh at least 40kg to participate in our judo" +
                    " classes.");
            current_weight_input_type();
        }
        else
        {
            athlete.current_weight = weight;
        }
    }



    void category_weight_input() {



        System.out.print("Please enter your competition weight category: ");
        String input = s.nextLine();

        boolean flag = false;

        for (int i = 0, l = category.length; i < l; i++) {
            if (category[i].equalsIgnoreCase(input)) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Please only enter your competition weight category.");
            category_weight_input();
        }
    }

    void num_of_competitions_input()
    {
        display.num_of_competitions();
        int noc = s.nextInt();

        if(noc < 0)
        {
            System.out.println("Please input only in positive number.");
            num_of_competitions_input();
            return;
        }



    }


    char apply_private_hours() {
        display.private_hours();

        String input = s.nextLine().toLowerCase();
        char choice = input.charAt(0);

        if ((choice == 'y') || (choice == 'n')) {
            return choice;
        }

        System.out.println("Please only input 'y' or 'n'.");
        apply_private_hours();
        return choice;
    }

    void total_private_hours(char c) {
        int total_hours = 0;

        if (c == 'y') {

            System.out.println("How many hours of private coaching would you like to " +
                    "receive? (maximum limit : 5 hours)");
            System.out.print("Coaching hours requested: ");
            total_hours = s.nextInt();

            if ((total_hours < 0) || (total_hours > 5)) {
                System.out.println("\nPlease ensure your input is within maximum " +
                        "limit : 5 hours\n");
                total_private_hours(c);

            }
            else
            {
                privateHours.hours = total_hours;
                athlete.private_coaching_hours = total_hours;
                final int per_hour_fee = 9;
                total_fee.setPrivate_hours((total_hours * per_hour_fee));
            }


        } else if (c == 'n') {
            return ;
        }
    }



}




