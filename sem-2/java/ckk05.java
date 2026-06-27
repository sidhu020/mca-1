// ******************************************
// Program by Dr. CK Kumbharana
// program name ckk05.java
//
// Scope and life  time of the variable
//
// ******************************************
class ckkprg005
{
	public static void main(String args[])
	{
		int k=10;
		System.out.println("K in main "+k);
		{
			System.out.println("K in block "+k);
			int n,m;
			n=5;
			m=k*n;
			System.out.println("n ="+n);
			System.out.println("m ="+m);
		}
		// following line generates the compile error
		//System.out.println("n after block");
		//
		//System.out.println("n ="+n);
		System.out.println("K after blokc in main "+k);
	}
}
/*
K in main 10
K in block 10
n =5
m =50
K after blokc in main 10
*/