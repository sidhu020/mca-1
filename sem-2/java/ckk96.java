// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk96.java
// checking of nesting of try and catch
// ********************************************************
class ckkprg096
{
        	public static void main(String args[])
        	{
                		try
                		{
                        		int a=args.length;
                        		System.out.println("a ="+a);
                        		int b=50/a;
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
                        		catch(ArrayIndexOutOfBoundsException e)
                        		{
                                			System.out.println("out of bound");
					}
                        		System.out.println("After inner try");
                  		}
                		catch(ArithmeticException e)
                		{
                        		System.out.println("Divide by 0");
                		}
                		System.out.println("After all try");
        	}
}
