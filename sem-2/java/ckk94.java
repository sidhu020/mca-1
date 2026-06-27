// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk94.java
// checking of multiple catch with exception sub class
// ********************************************************
class ckkprg094
{
        	public static void main(String args[])
        	{
                		try
                		{
                        	int a=args.length;
                        	System.out.println("a = "+a);
                        	int b=42/a;
                        	int c[]={1};
							c[42]=9;   
	                	}
						catch(Exception e)
						{
							System.out.println("Exception class "+e);
						}
						catch(ArithmeticException e)
                		{
                        		System.out.println("Division by zero");
                        		System.out.println(e);
                		}
                		catch(ArrayIndexOutOfBoundsException e)
                		{
                        		System.out.println("Array index of out of bound");
                		}
                		System.out.println("Completion of try-catch block");
        	}
}

