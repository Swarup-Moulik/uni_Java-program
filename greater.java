import java.util.*;
public class greater
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers :- ");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b)
            System.out.println(a+" is greater");
        else if(b>a)
            System.out.println(b+" is greater");  
        else
            System.out.println("Both are same.");      
    }
}