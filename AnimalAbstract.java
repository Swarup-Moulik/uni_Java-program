public abstract class AnimalAbstract
{
	public static int count;
	AnimalAbstract()
	{
		System.out.println("This class provides the common behaviour names of all types of Animals.");
	}

	public abstract void eat();
	
	public void printObjectCount()
	{
		System.out.println(count+ " object/(s) of animal is/are created.");
		System.out.println();
	} 
}

class Human extends AnimalAbstract
{
	
	Human()
	{
		System.out.println("This class provides the common behaviours of all types of Humans.");
		count++;
	}

	public void eat()
	{
		System.out.println("Human eats everything.");
	}
}

class Dog extends AnimalAbstract
{
	Dog()
	{
		System.out.println("This class provides the common behaviours of all types of Dogs.");
		count++;
	}
	
	public void eat()
	{
		System.out.println("Dog eats everything.");
	}
}

class DemoAbstractClass
{
	public static void main(String args[])
	{
		//AnimalAbstract al=new AnimalAbstract(); Abstract class is can not be instantiated.
		Human hu=new Human();
		hu.printObjectCount();
		Dog dg=new Dog();
		dg.printObjectCount();
		AnimalAbstract al1=new Dog();
		al1.printObjectCount();
		
		hu.eat();
		dg.eat();
		al1.eat();
	}
}
