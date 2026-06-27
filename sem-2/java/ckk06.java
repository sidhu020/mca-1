// ******************************************
// Program by Dr. CK Kumbharana
// program name ckk06.java
// Promotion and or conversio another type
// ******************************************
class ckkprg006
{
	public static void main(String args[])
	{
		byte b;
		b=10;
		System.out.println("b = "+b);
		b=10*2;
		//14: error: incompatible types: possible lossy conversion from int to byte
		//b=80*2;
		System.out.println("b = "+b);
		// following line Generates the error can not convert int to byte
		// b=b*2;
		int i=129;
		float f=323.123f;
		b=(byte)i;
		System.out.println("b = "+b);
		b=(byte)f;
		System.out.println("b = "+b);
	}
}
/*
b = 10
b = 20
b = 1
b = 67
*/