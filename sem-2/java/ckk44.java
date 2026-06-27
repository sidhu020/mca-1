// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk44.java
// constructore invocation in multi level inheritance
// ********************************************************

class A
{
        A()
        {
                System.out.println("Default of super class A");
        }
}
class B extends A
{
        B()
        {
                System.out.println("Default of sub class B");
        }
}
class C extends B
{
        C()
        {
                System.out.println("Default of sub class C");
        }
}
class ckkprg044
{
        public static void main(String args[])
        {
                C o1=new C();
        }
}
