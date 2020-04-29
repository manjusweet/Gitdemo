//eg parent class cons
class Parent
{
	Parent()
	{
		System.out.println("parent class 0 arg cons");
	}
}
class Child extends Parent
{
	Child()
	{
		this(10);
		System.out.println("child class 0 arg cons");
	}
	Child(int a)
	{
		super();
		System.out.println("child class 1 arg cons");
	}
	public static void main(String[] args)
	{
		new Child();
	}
}
//output
/*parent class 0 arg cons
child class 1 arg cons
child class 0 arg cons*/