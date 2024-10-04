public class Display {

    // Fileds & Objects of Training Plan class
    Training_Plan training_plan = new Training_Plan();
    String[] plan = training_plan.getTraining_plan();
    float[]  fee = training_plan.getPlan_fee();

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

        for (int i = 0, l = plan.length; i < l ; i++)
        {
            System.out.println(plan[i]+" --  "+session_time[i]+" sessions per week --- " +
                    "fee $  "+String.format("%.2f",fee[i]));
        }

        System.out.println("------------------------------------");
    }

}
