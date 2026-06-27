// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk43.java
// multi level inheritance
// ********************************************************
class A
{
	int i;
	void showa()
	{
		System.out.println("Showa of A "+i);
	}
}
class B extends A
{
	int j;
	void showb()
	{
		System.out.println("Showb of B ");
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
}
class C extends B
{
	int k;
	void showc()
	{
		System.out.println("Showc of C ");
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("k = "+k);
	}
}
class ckkprg043
{
	public static void main(String args[])
	{
		C c1=new C();
		c1.i=100;
		c1.j=200;
		c1.k=300;
		c1.showa();
		c1.showb();
		c1.showc();
	}
}