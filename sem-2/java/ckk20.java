// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk20.java
//
// invokidng box3 class with constructor 
// ********************************************************
class ckkprg020
{
	public static void main(String args[])
	{
		box3 ob1;
		ob1=new box3();
		System.out.println("Volume = "+ob1.putd());
		box3 ob2=new box3(1,4,6);
		System.out.println("Volume = "+ob2.putd());
	}
}	