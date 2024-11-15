import java.util.*;

class PalindromeString
{
	public static void main(String args[])
	{
		boolean flag=false;		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String str =sc.nextLine();			
		int j=str.length()-1; 
		for(int i=0; i<Math.ceil((str.length()+1)/2); i++)
		{
			if(str.charAt(i)!=str.charAt(j-i))
			{
				System.out.println(str+" is not a palindrome string.");
                break;
			}
			else
			{
				flag=true;
			}	
		}
		if(flag==true)
		{
			System.out.println(str+" is a palindrome string.");
		}
	}
}