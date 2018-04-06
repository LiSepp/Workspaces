/*
*通过类名直接访问
*/
class StaticDemo
{
	static int a =2;
	static int b =9;
	static void callme()
	{
		System.out.println("a =" +a);
	}
}
class StaticByName
{
	public static void main(String args[])
	{
		StaticDemo.callme();
		System.out.println("b =" +StaticDemo.b);
	}
}


