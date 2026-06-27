// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk33.java
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
                		int y=200;
                		void Disp1()
                		{
                        		System.out.println("Inner Display");
                		}
                		void Disp()
                		{
                        		System.out.println("Outer x = "+x);
                        		System.out.println("y = "+y);
                		}
        	}
        	void showy()
        	{
                  	// System.out.println("y = "+y);
                        	// Generate the error
        	}
}
class ckkprg033
{
        public static void main(String args[])
        {
                Outer1 o1=new Outer1();
                o1.test();
        }
}