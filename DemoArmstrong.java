import java.util.Scanner;
import static java.lang.Math.*;
class Armstrong
{
	public boolean isAmstrong(int num)
	{
		int num1, num2;
		double sum=0, noOfDig=0, remainder;
		
		num2=num1=num;
		
		while(num!=0)
		{
			noOfDig++;
			num=num/10;	
		}

		while(num1!=0)
		{
			remainder=num1%10;
			sum=sum+pow(remainder,noOfDig);
			num1=num1/10;	
		}
	
		if(sum==num2)
			return true;
		
		return false;
	}
}

class DemoArmstrong
{
	public static void main(String args[])
	{
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter your number:");
		num=sc.nextInt();
		
		Armstrong amg = new Armstrong();

		System.out.println();
		if(amg.isAmstrong(num))
		{
			
			System.out.println(num+" is an Armstrong number.");
		}
		else
		{
			System.out.println(num+" is not an Armstrong number.");
		}
	}
}