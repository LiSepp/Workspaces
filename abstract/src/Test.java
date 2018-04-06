/*
*abstract抽象类
*只能声明对象，不能创建对象
*当不知道如何实现方法时，将该类定义为抽象类，该方法定义为抽象方法
*/
abstract class A
{
	abstract void abmeth();//抽出方法，没有方法体
	void concrete()
	{
		System.out.println("This is a concrete method.");
	}
}
class B extends A
{
	void abmeth()//子类提供实现
	{	
		System.out.println("B's implementation of callme.");
	}
}
class Test
{
	public static void main(String args[])
	{	
	B b = new B();
	b. abmeth();
	b. concrete();
	}
}

