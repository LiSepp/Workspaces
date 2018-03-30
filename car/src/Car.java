public class Car 
{
	String color;
	double weight;
	Car()//构造方法
	{
		color = "red";
		weight =125.1;
		System.out.println("Constructing Car");
	}
		String printColor()
		{
			return color ;
		}
}
/*定义构造方法
 * 1、声明对象
 * 2、创建对象
 * 3、执行构造方法
 * 对象名.成员变量名
 */
class CarDemo
{
	public static void main(String args[])
	{
		Car car1 = new Car ();//类型 对象名 实例化 类
		Car car2 = new Car ();
		String c;
		c = car1.printColor();//对对象方法的引用加.
		System.out.println("car1 color is " + c);
		c = car2.printColor();
		System.out.println("car2 color is " + c);
	}
}
