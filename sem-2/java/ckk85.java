// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk85.java
// implement the interface with the help of interface reference
// ********************************************************
class ckk85 implements interface1
{
 	public void testinter(int a)
	{
		System.out.println("Calling interface1 with the refernce of interfac1from ckk68  "+a);
	}
}
class ckkprg085
{
	public static void main(String args[])
	{
		interface1 o1=new ckk85();
		o1.testinter(100);
	}
}
