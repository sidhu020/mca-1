// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk31.java
// checking of inner class
// ********************************************************
class Outer1
{
        int x=100;
        void test()
        {
                Inner in=new Inner();
                in.Disp();
        }
        class Inner
        {
                void Disp()
                {
                        System.out.println("Outer x = "+x);
                }
        }
}
class ckkprg031
{
        public static void main(String args[])
        {
                Outer1 o1=new Outer1();
                o1.test();
		// Generates the compile time error
		//o1.disp();
        }
}
