// ******************************************
// Program by Dr. CK Kumbharana
// program name ckk14.java
//
// example of continue with label 
//
// ******************************************
class ckkprg014
{
	public static void main(String args[])
	{
		one:
		for(int i=1;i<=10;i++)
			for(int j=1;j<=10;j++)
			{
				if(j>i)
				{
					System.out.println();
					continue one;
				}
				System.out.print(j+"  ");
			}
	}
}	