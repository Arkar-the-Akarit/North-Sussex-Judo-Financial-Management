public class TrainingPlan {

    /* It should be constant */
    final private String[] currentTrainingPlan = {"Beginner", "Intermediate", "Elite"};
    final private float[] weeklyFee = {25, 30, 35};
    final private float[] monthlyFee = {100, 120, 140};


    public String[] getTraining_plan() {
        return currentTrainingPlan;
    }

    public float[] getWeeklyFee() {
        return weeklyFee;
    }

    public float[] getMonthlyFee() {
        return monthlyFee;
    }


    Boolean match(Athlete a, String input) {
        for (int i = 0, l = currentTrainingPlan.length; i < l; i++) {
            if (currentTrainingPlan[i].equalsIgnoreCase(input)) {

                a.competitionCondition(currentTrainingPlan[i]);

                System.out.println("Congratulations! You have successfully enrolled " +
                        "for " + ASNI.CYAN + a.trainingPlan + ASNI.RESET + " level training class" +
                        ".\n");

                set_plan_fee(a, i);
                return true;
            }
        }
        return false;
    }

    private void set_plan_fee(Athlete athlete, int index) {
        athlete.totalFee.trainingPlan = monthlyFee[index];
    }


}
