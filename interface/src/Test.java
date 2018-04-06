interface Myinterface
{
	void callback(int param);
	void callbackto();
}
class Test implements Myinterface {
	public void callback(int p)
	{
		System.out.println("test:"+p);
	}
	public void callbackto()
	{
		System.out.println("test:");
	}
	public void other()
	{
		System.out.println("other:");
	}
}

