// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk70.java
// use of this to run lverloaded constructor
// ********************************************************
class ckk70
{
	ckk70()
	{
		this(0);
		System.out.println("In default");
	}
	ckk70(int i)
	{
		this(1,1);
		System.out.println("In 1-para");
	}
	ckk70(int j,int k)
	{
		System.out.println("In 2-para");
	}
}
class ckkprg070
{
	public static void main(String args[])
	{
		ckk70 t=new ckk70();
	}
}
	