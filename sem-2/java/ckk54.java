// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk54.java
// 
// ********************************************************
class che1
{
        int i,j;
        che1(int a,int b)
        {
                i=a;
                j=b;
        }
        void putd()
        {
                System.out.println("Putd of Super class che1");
                System.out.println("i = "+i);
                System.out.println("j = "+j);
        }
}
class che2 extends che1
{
        int k;
        che2(int a,int b,int c)
        {
                super(a,b);
                k=c;
        }
        void putd()
        {
                System.out.println("Putd of sub class che2");
                System.out.println("k = "+k);
        }
}
class ckkprg054
{
        public static void main(String args[])
        {
                che2 o1=new che2(10,20,30);
                o1.putd();
        }
}
/* Output
Putd of sub class che2
k = 30
*/
