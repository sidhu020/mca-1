// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk58.java
// 
// ********************************************************
class A
{
}
class B extends A
{
        void putd()
        {
                System.out.println("Putd of B");
        }
}
class C extends B
{
        void putd()
        {
                System.out.println("Putd of C = ");
        }
}
class ckkprg058
{
        public static void main(String args[])
        {
                A a=new A();
                B b=new B();
                C c=new C();
                A r;
                r=a;
//                r.putd(); Error
                r=b;
//                r.putd(); Error
                r=c;
//                r.putd(); Error
        }
}
