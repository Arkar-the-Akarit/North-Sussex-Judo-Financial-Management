public class Competition_weight {

    Athlete athlete = new Athlete();

    final private String[] category = {"Flyweight","Lightweight","light-Middlewight",
            "Middleweight","Light-Heavyweight","Heavyweight"};
    final private String[] limit = {"66","73","81","90","100","Upper 100"};


    public String[] getCategory() {
        return category;
    }

    public String[] getLimit() {
        return limit;
    }

    boolean input_validation(String s)
    {
        for(int i = 0, l = category.length; i < l; i++)
        {
            if(category[i].equalsIgnoreCase(s))
            {
                return true;
            }
        }
        return false;
    }





}
