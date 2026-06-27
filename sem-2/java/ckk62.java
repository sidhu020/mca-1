// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk62.java
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
        void show()
        {
                System.out.println("Show of B");
        }                
}
class ckkprg062
{
        public static void main(String args[])
        {
                B o1=new B();
                o1.show();
        }
}
/* Output
Show of B
*/
