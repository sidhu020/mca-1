// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk63.java
// 
// ********************************************************
abstract class A
{
        abstract void show();
        void putd()
        {
                System.out.println("Putd of abstract class A");
        }
}
class B extends A
{
}
class ckkprg063
{
        public static void main(String args[])
        {
                B o1=new B();
                o1.show();
        }
}
/* generates the error */
