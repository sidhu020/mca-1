// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk23.java
//
// Checking of overloading the method (int convert to double) 
// ********************************************************
class testOverload3
{
        void test()
        {
                System.out.println("No parametrise method");
        }

/*   the followig consructor works properly
	it will be invoked by 1-para when integer is passed
	void test(int a)
        {
                System.out.println("1 integer parameter");
                System.out.println("a = "+a);
        } 

  */      void test(double a)
        {
                System.out.println("1 double parameter");
                System.out.println("a = "+a);
        }
        void test(int a,int b)
        {
                System.out.println("2 Integer parameter");
                System.out.println("a = "+a);
                System.out.println("b = "+b);
        }
}
class ckkprg023
{
        public static void main(String args[])
        {
                testOverload3 o1=new testOverload3();
                o1.test();
                o1.test(10);
                o1.test(100,200);
                o1.test(200.55);
        }
}
/* Output
No parametrise method
1 double parameter
a = 10.0
2 Integer parameter
a = 100
b = 200
1 double parameter
a = 200.55
*/
