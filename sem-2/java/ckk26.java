// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk26.java
//
// class returning the objects from the method 
// ********************************************************
class test
{
	int a;
	test(int a1)
	{
		a=a1;
	}
	test sum(test tt)
	{
		test t1=new test(0);
		t1.a=a+tt.a;
		return t1;
	}
}
class ckkprg026
{
        	public static void main(String args[])
        	{
		test t1,t2,t3;
		t1=new test(10);
		t2=new test(20);
		t3=t1.sum(t2);
		System.out.println("t1.a = "+t1.a);
		System.out.println("t2.a = "+t2.a);
		System.out.println("t3.a = "+t3.a);
        	}
}
