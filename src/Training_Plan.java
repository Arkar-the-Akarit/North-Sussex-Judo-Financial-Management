// Class related to training plan

public class Training_Plan
{

    // Training Plan is constant
  final private  String[] training_plan = {"Beginner","Intermediate","Elite"};
  final private float[] plan_fee = {25, 30, 35} ;

  boolean input_validation(String athlete_plan,Athlete athlete )
    {
        for(int i = 0; i < training_plan.length; i++)
        {
            if(training_plan[i].equalsIgnoreCase(athlete_plan))
            {

                switch (i)
                {
                    case 0:
                        athlete.competition = false;
                        break;

                    default:
                        athlete.competition = true;
                        break;
                }

                athlete.training_plan = training_plan[i];
                athlete.total_fee.training_plan = plan_fee[i];

                return true;
            }

        }
        return false;
    }

    public String[] getTraining_plan() {
        return training_plan;
    }

    public float[] getPlan_fee() {
        return plan_fee;
    }
}
