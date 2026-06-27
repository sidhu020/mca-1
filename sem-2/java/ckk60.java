// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk60.java
// 
// ********************************************************
class A
{
        void putd()
        {
                System.out.println("Putd of A");
        }
}
class B extends A
{
}
class C extends B
{
        void putd()
        {
                System.out.println("Putd of C");
        }
}
class ckkprg060
{
        public static void main(String args[])
        {
                A a=new A();
                B b=new B();
                C c=new C();
                A r;
                r=a;
                r.putd();
                r=b;
                r.putd();
                r=c;
                r.putd();
        }
}
/* Output
Putd of A
Putd of A
Putd of C
*/
