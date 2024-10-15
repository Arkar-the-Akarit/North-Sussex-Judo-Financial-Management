public class TotalFee {

    float trainingPlan;
    float privateHours;
    float competitionEntryFee;

    float total() {
        return (trainingPlan + privateHours + competitionEntryFee);
    }

}
