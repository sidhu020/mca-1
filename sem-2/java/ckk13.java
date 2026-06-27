// ******************************************
// Program by Dr. CK Kumbharana
// program name ckk13.java
//
// example of break with label 
//
// ******************************************
class ckkprg013
{
	public static void main(String args[])
	{
		int k=1;
		end:
		{
			one:
			{
				if(k==1) break one;
				System.out.println("Hello");
			}
			if(k==1){System.out.println("k = 1"); break end;}
			two:
			{
				if(k==1) break two;
				System.out.println("Hello");
			}
			if(k==2){System.out.println("k = 2"); break end;}
		}
		System.out.println("Hello after end");
	}
}	