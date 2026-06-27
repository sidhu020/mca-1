// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk42.java
// 
// ********************************************************
class che1
{
	private int k=100;
	int i;
}
class che2 extends che1
{
        	int j;
        	void putd1()
        	{
                		System.out.println("putd1 of sub class che2");
                		System.out.println("i = "+i);
                		System.out.println("j = "+j);
		System.out.println("k = "+k);
        	}
}
class ckkprg042
{
        	public static void main(String args[])
        	{
                		che2 o1=new che2();
                		o1.i=10;
		o1.j=20;
                		o1.k=500;
		o1.putd1();
        	}
}
