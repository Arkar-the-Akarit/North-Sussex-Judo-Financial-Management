import java.util.Scanner;

public class Validation {

    final float entryFee = 22.00F;

    Scanner s = new Scanner(System.in);

    TrainingPlan trainingPlan = new TrainingPlan();

    CompetitionWeight competitionWeight = new CompetitionWeight();

    final String[] category = competitionWeight.getCategory();

    void trainingPlan(Athlete athlete) {
        System.out.print("Please choose your training plan: ");
        String input = s.nextLine();

        Boolean flag = trainingPlan.match(athlete, input);

        if (!flag) {
            System.out.println("\nPlease only input the " + ASNI.RED + "name of training" + ASNI.RESET + " plan you want to attend");
            trainingPlan(athlete);

        }
    }

    void currentWeightInputType(Athlete a) {
        System.out.print("Please input your current weight (kg) : ");

        if (s.hasNextInt()) {
            int weight = s.nextInt();
            s.nextLine();  // to consume leftover new line char, so it doesn't affect
            // next time scanner is used
            currentWeightStandard(weight, a);
        } else {
            s.next();
            System.out.println("\nPlease only input " + ASNI.RED + "positive numbers" + ASNI.RESET);
            currentWeightInputType(a);
        }
    }

    void currentWeightStandard(int weight, Athlete a) {
        if (weight < 40) {
            System.out.println("\nYou must weigh " + ASNI.RED + "at least 40kg" + ASNI.RESET +
                    " " + "to participate in our judo classes.");
            currentWeightInputType(a);
        } else {
            a.currentWeight = weight;
        }
    }

    void categoryWeightInput(Athlete athlete) {

        System.out.print("Please enter your competition weight category : ");
        String input = s.nextLine();

        boolean flag = competitionWeight.match(athlete, input);

        if (!flag) {
            System.out.println("Please only enter your " + ASNI.RED + "competition weight " +
                    "category" + ASNI.RESET + ".");
            categoryWeightInput(athlete);
        }
    }

    void numOfCompetitionsInput(Athlete a) {
        System.out.print("Please enter number of competition you" +
                " entered this month: ");
        if (s.hasNextInt()) {
            int totalNum = s.nextInt();
            s.nextLine();

            if (totalNum < 0) {
                System.out.println("\nPlease only input in " + ASNI.RED + "positive " +
                        "numbers" + ASNI.RESET + ".");
                numOfCompetitionsInput(a);
                return;
            }


            a.numOfCompetitions = totalNum;

            a.totalFee.competitionEntryFee = totalNum * entryFee;


        } else {
            s.next();

            System.out.println("\nPlease only input in " + ASNI.RED + "numbers" + ASNI.RESET +
                    " .");
            numOfCompetitionsInput(a);
        }
    }


    void applyPrivateHours(Athlete athlete) {

        System.out.println("Private tuition will cost $ " + ASNI.GREEN + "9.00" + ASNI.RESET + " per hour.");
        System.out.print("Would you like to apply for private tuition? (y/n) : ");
        String input = s.nextLine();
        char choice = input.charAt(0);

        if ((choice == 'y')) {
            totalPrivateHours(choice, athlete);
            return;
        } else if ((choice == 'n')) {
            return;
        }

        System.out.println("\nPlease only input " + ASNI.RED + "'y' or 'n'" + ASNI.RESET + ".");
        System.out.println("[y] for yes\n[n] for no");
        applyPrivateHours(athlete);

    }

    String replay() {
        System.out.println("Do you want to start the program again? (yes/no)");
        String choice = s.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            return choice;
        } else if (choice.equalsIgnoreCase("no")) {
            System.out.println("Thank you for using North Sussex Judo fee " +
                    "calculating program.\nHave a nice day :):):)");
            return choice;
        }


        System.out.println("Please only input " + ASNI.RED + "'yes' or 'no'" + ASNI.RESET + ". Thank you");
        replay();

        return choice;
    }


    private void totalPrivateHours(char c, Athlete a) {
        int totalHours;

        System.out.println("How many hours of private coaching would you like to " +
                "receive? (maximum limit : " + ASNI.RED + "20" + ASNI.RESET + " hours)");
        System.out.print("Coaching hours requested: ");

        if (s.hasNextInt()) {

            totalHours = s.nextInt();
            s.nextLine();

            if ((totalHours < 0) || (totalHours > 20)) {
                System.out.println("\nPlease ensure your input is within " + ASNI.RED +
                        "maximum limit : 20 hours" + ASNI.RESET + "\n");
                totalPrivateHours(c, a);

            } else {
                a.privateCoachingHours = totalHours;
                final int perHourFee = 9;
                a.totalFee.privateHours = totalHours * perHourFee;
            }
        } else {
            s.next();
            System.out.println("Please only input " + ASNI.RED + "numbers" + ASNI.RESET + " " +
                    "only.");
            totalPrivateHours(c, a);
        }

    }


}





