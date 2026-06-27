// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk22.java
//
// checking of method overloading (double can not conver to int) 
// ********************************************************
class testOverload2
{
        void test()
        {
                System.out.println("No parametrise method");
        }
        void test(int a)
        {
                System.out.println("1 Integer parameter");
                System.out.println("a = "+a);
        }
        void test(int a,int b)
        {
                System.out.println("2 Integer parameter");
                System.out.println("a = "+a);
                System.out.println("b = "+b);
        }
}
class ckkprg022
{
        public static void main(String args[])
        {
                testOverload2 o1=new testOverload2();
                o1.test();
                o1.test(10);
                o1.test(100,200);
                o1.test(200.55);
        }
}
/* Generates the error
doube can not covert to integer
*/
