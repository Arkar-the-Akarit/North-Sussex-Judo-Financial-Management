public class Display {



    void welcome()
    {
        System.out.println("--- Welcome to North Sussex Judo ---");
        System.out.println("------------------------------------");
    }

    void name_hello(String name)
    {
        System.out.println("Hello, "+name);
    }

    void training_plan()
    {
        System.out.println("Fee for our current training plans are as follow: ");

        System.out.printf("Beginner ----- ");
        training_fee_info(2,25);

        System.out.printf("Intermediate --");
        training_fee_info(3,30);

        System.out.printf("Elite ---------");
        training_fee_info(5,35);

    }

    private  void training_fee_info(int num, float fee)
    {
        System.out.println(num+" sessions per week -- fee -- $ "+String.format("%.2f",
                fee));

    }





}
