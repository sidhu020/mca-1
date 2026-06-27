// ******************************************
// Program by Dr. CK Kumbharana
// program name box2.java
// class box with putvol(), setd, putd() method
// ******************************************
class box2
{
	double w;
	double h;
	double l;
	void setd(double w1,double h1,double l1)
	{
		w=w1;
		h=h1;
		l=l1;
	}
	void setd1(double w,double h,double l)
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
		putvol();
		v=w*h*l;
		return v;
	}
	void putvol()
	{
		System.out.println("Volume = "+w*h*l);
	}

}	