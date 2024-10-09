public class Display {

    // Fileds & Objects of Training Plan class
    Training_Plan training_plan = new Training_Plan();
    // Getting arrays from training plan
    private final String[] plan = training_plan.getTraining_plan();
    private final float[] weekly_fee = training_plan.getWeekly_fee();
    private final float[] montly_fee = training_plan.getMontly_fee();
    Competition_weight competition_weight = new Competition_weight();
    // Gettings arrays from competition weight
    private final String[] category = competition_weight.getCategory();
    private final String[] limit = competition_weight.getLimit();


    void welcome() {
        System.out.println("\n---//============================\\\\---");
        System.out.println("--|| " + asni.YELLOW + "Welcome to North Sussex Judo" + asni.RESET + " ||--");
        System.out.println("---\\\\============================//---\n");
    }

    void name_hello(String name) {
        System.out.println("\nHello, [" + asni.YELLOW + name + asni.RESET + "]");
    }

    void training_plan() {
        int[] session_time = {2, 3, 5};

        dash_maker(60);
        System.out.printf("| %23s " + asni.YELLOW + "Training Plan" + asni.RESET + " %22s |\n", ""
                , "");
        dash_maker(60);
        System.out.printf("| %3s Plan %3s | Sessions Per Week | Weekly Fee |  Monthly " +
                "Fee |\n", "", "");

        for (int i = 0; i < 3; i++) {
            dash_maker(60);
            System.out.printf("| " + asni.CYAN + "%12s" + asni.RESET + " | %7s %d %8s |" +
                            "  $  %.2f  |  $  " + asni.GREEN + "%.2f" + asni.RESET + "  |\n",
                    plan[i], "", session_time[i], "", weekly_fee[i], montly_fee[i]);
        }

        dash_maker(60);
    }

    void weight_category() {
        int max = max_length(category);


        System.out.println("  ----------------------------------------------  ");
        System.out.printf("|  %10s" + asni.YELLOW + "Competition Weight Category" + asni.RESET +
                "%8s |\n", "", "");
        System.out.println("  ----------------------------------------------  ");
        System.out.println("|      Categories      | Upper Weight Limit (Kg) |");

        for (int i = 0, l = category.length; i < l; i++) {
            dash_maker(46);

            // %- for left align, concatenate for dynamic value, "s for format specifier
            System.out.printf("|  " + asni.CYAN + "%-" + max + "s" + asni.RESET + "  | %23s |\n",
                    category[i],
                    limit[i]);
        }


        dash_maker(46);
    }

    private int max_length(String[] s) {
        int max = 0;
        for (int i = 0, l = s.length; i < l; i++) {
            if (s[i].length() > max) {
                max = s[i].length();
            }
        }
        return max;
    }

    void final_output(Athlete a) {
        System.out.println("\nHello, [" + asni.YELLOW + a.name + asni.RESET + "]");

        float p_hour = 9.00f;
        float fee = 22.00f;

        dash_maker(55);

        System.out.printf("|  No  | %15s %s %15s |  Total  |\n", "",
                "Items", "", "", "");

        dash_maker(55);

        System.out.printf("|  [1] | %22s : " + asni.CYAN + "%-12s" + asni.RESET + " | $ " + asni.GREEN + "%.2f" + asni.RESET + " |\n", "Training " +
                "Plan", a.training_plan, a.total_fee.training_plan);

        dash_maker(55);

        System.out.printf("|  [2] | %22s : " + asni.CYAN + "%-12s" + asni.RESET + " | $ " + asni.GREEN + "%.2f" + asni.RESET + " |\n", "Private " +
                "Cocahing Hours", a.private_coaching_hours, a.total_fee.private_hours);

        dash_maker(55);

        System.out.printf("|  [3] | %22s : " + asni.CYAN + "%-12s" + asni.RESET + " | $ " + asni.GREEN + "%.2f" + asni.RESET + " " + "|\n", "Total Competitions", a.num_of_competitions, a.total_fee.competition_entry_fee);

        dash_maker(55);

        System.out.printf("| %19s Total %18s | $ " + asni.GREEN + "%.2f" + asni.RESET + " |\n"
                , "", "", a.total_fee.total());

        dash_maker(55);


        String diff = weight_difference(a.weight_difference);

        System.out.printf("Your current weight : (%d) kg is [" + asni.CYAN + "%s" + asni.RESET + "] limit " +
                "range of your competition weight: %s\n\n", a.current_weight, diff, a.competition_weight);

    }

    private String weight_difference(int diff) {
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

    private void dash_maker(int n) {
        System.out.print("  ");
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }


}
