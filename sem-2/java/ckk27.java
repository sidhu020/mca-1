// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk27.java
//
// checking of access specifier
// ********************************************************
class test
{
	private int a;
	protected int b;
	public int c;
	int d;
}
class ckkprg027
{
        	public static void main(String args[])
        	{
		test o1=new test();
		o1.a=10; // It has private access hance can not be access outside the class
		o1.b=20;
		o1.c=30;
		o1.d=40;
        	}
}