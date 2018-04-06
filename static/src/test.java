class test {
	static int i;
	int j;
	int getI(){
		return i;
	}
	int getJ(){
		return j;
	}
	public static void main(String args[])
	{
		test t1 = new test();
		test t2 = new test();
		t1.i =10;
		t2.i =20;//这时，t1.i也为20
		//常用test.i来表示，故也称为类变量 
		t1.j=100;
		t2.j=200;//t1.j为100
		// 实例变量
	}		
}
