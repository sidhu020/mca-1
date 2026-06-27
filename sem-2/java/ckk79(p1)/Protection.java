// ********************************************************
// Program by Dr. CK Kumbharana
// program name Protection.java
// checking of package p1
// ********************************************************
package p1;
public class Protection
{
        	int n=1; // Default access specifier
        	private int npri=2;
       	protected int npro=3;
        	public int npub=4;
        	public Protection()
        	{
                		System.out.println("Protection class constructor");
                		System.out.println("n = "+n);
                		System.out.println("npri = "+npri);
                		System.out.println("npro = "+npro);
                		System.out.println("npub = "+npub);
        	}
}


