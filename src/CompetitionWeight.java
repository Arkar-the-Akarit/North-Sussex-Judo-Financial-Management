public class CompetitionWeight {

    final private String[] category = {"Flyweight", "Lightweight", "Light-Middleweight",
            "Middleweight", "Light-Heavyweight", "Heavyweight"};
    final private String[] limit = {"66", "73", "81", "90", "100", "Over 100"};
    /* weight_range [i][j], where i =weight of same-indexed category, j =  end limit */
    final private int[][] weightRange = {{40, 66}, {67, 73}, {74, 81}, {82, 90}, {91, 100}};
    Athlete athlete = new Athlete();

    public String[] getCategory() {
        return category;
    }

    public String[] getLimit() {
        return limit;
    }

    boolean match(Athlete a, String input) {
        for (int i = 0, l = category.length; i < l; i++) {
            if (category[i].equalsIgnoreCase(input)) {
                a.competitionWeight = category[i];
                weightSet(a, i);
                return true;
            }
        }
        return false;
    }


    private void weightSet(Athlete a, int index) {
        int weight = a.currentWeight;

        if (index == 5) {
            heavyWeightCheck(a);
        } else {
            if ((weight >= weightRange[index][0]) && (weight <= weightRange[index][1])) {
                a.weightDifference = 0;
            } else if (weight < weightRange[index][0]) {
                a.weightDifference = -1;
            } else if (weight > weightRange[index][1]) {
                a.weightDifference = 1;
            }
        }
    }

    private void heavyWeightCheck(Athlete a) {
        if (a.currentWeight > 100) {
            a.weightDifference = 0;
        } else {
            a.weightDifference = -1;
        }
    }

}
