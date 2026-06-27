// ********************************************************
// Program by Dr. CK Kumbharana
// program name Derived.java
// checking of package p1
// ********************************************************
package p1;
class Derived extends Protection
{
        	Derived()
        	{
                		System.out.println("Derived class constructor");
                		System.out.println("n = "+n);
		// Can not acces the private data member 
		//                System.out.println("npri = "+npri);
                		System.out.println("npro = "+npro);
                		System.out.println("npub = "+npub);
        	}
}
