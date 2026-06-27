// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk53.java
// 
// ********************************************************
class A
{
        int i;
}
class B extends A
{
        int j;
}
class C extends B
{
        int i;
        C(int a,int b,int c)
        {
                super.i=a;
                j=b;
                i=c;
        }
        void putd()
        {
                System.out.println("i of A using super.i = "+super.i);
                System.out.println("j of B = "+j);
                System.out.println("i of C = "+i);
        }
}
class ckkprg053
{
        public static void main(String args[])
        {
                C ob1=new C(10,20,30);
                ob1.putd();
        }
}
/* Output
i of A using super.i = 10
j of B = 20
i of C = 30
*/
