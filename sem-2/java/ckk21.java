// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk21.java
//
// Checking of overloading the method
// ********************************************************
class testOverload1
{
	void test()
        	{
                		System.out.println("No parametrise method");
        	}
        	void test(int a)
        	{
                		System.out.println("1 Integer parameter");
                		System.out.println("a = "+a);
        	}
        	void test(int a,int b)
        	{
                		System.out.println("2 Integer parameter");
                		System.out.println("a = "+a);
                		System.out.println("b = "+b);
        	}
        	void test(double a)
        	{
                		System.out.println("1 double parameter");
                		System.out.println("a = "+a);
        	}
}
class ckkprg021
{
        	public static void main(String args[])
        	{
                		testOverload1 o1=new testOverload1();
                		o1.test();
                		o1.test(10);
                		o1.test(100,200);
                		o1.test(200.55);
        	}
}
/*  Output
No parametrise method
1 Integer parameter
a = 10
2 Integer parameter
a = 100
b = 200
1 double parameter
a = 200.55*/
