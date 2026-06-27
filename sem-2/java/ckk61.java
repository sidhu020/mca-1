// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk61.java
// 
// ********************************************************
abstract class A
{
        void putd()
        {
                System.out.println("Putd of abstract class A");
        }
}
class B extends A
{
        void putd1()
        {
                System.out.println("Putd of class B");
        }
}
class ckkprg061
{
        public static void main(String args[])
        {
                B o1=new B();
                o1.putd();
                o1.putd1();
//                A o2=new A(); abstract class can not initialised
                A o3;
        }
}
/* Output                
Putd of abstract class A
Putd of class B
*/
