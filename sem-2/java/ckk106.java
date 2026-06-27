// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk106.java
// finally - 1
// ********************************************************
class ckkprg106
{
        	static void A()
        	{
                		try
                		{
                        		System.out.println("Inside A");
                        		throw new RuntimeException("Demo");
                		}
                		finally
                		{
                        		System.out.println("Finally of A");
                		}
        	}
        	static void B()
        	{
                		try
                		{
                        		System.out.println("Inside B");
                        		return;
                		}
                		finally
                		{
                        		System.out.println("Finally of B");
                		}
        	}
        	static void C()
        	{
                		try
                		{
                        		System.out.println("Inside C");
                        		return;
                		}
                		finally
                		{
                        		System.out.println("Finally of C");
                		}
        	}
        	public static void main(String args[])
        	{
                		try
                		{
                        		A();
                		}
                		catch(Exception e)
                		{
                        		System.out.println("Caught in main :"+e);
                		}
                		B();
                		C();
        	}
}
