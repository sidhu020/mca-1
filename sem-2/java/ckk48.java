// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk48.java
// 
// ********************************************************
class che1
{
        int i;
        che1()
        {
                i=0;
        }
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
class ckkprg048
{
        public static void main(String args[])
        {
                che1 o1;
                che2 o2=new che2(10,20);
                o2.i=10;
                o2.j=20;
                o1=o2;
                o1.putd();
                o2.putd1();
                o2.sum();
                o1.i=100;
//                o1.j=200; Can not access the sub class instance
                o1.putd();
                o2.putd1();
//                o1.sum(); Can not access the method of sub class
                o2.sum();
        }
}
/* Output
i= 10
i = 10
j = 20
i+j = 30
i= 100
i = 100
j = 20
i+j = 120
*/
