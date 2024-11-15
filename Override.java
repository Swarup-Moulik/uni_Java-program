class Animal
{
	void eat()
	{
		System.out.println("Every animal eats.");
	}
}
class Human extends Animal
{
	void eat()
	{
		System.out.println("Human eats everything.");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog eats everything.");
	}
}
public class Override
{
	public static void main(String[] args)
	{
		Animal al=new Animal();
		Human hu=new Human();
		Dog dg=new Dog();
		Animal al1=new Dog();
		al.eat();
		hu.eat();
		dg.eat();
		al1.eat();
	}
}
