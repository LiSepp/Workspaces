/*
*扩展接口，通过extends被其他接口继承
*interface子接口名字extends父接口名称1，父接口名称2,~~~
*/
interface A
{
	void a1();
	void a2();
}
interface B extends A
{
	void b1();
}
class MyClass implements B
{
	public void a1()
	{
		System.out.println("Implement a1().");
	}
	public void a2()
	{
		System.out.println("Implement a2().");
	}
	public void b1()
	{
		System.out.println("Implement b1().");
	}
}
class Test
{
	public static void main(String arg[])
	{
		MyClass ob = new MyClass();
		ob.a1();
		ob.a2();
		ob.b1();
	}
}

