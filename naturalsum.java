import java.util.*;
class number
{
    void series(int num)
    {
        System.out.print("The series :- ");
        int sum = 0;
        for (int i = 1; i <= num; i++) 
        {
            if (i!=num) 
            {
                System.out.print(i+" + ");
                sum+=i;
            } else 
            {
                System.out.print(i+ " = ");
                sum+=i;
                System.out.println(sum);
            }
        }
    }
}
public class naturalsum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :- ");
        int n = sc.nextInt();
        number ob = new number();
        ob.series(n);
    }
}
