package Inheritance;
class Animal{
	void eat()
	{
		System.out.println("Eating......");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking....");
	}
}

class puppy extends Dog
{
	void weep()
	{
		System.out.println("Weeping");
	}
	
}
public class Test extends Animal
{
  int a=5;
	public static void main(String[] args) {
	Dog d=new Dog();
	puppy p=new puppy();
	Test t=new Test();
	System.out.println(t.a);
	p.weep();
	d.bark();
	p.eat();

	}

}
