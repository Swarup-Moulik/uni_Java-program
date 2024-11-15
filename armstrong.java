import java.util.*;
public class armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int num, d, sum, c, n;
        num = d = sum = c = n = 0;
        num = sc.nextInt();
        n = num;
        while (n>0) 
        {
          c++;
          n/=10;  
        }
        System.out.println("No. of digits :- "+c);
        n = num;
        while (n>0) 
        {
          d = n % 10;
          sum+= Math.pow(d, c);
          n/=10;  
        }
        if (sum == num) 
        {
            System.out.println(num+" is Armstrong.");    
        } else 
        {
            System.out.println(num+" is not Armstrong.");    
        }
    }
}
