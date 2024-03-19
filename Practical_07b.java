
public class Practical_07b
{
    public static void main(String []args)
    {
        try
        {
            validate(7);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught Exception" +e.getMessage());
        }
    }
    public static void validate(int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("You must be 18 or older");
        }
        else
        {
            System.out.println("Welcome to vote.");
        }
    }
}