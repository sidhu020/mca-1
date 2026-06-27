// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk87.java
// interface can be extended
// ********************************************************
interface A
{
        void math1();
}
// generates the error
// interface B implements A
interface B extends A
{
     void math2();
}
class C implements A,B
{
        public void math1()
        {
                System.out.println("math1");
        }
        public void math2()
        {
                System.out.println("math2");
        }
}
class ckkprg087
{
        public static void main(String args[])
        {
        C o1=new C();
        o1.math1();
        o1.math2();
        }
}
