// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk102.java
// use of throw
// ********************************************************
class ckkprg102
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
                        		throw e;
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
        	}
}
