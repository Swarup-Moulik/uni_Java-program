import java.util.*;
class Demo1
{
    private int a;
    public void seta(int num)
    {
        this.a = num;
    }
    public int geta()
    {
        return a;
    }
}
public class Getset 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Demo1 ob = new Demo1();
        System.out.println("Enter a number :-");
        int nn = sc.nextInt();
        ob.seta(nn);
        System.out.println("Number :- "+ob.geta());
    }
}
