// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk67.java
// 
// ********************************************************
class A
{
        final void putd()
        {
                System.out.println("putd of A");
        }
}
class B extends A
{
        void putd()
        {
                System.out.println("putd of B");
        }
}
class ckkprg067
{
        public static void main(String args[])
        {
                B ob1=new B();
                ob1.putd();
        }
}
/* Generates error
Final mehtod of A can not be override in B */
