// ********************************************************
// Program by Dr. CK Kumbharana
// program name SamePackage.java
// checking of package p1
// ********************************************************
package p1;
class SamePackage
{
        	SamePackage()
        	{
		Protection p=new Protection();
                  	System.out.println("SamePackage class Constructor");
                  	System.out.println("n = "+p.n);
		// Can not acces the private data 
		//                  System.out.println("npri = "+p.npri);
                  	System.out.println("npro = "+p.npro);
                  	System.out.println("npub = "+p.npub);
        	}
}


