// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk46.java
// 
// ********************************************************
class che1
{
        int i;
        che1(int a)
        {
                a=i;
        }
        void putd()
        {
                System.out.println("i= "+i);
        }
}
class che2 extends che1
{
        int j;
        che2(int a,int b)
        {
                i=a;
                j=b;
        }
        void putd1()
        {
                System.out.println("i = "+i);
                System.out.println("j = "+j);
        }
        void sum()
        {
                System.out.println("i+j = "+(i+j));
        }
}
class ckkprg046
{
        public static void main(String args[])
        {
                che2 o1=new che2(10,20);
                o1.putd();
                o1.putd1();
                o1.sum();
        }
}
/* Output
Generates the error due to default construcor not exists in super class
*/
