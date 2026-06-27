// ******************************************
// Program by Dr. CK Kumbharana
// program name ckk06-1.java
// Promotion and or conversio another type
// ******************************************
class ckkprg006_1
{
	public static void main(String args[])
	{
		float a,r;
		// Follwoing generates the error
		//	r=12.34;
		r=12.34f;
		// The next line generates the error
		//	a=(22.0/7*r*r);
		a=(float)(22.0/7*r*r);
		System.out.println("a = " +a);
	
	}
}
/*
a = 478.58047
*/