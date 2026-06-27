// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk77.java
// checking of package
// ********************************************************
package add;
class Addi
{
        	int i,j,k;
        	Addi(int x,int y)
        	{
                		i=x;
                		j=y;
        	}
        	void sum()
        	{
                		k=i+j;
        	}
        	void putd()
        	{
                		System.out.println("i = "+i);
                		System.out.println("j = "+j);
                		System.out.println("k = "+k);
        	}
}
class ckkprg077
{
        	public static void main(String args[])
        	{
                		Addi a1=new Addi(10,20);
                		a1.sum();
                		a1.putd();
        	}
}

