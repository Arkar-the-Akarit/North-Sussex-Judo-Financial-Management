import java.util.Scanner;

public class Validation {

    Scanner s = new Scanner(System.in);

    Training_Plan training_plan = new Training_Plan();

    void training_plan(Athlete a)
    {
        System.out.print("Please choose your training plan: ");
        String input = s.nextLine();

        Boolean flag = training_plan.match(a,input);

        if(!flag)
        {
            System.out.println("\nPlease only input the name of training plan you want " +
                    "to" +
                    " attend");
            training_plan(a);

        }
    }



    Competition_weight competition_weight = new Competition_weight();

    final float entryFee = 22.00F;

    final String[] category = competition_weight.getCategory();

    void current_weight_input_type(Athlete a)
    {
        System.out.print("\nPlease input your current weight (kg) : ");

        if(s.hasNextInt())
        {
            int weight = s.nextInt();
            s.nextLine();  // to consume leftover new line char, so it doesn't affect
            // next time scanner is used
            current_weight(weight,a);
        }
        else
        {
            s.next();
            System.out.println("\nPlease only input positive numbers");
            current_weight_input_type(a);
        }
    }

    void current_weight(int weight, Athlete a)
    {
        if(weight < 40)
        {
            System.out.println("\nYou must weigh at least 40kg to participate in our " +
                    "judo" +
                    " classes.");
            current_weight_input_type(a);
        }
        else
        {
            a.current_weight = weight;
        }
    }



    void category_weight_input(Athlete a) {

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
            category_weight_input(a);
        }
    }

    void num_of_competitions_input(Athlete a)
    {
        System.out.print("Please enter number of competition you entered this month: ");
        if(s.hasNextInt())
        {
            int total_num = s.nextInt();
            s.nextLine();

            if(total_num < 0)
            {
                System.out.println("\nPlease only input in positive numbers.");
                num_of_competitions_input(a);
            }

            /* Idky, if i don't check like this, the first negative value is kept in
            a.nOC even the program shouldn't reach here cz of recursion :( :( sob sob */
            if(total_num > 0)
            {
                a.num_of_competitions = total_num;

                float totalFee = total_num * entryFee;
                a.total_fee.competition_entry_fee = totalFee;
            }

        }
        else
        {
            s.next();

            System.out.println("\nPlease only input in numbers.");
            num_of_competitions_input(a);
        }
    }


   void apply_private_hours(Athlete a) {

        System.out.println("Private tuition will cost $ 9.00 per hour.");
        System.out.print("Would you like to apply for private tuition? (y/n) : ");
        String input = s.nextLine();
        char choice = input.charAt(0);

        if ((choice == 'y'))
        {
            private_hours_choice(choice,a);
            return;
        }
        else if((choice == 'n'))
        {
            return;
        }

        System.out.println("\nPlease only input 'y' or 'n'.");
        System.out.println("[y] for yes\n[n] for no");
        apply_private_hours(a);

    }

   private void private_hours_choice(char c, Athlete a) {

        if (c == 'y')
        {
            total_private_hours(c,a);
        }
        else if (c == 'n')
        {
            return ;
        }
    }

    private void total_private_hours(char c, Athlete a)
    {
        int total_hours;

        System.out.println("How many hours of private coaching would you like to " +
                "receive? (maximum limit : 5 hours)");
        System.out.print("Coaching hours requested: ");

        if(s.hasNextInt())
        {

            total_hours = s.nextInt();
            s.nextLine();

            if ((total_hours < 0) || (total_hours > 5))
            {
                System.out.println("\nPlease ensure your input is within maximum " +
                        "limit : 5 hours\n");
                private_hours_choice(c, a);

            }
            else
            {
                a.private_coaching_hours = total_hours;
                final int per_hour_fee = 9;
                a.total_fee.private_hours = total_hours * per_hour_fee;
            }
        }
        else
        {
            s.next();
            System.out.println("Please only input numbers only.");
            total_private_hours(c,a);
        }

        }
    }





