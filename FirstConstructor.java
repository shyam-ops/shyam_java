public class FirstConstructor
{
    String color;
    void price(int price)
    {
        System.out.println(price);
    }
    public static void main (String [] args)
    {
        FirstConstructor F1 = new FirstConstructor();
        F1.color = "Blue";
        System.out.println(F1.color);
        F1.price(400000);
    }
}