class A 
{
	final void meth()
	{
		System.out.println("This is a final method.");
	}
}
class B extends A
{
	void meth() //出错，不能被重写
	{
		System.out.println("Illegal!");
	}
}
