// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk51.java
// 
// ********************************************************
class A
{
        int i;
}
class B extends A
{
        int i;
        B(int a,int b)
        {
                super.i=a;
                i=b;
        }
        void putd()
        {
                System.out.println("i of A using super.i = "+super.i);
                System.out.println("i of B = "+i);
        }
}
class ckkprg051
{
        public static void main(String args[])
        {
                B ob1=new B(10,20);
                ob1.putd();
        }
}
