import java.util.*;
public class DemoCons 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Constructor ob1 = new Constructor();
        System.out.println("No argumented variable :- "+ob1.a);
        System.out.println("Enter a value for argumented constructor :- ");
        int num = sc.nextInt();
        Constructor ob2 = new Constructor(num);
        System.out.println("Argumented variable :- "+ob2.a);
    }
}
