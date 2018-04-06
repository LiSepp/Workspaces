/*
*通过关键字static修饰成员变量和方法（静态变量，非static为实例成员变量）
*不需要实例化new就可以应用
*声明static变量就是全局变量
*用static可以声明一个static块，static块仅在该类被加载时执行一次
*/
class StaticTest
{
	static int a = 2;
	static int b;
	static void meth(int x)
	{
		System.out.println("x=" +x);
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	}
	static
	{
	System.out.println("Staitc block initialized.");
	b = a*5;
	}
	public static void main(String args[])
	{
		meth(10);
	}
}
