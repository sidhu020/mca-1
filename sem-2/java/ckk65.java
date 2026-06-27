// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk65.java
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
        abstract void show();
}
class ckkprg065
{
        public static void main(String args[])
        {
                B o1;
        }
}
/*Generates error
A class with abstract method must be abstact */
