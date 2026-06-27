// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk29.java
//
// checking of stativ variable and static method
// ********************************************************
class ckkprg029
{
        	int c;
        	static int a=3;
        	static int b;
        	static void Check(int x)
        	{
		// Can not access instance variable in the static method
		//                c=10;
		//                System.out.println("c = "+c);
		System.out.println("V R in check");
                		System.out.println("a = "+a);
                		System.out.println("b = "+b);
                		System.out.println("x = "+x);
        	}
        	static
        	{
                		System.out.println("Static block is executed");
                		b=a*2;
        	}
        	public static void main(String args[])
        	{
                		Check(42);
                		ckkprg029.Check(10);
                		System.out.println("in main b: "+ckkprg029.b);
        	}
}