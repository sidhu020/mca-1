// ******************************************
// Program by Dr. CK Kumbharana
// program name ckk16.java
//
// concept of reference object and instance 
// ******************************************
class ckkprg016
{
	public static void main(String args[])
	{
		box ob1;
		ob1=new box();
		ob1.w=10;
		ob1.h=20;
		ob1.l=15;
		System.out.println("Volume = "+(ob1.w*ob1.h*ob1.l));
	}
}	