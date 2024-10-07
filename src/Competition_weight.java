public class Competition_weight {


    final private String[] category = {"Flyweight","Lightweight","Light-Middleweight",
            "Middleweight","Light-Heavyweight","Heavyweight"};
    final private String[] limit = {"66","73","81","90","100","Over 100"};


    public String[] getCategory() {
        return category;
    }

    public String[] getLimit() {
        return limit;
    }


    private int num_of_competition;

    public int getNum_of_competition() {
        return num_of_competition;
    }

    public void setNum_of_competition(int num_of_competition) {
        this.num_of_competition = num_of_competition;
    }
}
