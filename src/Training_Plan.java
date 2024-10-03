// Class related to training plan

public class Training_Plan {

    // string (s) where all s are constant
    final String beginner = "beginner";
    final String intermediate = "intermediate";
    final String elite = "elite";

    protected int validation(String current_weight,String weight_cat)
    {
        if(current_weight.equals(weight_cat))
        {
            return 1;
        }

        System.out.println("hello");
        return 0;
    }

}
