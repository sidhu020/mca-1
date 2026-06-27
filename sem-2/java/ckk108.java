// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk108.java
// finally - 1
// ********************************************************
class ckkprg108
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
                		catch(Exception e)
                		{
                        		System.out.println("Caught in A :"+e);
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
        	}
}
