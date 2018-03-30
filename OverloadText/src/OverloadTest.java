public class OverloadTest//多个相同方法名，参数数量类型返回类型不同
{
	void test()
	{
		System.out.println("No parameters");
	}
	void test(int a)
	{
		System.out.println("a:"+ a);
	}
	void test(int a, int b)
	{
		System.out.println("a and b:" + a + " "+b);
	}
	double test(double a)
	{
		System.out.println("double a: " +a);
		return a*a;
	}
}
class Overload
{
	public static void main(String args[])
	{
		OverloadTest ot = new OverloadTest();
		double result;
		ot.test();
		ot.test(1);
		ot.test(1, 2);
		result = ot.test(0.5);
		System.out.println("Result of ot.test(0.5): " + result);
	}
}