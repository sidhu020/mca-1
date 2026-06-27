// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk100.java
// use of throw
// ********************************************************
class ckkprg100
{
        	static void demo1()
        	{
                        	throw new ArithmeticException("demo");
        	}
        	public static void main(String args[])
        	{
                		try
                		{
                        		demo1();
                		}
                		catch(ArithmeticException e)
                		{
                        		System.out.println("In main"+e);
                		}
        	}
}
