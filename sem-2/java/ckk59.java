// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk59.java
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
        void putd()
        {
                System.out.println("Putd of B");
        }
}
class C extends B
{
}
class ckkprg059
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
Putd of B
Putd of B
*/
