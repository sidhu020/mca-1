// ******************************************
// Program by Dr. CK Kumbharana
// program name ckk17.java
//
// Concept of object reference variable 
// ******************************************
class ckkprg017
{
	public static void main(String args[])
	{
		box ob1,ob2;
		ob1=new box();
		ob1.w=10;
		ob1.h=20;
		ob1.l=15;
		System.out.println("Volume = "+(ob1.w*ob1.h*ob1.l));
		ob2=ob1;
		System.out.println("Ob2.w ="+ob2.w);
		System.out.println("Ob2.h ="+ob2.h);
		System.out.println("Ob2.l ="+ob2.l);
		System.out.println("Volume of ob2 = "+(ob2.w*ob2.h*ob2.l));
		ob2.w=3;
		ob2.h=2;
		ob2.l=6;
		System.out.println("Ob1.w ="+ob1.w);
		System.out.println("Ob1.h ="+ob1.h);
		System.out.println("Ob1.l ="+ob2.l);
		System.out.println("Volume = "+(ob1.w*ob1.h*ob1.l));
		ob1=null;
		System.out.println("Ob2.w ="+ob2.w);
		System.out.println("Ob2.h ="+ob2.h);
		System.out.println("Ob2.l ="+ob2.l);
		System.out.println("Volume of ob2 = "+(ob2.w*ob2.h*ob2.l));
		System.out.println("Ob1.w ="+ob1.w);
		System.out.println("Ob1.h ="+ob1.h);
		System.out.println("Ob1.l ="+ob2.l);
		System.out.println("Volume = "+(ob1.w*ob1.h*ob1.l));
	}
}	