// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk68.java
// 
// ********************************************************
final class A
{
        void putd()
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
class ckkprg068
{
        public static void main(String args[])
        {
                B ob1=new B();
                ob1.putd();
        }
}
/* Generates error
Final class can not be inherited */
