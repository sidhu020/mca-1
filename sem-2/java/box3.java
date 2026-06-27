// ******************************************
// Program by Dr. CK Kumbharana
// program name box3.java
// class box with putvol(), setd, putd() method
// ******************************************
class box3
{
	double w;
	double h;
	double l;
	box3()
	{
		w=10; h=20; l=15;
	}
	box3(double w,double h,double l)
	{
		this.w=w;
		this.h=h;
		this.l=l;
	}
	double putd()
	{
		double v;
		System.out.println("w = "+w);
		System.out.println("h = "+h);
		System.out.println("l = "+l);
		v=w*h*l;
		return v;
	}
}	