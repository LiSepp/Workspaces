/*
 *一个方法名，参数不同叫方法重载（Overload）
 *	void foo(String str);
 *	void foo(int number);
 *
 *父类与子类有同样的方法名和参数，叫方法覆盖（Override）
 class Parent
 {
 	void foo()
 	{
 		System.out.println("Parent foo()");
 	}
 }
 class Child extends Parent 
 {
 	void foo()
 	{
 		System.out.println("Child foo()");
 	}
 }
 
 *父类引用指向子类对象，调用方法是调用子类的实现，叫多态
 *
 Parentinstance= new Child();
 instance.foo(); //==> Child foo ()
 *多态与继承体系有关，与方法覆盖有关，与方法重载无关
 *
 *方法重写中，子类方法的命名和父类中方法的命名是一致的，包括参数列表及返回类型一致
 */
class A
{
	void methodtest()
	{
		System.out.println("Inside A's methodtest method");
	}
}
class B extends A
{
	void methodtest()
	{
		System.out.println("Inside B's methodtest method");
	}
}
class C extends A
{
	void methodtest ()
	{
		System.out.println("Inside C's methodtest method");
	}
}
class Dispatch
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();
		A r;
		r = a;
		r.methodtest ();
		r = b;
		r.methodtest ();
		r = c;
		r.methodtest ();
	}
}