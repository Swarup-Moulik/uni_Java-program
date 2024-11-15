import java.util.*;
public class calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits you want to calculate :-");
        int n = 0;
        n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the digits :- ");
        for(int i = 0; i<n; i++)
        {
            ar[i] = sc.nextInt();
        }
        int ch, r;
        ch = r = 0;
        System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
        System.out.println("Enter your choice :-");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                for (int i = 0; i < n; i++) 
                {
                    r+=ar[i];
                }
                System.out.println("Addition result :- "+r);
                break;
            case 2:
                for (int i = 0; i < n; i++) 
                {
                    r-=ar[i];
                }
                System.out.println("Subtraction result :- "+r); 
                break; 
            case 3:
                for (int i = 0; i < n; i++) 
                {
                    r*=ar[i];
                }
                System.out.println("Multiplication result :- "+r);
                break;
            case 4:
                for (int i = 0; i < n; i++) 
                {
                    r/=ar[i];
                }
                System.out.println("Division result :- "+r);
                break;        
            default:
                System.out.println("Wrong input.");
                break;
        }
    }
}