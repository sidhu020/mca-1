// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk82.java
// implement the interface
// ********************************************************
class ckk82 implements interface1
{
 	public void testinter(int a)
	{
		System.out.println("Calling interface1 from ckk82  "+a);
	}
}
class ckkprg082
{
	public static void main(String args[])
	{
		ckk82 o1=new ckk82();
		o1.testinter(40);
	}
}
