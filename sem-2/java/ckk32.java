// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk32.java
// checking of inner class
// ********************************************************
class Outer1
{
        	int x=100;
        	void test()
        	{
                		Inner in=new Inner();
                		in.Disp();
        	}
        	class Inner
        	{
                		void Disp1()
                		{
                        		System.out.println("Inner Display");
                		}
                		void Disp()
                		{
                        		System.out.println("Outer x = "+x);
                		}
        	}
}
class ckkprg032
{
        	public static void main(String args[])
        	{
                		Outer1.Inner oi;
                		oi=new Outer1().new Inner();
                		oi.Disp1();
                		oi.Disp();
		//oi.test();
		// Generates the error
        	}
}
