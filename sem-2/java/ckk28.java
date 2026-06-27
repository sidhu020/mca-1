// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk28.java
//
// checking of stativ variable and static method
// ********************************************************
class static1
{
//        	static int c;
        	int c;
	static int a=100;
        	static int b=200;
        	static void Disp()
	{
		//c=20;        
        		System.out.println("(a+b) = "+(a+b));
        	}
}
class ckkprg028
{
	public static void main(String args[])
        	{
		//		c=10; generates compile time error
                		static1.a=150;
		//		static1.c=200; generates compile time error
				static1 o1=new static1();
				o1.c=200;
                		static1.Disp();
        	}
}
/* Output
(a+b) = 350 */
