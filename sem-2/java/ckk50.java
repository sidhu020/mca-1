// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk50.java
// 
// ********************************************************
class A
{
        A(int a,int b)
        {
                System.out.println("Two parameterised con. of Super class A");
        }
}
class B extends A
{
}
class C extends B
{
        C(int a,int b)
        {
                super(a,b);
                System.out.println("Two parameterised con. of Sub class C");
        }

}
class ckkprg050
{
        public static void main(String args[])
        {
                C o1=new C(10,20);
        }
}
/* Generates the error */
