public class Athlete {

    String name;
    int currentWeight;
    String trainingPlan;
    Boolean competition;
    int numOfCompetitions;
    int privateCoachingHours;
    String competitionWeight;
    int weightDifference;

    TotalFee totalFee = new TotalFee();

    void competitionCondition(String athleteTrainingPlan) {
        trainingPlan = athleteTrainingPlan;

        /* If training plan = beginner, not allow for competition */
        if (athleteTrainingPlan.equalsIgnoreCase("beginner")) {
            competition = false;
            return;
        }
        competition = true;
    }
}

