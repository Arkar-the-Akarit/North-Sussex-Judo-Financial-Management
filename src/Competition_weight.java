public class Competition_weight {

    Athlete athlete = new Athlete();

    final private String[] category = {"Flyweight","Lightweight","Light-Middleweight",
            "Middleweight","Light-Heavyweight","Heavyweight"};
    final private String[] limit = {"66","73","81","90","100","Over 100"};


    /* weight_range [i][j], where i =weight of same-indexed category, j =  end limit */
    final private int[][] weight_range = {{40,66},{67,73},{74,81},{82,90},{91,100}};





    public String[] getCategory() {
        return category;
    }

    public String[] getLimit() {
        return limit;
    }

    boolean match(Athlete a, String input)
    {
        for(int i = 0, l = category.length; i < l; i++)
        {
            if(category[i].equalsIgnoreCase(input))
            {
                a.competition_weight = category[i];
                weight_set(a,i);
                return true;
            }
        }


        return false;
    }


    private void weight_set(Athlete a, int index)
        {
            int weight = a.current_weight;

            if(index == 5)
            {
                 heavy_weight_check(a);
            }
            else
            {
                if((weight >= weight_range[index][0]) && (weight <= weight_range[index][1]))
                {
                    a.weight_difference = 0;
                }
                else if(weight < weight_range[index][0])
                {
                    a.weight_difference = -1;
                }
                else if(weight > weight_range[index][1])
                {
                    a.weight_difference = 1;
                }
            }
    }

    private void heavy_weight_check(Athlete a)
    {
        if(a.current_weight > 100)
        {
            a.weight_difference = 0;
        }
        else
        {
            a.weight_difference = -1;
        }
    }



}
