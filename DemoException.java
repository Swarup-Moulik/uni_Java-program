class DemoException
{
	public static void main(String args[])
	{
		int a[] = new int[5];

		try
		{
			for(int i=0; i<=5; i++)
			{
				a[i]=i+1;
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException are)
		{
			System.out.println("You can not cross the uper boundary of arry index.");
		}	
	}
}