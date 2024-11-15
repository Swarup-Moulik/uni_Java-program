import java.util.*;
public class Pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of iterations :-");
        int n = sc.nextInt();
        System.out.println("The pattern :- ");
        for (int i = 1; i <= n; i++) 
        {
            for (int j = n-i; j >= 0; j--) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
