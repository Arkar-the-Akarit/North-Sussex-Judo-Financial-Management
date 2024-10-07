// Class related to training plan

public class Training_Plan
{

    /* It should be constant */
  final private  String[] training_plan = {"Beginner","Intermediate","Elite"};
  final private float[] weekly_fee = {25, 30, 35} ;
  final private float[] montly_fee = {100,120,140};

  Boolean match(Athlete a, String input)
  {
      for(int i = 0, l = training_plan.length; i < l ; i++)
      {
          if(training_plan[i].equalsIgnoreCase(input))
          {

              a.competition_condition(training_plan[i]);

              System.out.println("Congratulations! You have successfully enrolled for "+a.training_plan+" level training class.\n");

              set_plan_fee(a,i);
              return true;
          }
      }
      return false;
  }

    Athlete athlete = new Athlete();

    private void set_plan_fee(Athlete a,int index)
    {
        a.total_fee.training_plan = montly_fee[index];
    }



    public String[] getTraining_plan() {
        return training_plan;
    }

    public float[] getPlan_fee() {
        return weekly_fee;
    }
}
