public class Display {

    // Fileds & Objects of Training Plan class
    Training_Plan training_plan = new Training_Plan();
    Competition_weight competition_weight = new Competition_weight();

    // Getting arrays from training plan
    private final String[] plan = training_plan.getTraining_plan();
    private final  float[]  fee = training_plan.getPlan_fee();

    // Gettings arrays from competition weight
    private final String[] category = competition_weight.getCategory();
    private final String[] limit = competition_weight.getLimit();

    void welcome()
    {
        System.out.println("\n---//============================\\\\---");
        System.out.println("--|| Welcome to North Sussex Judo ||--");
        System.out.println("---\\\\============================//---\n");
    }

    void name_hello(String name)
    {
        System.out.println("\nHello, <<"+name+">>");
    }

    void training_plan()
    {
        int[] session_time = {2,3,5};

        System.out.println("This is our current training plan: ");
        System.out.println("====================================");

        int max = max_length(plan);

        for (int i = 0, l = plan.length; i < l ; i++)
        {
            System.out.printf("Plan - [%d] : %-"+max+"s -- %d session per week -- fee $" +
                            " " +
                            "%2f\n",i,
                    plan[i],session_time[i],fee[i]);
        }

        System.out.println("------------------------------------");
    }

    void weight_category()
    {
        int max = max_length(category);

        System.out.println("\nThis is competition weight category with limits (kg)");
        System.out.println("====================================================");
        for (int i = 0, l = category.length; i < l ; i++)
        {
            // %- for left align, concatenate for dynamic value, "s for format specifier
            System.out.printf("[%d] -- %-"+max+"s --- Upper weight limit (kg): %s\n",i,
                    category[i],limit[i]);
        }
        System.out.println("------------------------------------------------------");
    }

    private int max_length(String s[])
    {
        int max = 0;
        for(int i = 0, l = s.length; i < l; i++ )
        {
            if(s[i].length() > max)
            {
                max = s[i].length();
            }
        }
        return max;
    }

    void final_output(Athlete a)
    {
        System.out.println("\nHello, athlete: "+ a.name);

        System.out.println(""+a.name);
        System.out.println(""+a.current_weight);
        System.out.println(""+a.competition);
        System.out.println(""+a.num_of_competitions);
        System.out.println(""+a.private_coaching_hours);
        System.out.println(""+a.total_fee.training_plan);
        System.out.println(""+a.total_fee.private_hours);
        System.out.println(""+a.total_fee.competition_entry_fee);

        float p_hour = 9.00f;
        float fee= 22.00f;

        System.out.println(" [1]  Training Plan: "+a.training_plan+"   $ "+a.total_fee.training_plan+"  $ "+a.total_fee.training_plan);
        System.out.println(" [2]  Private hours: "+a.private_coaching_hours+"   $ "+p_hour+
                "  $ "+a.total_fee.private_hours);
        System.out.println(" [3]  Participated Competition: "+a.num_of_competitions+"  " +
                " $ "+fee+"  $ "+a.total_fee.competition_entry_fee);


        System.out.printf("[3] Participated Competition: %d  Fee per competiton: %2f  " +
                "Total: %2f \n",a.num_of_competitions,fee, a.total_fee.competition_entry_fee);

        System.out.println("Total: "+ a.total_fee.total());



    }



}
