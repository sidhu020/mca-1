// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk24.java
//
// Pasing object of the same class to the method 
// ********************************************************
class Test
{
        	int x;
        	Test()
        	{
                		x=0;
        	}
        	Test(int x1)
        	{
                		x=x1;
        	}
        	void check(Test tt)
        	{
                		tt.x=100;
        	}
        	void TestDisp()
        	{
                		System.out.println("x ="+x);
        	}
}
class ckkprg024
{
        	public static void main(String args[])
        	{
                		Test t1=new Test(10);
                		Test t2=new Test(20);
                		System.out.println("Before check");
                		t2.TestDisp();
                		t1.check(t2);
                		System.out.println("After check");
                		t2.TestDisp();
        	}
}
/* Output
Before check
x =20
After check
x =100
*/
