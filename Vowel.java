import java.util.Scanner;

public class Vowel 
{
    public static void main(String args[]) 
    {
        
        /* String must not be empty.
           String must be without any punctuations.
           String must not contain any dumb spaces.*/
	
       	int vowels, consonants, spaces;
        char [] engvowels={'a','e','i','o','u','A','E','I','O','U'};
        vowels = consonants = spaces = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your String: ");
	String str =sc.nextLine();
	
       	for (int i = 0; i < str.length(); i++) 
        {
           	for(int j=0;j<10;j++)
		{	
                	if(str.charAt(i)==engvowels[j])
                	{
				vowels++;
			}
		}

		if (str.charAt(i) == ' ')
		{
                	spaces++;
		}
        }
        
        consonants = str.length() - (vowels + spaces);
        System.out.println("Total Vowel = " + vowels);
        System.out.println("Total Space = " + spaces);
       	System.out.println("Total Consonant = " + consonants);
        System.out.print("Total Words= " + (spaces + 1));
    }
}