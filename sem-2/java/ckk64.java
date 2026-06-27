// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk64.java
// 
// ********************************************************
abstract class A
{
        abstract void show()
        {
                System.out.println("Show of B");
        }
        void putd()
        {
                System.out.println("Putd of abstract class A");
        }
}
class B extends A
{
        void show()
        {
                System.out.println("Show of B");
        }
}
class ckkprg064
{
        public static void main(String args[])
        {
                B o1=new B();
                o1.show();
        }
}
/* generates the error
Abstract method can not have body */
