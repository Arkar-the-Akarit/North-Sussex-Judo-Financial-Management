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
            System.out.printf("Plan: %-"+max+"s -- %d session per week -- fee $ %2f\n",
                    plan[i],session_time[i],fee[i]);
        }

        System.out.println("------------------------------------");
    }

    void weight_category()
    {
        int max = max_length(category);

        System.out.println("This is competition weight category with limits (kg)");
        System.out.println("====================================================");
        for (int i = 0, l = category.length; i < l ; i++)
        {
            // %- for left align, concatenate for dynamic value, "s for format specifier
            System.out.printf("Category: %-"+max+"s --- Upper weight limit (kg): %s\n",
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

}
