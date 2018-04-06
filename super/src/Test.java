/*
*关键字super用来指明对父类的引用
*super(__)
*super.__
*两种方法调用同名父类
*/
class A
{
	int i;
	void printi()
	{
	System.out.println("A中i :"+i);
	}
}
class B extends A
{
	int i;
	B(int a, int b)
	{
		super.i = a;
		i = b;
	}
	void printi()
	{
		System.out.println("B中i :"+i);
	}
	void show()
	{
		System.out.println("i in superclass:" + super.i);
		System.out.println("i in subclass:" +i);
		super.printi();
		printi();
	}
}

class Test
{
	public static void main(String args[])
	{
		B b= new B(1,2);
		b.show();
	}
}	

