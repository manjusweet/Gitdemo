//method overloading
class  Pro
{
	void m1(int a)
	{
		System.out.println("int m1 method");
	}
	void m1(int a,int b)
	{
		System.out.println("int,int m1 method");
	}
	void m1(char ch)
	{
		System.out.println("char m1 method");
	}

	public static void main(String[] args) 
	{
		Pro t=new Pro();
			t.m1(10);
			t.m1(10,20);
			t.m1('a');

	}
}
