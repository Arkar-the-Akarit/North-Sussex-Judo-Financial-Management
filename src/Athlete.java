import java.util.Objects;

public class Athlete
{

    String name;
    int current_weight;
    String training_plan;
    Boolean competition;
    int num_of_competitions;
    int private_coaching_hours;

    Total_fee total_fee = new Total_fee();

    void competition_condition(String t_plan)
    {
        training_plan = t_plan;


        if(t_plan.equalsIgnoreCase("beginner"))
        {
            competition = false;
            return;
        }

        competition = true;

    }



}

