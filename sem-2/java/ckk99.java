// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk99.java
// calling the methods from the try block and creating the nesting of try
// ********************************************************
class ckkprg099
{
	static void nesttry(int a)
	{
		try
                      	{
                                		if(a==1)
                                    		a=a/(a-a);
                                		if(a==2)
                                		{
                                        		int c[]={10};
                                        		c[40]=20;
                                		}
                        	}
 /*            			catch(ArithmeticException e)
                 		{
                 			System.out.println("11Divide by 0");
                 		}*/
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds exception : "+e);
		}	
	}
        	public static void main(String args[])
        	{
		int a=args.length;
                		try
                		{
                        		int b=50/a;
			System.out.println("a = "+a);
			nesttry(a);
		}
                		catch(ArithmeticException e)
                 		{
                 			System.out.println("Divide by 0");
                 		}
                 		System.out.println("After inner try");
	}
}
