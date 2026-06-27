// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk25.java
//
// Primitive types are passed by value to the methods 
// ********************************************************
class Test
{
	void check(int a)
	{
		a=a+10;
		System.out.println("In method a = "+a);
	}
}
class ckkprg025
{
    public static void main(String args[])
    {
		int b=20;
		Test o1=new Test();
		System.out.println("Before function b = "+b);
		o1.check(b);
		System.out.println("After function b = "+b);
    }
}
