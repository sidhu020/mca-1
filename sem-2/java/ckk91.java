// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk91.java
// Using try ... catch
// ********************************************************
class ckkprg091
{
        	public static void main(String args[])
        	{
                		try
                		{
                        		int d=0;
                        		int a=42/d;
                		}
                		catch(ArithmeticException e)
                		{
                        		System.out.println("Division by zero");
                        		System.out.println(e);
                		}
        	}
}
