// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk52.java
// 
// ********************************************************
class A
{
        int i=100;
}
class B extends A
{
        int i;
}
class C extends B
{
        int i;
        C(int a,int b,int c)
        {
                super.i=a;
                i=c;
        }
        void putd()
        {
                System.out.println("i of B using super.i = "+super.i);
                System.out.println("i of C = "+i);
        }
}
class ckkprg052
{
        public static void main(String args[])
        {
                C ob1=new C(10,20,30);
                ob1.putd();
        }
}
/* Output
i of B using super.i = 10
i of C = 30
*/
