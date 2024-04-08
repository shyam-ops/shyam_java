class Bike1
{
    String name;
    int price;
    /*Bike1() //Default Constructor
    {
        System.out.println("Inside Default Constructor");
    }*/

    Bike1(String nm , int pr)
    {
        this.name=nm;
        this.price=pr;
        System.out.println("Inside parametarize constructor");
    }

    public void display()
    {
        System.out.println("Name "+this.name);
        System.out.println("price "+ this.price);
    }
    public static void main(String [] args)
    {
       // Bike1 b1 = new Bike1();
        Bike1 b2 = new Bike1("red", 10000);
        b2.display();
    }
}