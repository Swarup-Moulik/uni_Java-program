class MySingleTon
{
     
	private static MySingleTon myObj;
	int i;
	
	//Create private constructor
    
	private MySingleTon()
	{
         	i=10;
    	}
    
   	// Create a static method to get instance.
   
    	public static MySingleTon getInstance()
	{
        	if(myObj == null)
		{
            		myObj = new MySingleTon();
        	}
        	return myObj;
    	}
     
    	public void getSomeThing()
	{
        	// do something here
        	System.out.println("The value of i is "+i);
    	}
     
}

public class SingleTon
{
    	public static void main(String a[])
	{
        	MySingleTon st = MySingleTon.getInstance();
        	st.getSomeThing();
    	}
}