class WhileLoops
{
    public static void main(String [] args)
    {
        int x = 10;
        while(x<x/0.001)
        {
            System.out.println(x);
            x++;
        }
    }
}