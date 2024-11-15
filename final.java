final class FinalClass
{
	public void display()
	{
    		System.out.println("This is a final method.");
  	}
}

// try to extend the final class
class DemoClass extends FinalClass 
{
  	public void display()
	{
    		System.out.println("The final method is overridden.");
  	}

	public static void main(String[] args)
	{
    		DemoClass  obj = new DemoClass();
    		obj.display();
	}
}

class FinalExample
{
	// create a final method
	public final void display()
	{
      		System.out.println("This is a final method.");
    	}
}

class DemoFinal extends FinalExample
{
        int i = 10;
  	// try to override final method
  	public final void display()
	{
    		System.out.println("The final method is overridden.");
  	}

  	public static void main(String[] args)
	{
    		final DemoFinal obj = new DemoFinal();
    		obj.display();
		obj.i = 20;
		obj = new DemoFinal();
		// create a final method
		final int AGE = 32;

    		// try to change the final variable
   		AGE = 45;
    		System.out.println("Age: " + AGE);
  	}
}