public class Display {


    TrainingPlan training_plan = new TrainingPlan();

    private final String[] plan = training_plan.getTraining_plan();
    private final float[] weekly_fee = training_plan.getWeeklyFee();
    private final float[] montly_fee = training_plan.getMonthlyFee();

    CompetitionWeight competition_weight = new CompetitionWeight();

    private final String[] category = competition_weight.getCategory();
    private final String[] limit = competition_weight.getLimit();


    void welcome() {
        System.out.println("\n---//============================\\\\---");
        System.out.println("--|| " + ASNI.YELLOW + "Welcome to North Sussex Judo" + ASNI.RESET + " ||--");
        System.out.println("---\\\\============================//---\n");
    }

    void nameHello(String name) {
        System.out.println("\nHello, [" + ASNI.YELLOW + name + ASNI.RESET + "]");
    }

    void trainingPlan() {
        int[] session_time = {2, 3, 5};

        dashMaker(60);
        System.out.printf("| %23s " + ASNI.YELLOW + "Training Plan" + ASNI.RESET + " %22s |\n", ""
                , "");
        dashMaker(60);
        System.out.printf("| %3s Plan %3s | Sessions Per Week | Weekly Fee |  Monthly " +
                "Fee |\n", "", "");

        for (int i = 0; i < 3; i++) {
            dashMaker(60);
            System.out.printf("| " + ASNI.CYAN + "%12s" + ASNI.RESET + " | %7s %d %8s |" +
                            "  $  %.2f  |  $  " + ASNI.GREEN + "%.2f" + ASNI.RESET + "  |\n",
                    plan[i], "", session_time[i], "", weekly_fee[i], montly_fee[i]);
        }

        dashMaker(60);
    }

    void weightCategory() {
        int max = maxLength(category);


        System.out.println("  ----------------------------------------------  ");
        System.out.printf("|  %10s" + ASNI.YELLOW + "Competition Weight Category" + ASNI.RESET +
                "%8s |\n", "", "");
        System.out.println("  ----------------------------------------------  ");
        System.out.println("|      Categories      | Upper Weight Limit (Kg) |");

        for (int i = 0, l = category.length; i < l; i++) {
            dashMaker(46);

            /* %- for left align, concatenate for dynamic value, "s for format
            specifier */
            System.out.printf("|  " + ASNI.CYAN + "%-" + max + "s" + ASNI.RESET + "  | %23s |\n",
                    category[i], limit[i]);
        }


        dashMaker(46);
    }

    void finalOutput(Athlete athlete) {
        System.out.println("\nHello, [" + ASNI.YELLOW + athlete.name + ASNI.RESET + "]");

        dashMaker(55);

        System.out.printf("|  No  | %15s %s %15s |  Total  |\n", "",
                "Items", "", "", "");

        dashMaker(55);

        System.out.printf("|  [1] | %22s : " + ASNI.CYAN + "%-12s" + ASNI.RESET + " | $ " + ASNI.GREEN + "%.2f" + ASNI.RESET + " |\n", "Training " +
                "Plan", athlete.trainingPlan, athlete.totalFee.trainingPlan);

        dashMaker(55);

        System.out.printf("|  [2] | %22s : " + ASNI.CYAN + "%-12s" + ASNI.RESET + " | $ " + ASNI.GREEN + "%.2f" + ASNI.RESET + " |\n", "Private " +
                "Cocahing Hours", athlete.privateCoachingHours, athlete.totalFee.privateHours);

        dashMaker(55);

        System.out.printf("|  [3] | %22s : " + ASNI.CYAN + "%-12s" + ASNI.RESET + " | $ " + ASNI.GREEN + "%.2f" + ASNI.RESET + " " + "|\n", "Total Competitions", athlete.numOfCompetitions, athlete.totalFee.competitionEntryFee);

        dashMaker(55);

        System.out.printf("| %19s Total %18s | $ " + ASNI.GREEN + "%.2f" + ASNI.RESET + " |\n"
                , "", "", athlete.totalFee.total());

        dashMaker(55);


        String diff = weightDifference(athlete.weightDifference);

        System.out.printf("Your current weight : (%d) kg is [" + ASNI.CYAN + "%s" + ASNI.RESET + "] limit " +
                "range of your competition weight: %s\n\n", athlete.currentWeight, diff, athlete.competitionWeight);

    }


    private int maxLength(String[] s) {
        int max = 0;
        for (int i = 0, l = s.length; i < l; i++) {
            if (s[i].length() > max) {
                max = s[i].length();
            }
        }
        return max;
    }

    private String weightDifference(int diff) {
        switch (diff) {
            case -1:
                return "below";

            case 0:
                return "within";

            case 1:
                return "over";

            default:
                return "";
        }

    }

    private void dashMaker(int n) {
        System.out.print("  ");
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }


}
