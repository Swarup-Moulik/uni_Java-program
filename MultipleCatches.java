class MultipleCatches
{
	public static void main(String args[])
	{
		try
		{
			int a=args.length;
			int b=10/a;
			int c[]= {1};
			c[2]=2;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by 0: "+ae);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Array Index Out Of Bound: "+aie);
		}
		
		System.out.println("After try/catch blocks.");
	}
}