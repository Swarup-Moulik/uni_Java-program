import java.util.*;
class Fact {
    long fact(long num)
    {
        if (num == 0 || num == 1) 
        {
            return 1;    
        } 
        else if(num>1) 
        {
            return num*fact(num-1);
        }
        else
        {
            return 0;
        }
    } 
}
public class factorial 
{
    public static void main(String[] args) 
    {
        Fact ob = new Fact();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        long n = sc.nextLong();
        long fac = ob.fact(n);
        if (fac == 0) 
        {
            System.out.println("Negative  number factorial not possible.");
        } 
        else 
        {
            System.out.println("Factorial of "+n+" :- "+fac);
        }
    }
}
