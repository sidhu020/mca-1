// ******************************************
// Program by Dr. CK Kumbharana
// program name ckk10.java
//
// Cheking of the scope of the variable declare in for loop
//
// ******************************************
class ckkprg010
{
	public static void main(String args[])
	{
		System.out.println("Checking of the i variabel declare inside for loop");
		for(int i=1;i<=3;i++);
		// following code generates the compile time error
		// can not find symbol i
		//System.out.println("Value of i after for loop "+i);
		for(int j=0;j<=4;j++)
		{
			System.out.println("j = "+j);
		}			
		System.out.println("Value of j after for loop "+j);
	}
}	