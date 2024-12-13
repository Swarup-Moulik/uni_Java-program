// Demonstrate JDK 7's multi-catch feature

class MultiCatch
{
	public static void main(String args[])
	{
		int a=0, b=10;
		int c[]= {1,2,3};
		try
		{
			//int d=b/a;
			c[3]=4;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception caught. "+e);
		}
		
		
	}
}