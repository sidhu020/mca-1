// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk103.java
// use of throw
// ********************************************************
class ckkprg103
{
        	static void demo1()
        	{
                		try
                		{
                        		throw new NullPointerException("demo");
                		}
                		catch(NullPointerException e)
                		{
                        		System.out.println("In demo1");
                        		try
                        		{
                                			throw new ArithmeticException("Ari");
                        		}
                        		catch(ArrayIndexOutOfBoundsException e1)
                        		{
                                			System.out.println("Inner try");
                        		}
                        		System.out.println("After inner catch");
                		}
                		catch(ArithmeticException e)
                		{
                        		System.out.println("Catch of outer in demo1");
                		}
    	}
        	public static void main(String args[])
        	{
                		try
                		{
                        		demo1();
                		}
                		catch(NullPointerException e)
                		{
                        		System.out.println("In main"+e);
                		}
                		catch(ArithmeticException e1)
                		{
                        		System.out.println("Catch of outer im main");
                		}
                		System.out.println("In main");
        	}
}
