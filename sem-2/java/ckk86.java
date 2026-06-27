// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk86.java
// implement the interface with the help of interface reference
// ********************************************************
class ckk86 implements interface1
{
 	public void testinter(int a)
	{
		System.out.println("Calling interface1 from ckk86  "+a);
	}
}
class ckkprg086
{
	public static void main(String args[])
	{
		interface1 obj;
		ckk86 o1=new ckk86();
		obj=o1;
		obj.testinter(100);
		ckk85 o2=new ckk85();
		obj=o2;
		obj.testinter(200);
	}
}
