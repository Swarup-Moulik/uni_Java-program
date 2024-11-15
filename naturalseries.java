import java.util.*;
class number
{
    void series(int num)
    {
        System.out.print("The series :- ");
        for (int i = 1; i <= num; i++) 
        {
            if (i!=num) 
            {
                System.out.print(i+", ");
            } else 
            {
                System.out.println(i);
            }
        }
    }
}
public class naturalseries 
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
