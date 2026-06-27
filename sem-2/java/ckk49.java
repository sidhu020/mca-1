// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk49.java
// 
// ********************************************************
class che1
{
        int i,j;
        che1()
        {
                i=j=0;
        }
        che1(int a)
        {
                i=a;
                j=0;
        }
        che1(int a,int b)
        {
                i=a;
                j=b;
        }
        che1(che1 tt)
        {
                i=tt.i;
                j=tt.j;
        }
        void putd()
        {
                System.out.println("i = "+i);
                System.out.println("j = "+j);
        }
}
class che2 extends che1
{
        int k;
        che2()
        {
                super();
                k=0;
        }
        che2(int a)
        {
                super(a);
                k=0;
        }
        che2(int a, int b)
        {
                super(a,b);
                k=0;
        }
        che2(int a,int b, int c)
        {
                super(a,b);
                k=c;
        }
        che2(che2 tt)
        {
                super(tt);
                k=tt.k;
        }
        che2(che1 tt)
        {
                i=tt.i;
                j=tt.j;
                k=0;
        }
        void putd1()
        {
                putd();
                System.out.println("k = "+k);
        }
}
class ckkprg049
{
        public static void main(String args[])
        {
                che1 ob1=new che1(100,200);
                che2 o1=new che2();
                che2 o2=new che2(10);
                che2 o3=new che2(11,12);
                che2 o4=new che2(101,102,103);
                o1.putd1();
                o2.putd1();
                o3.putd1();
                o4.putd1();
                che2 o5=new che2(ob1);
                che2 o6=new che2(o4);
                o5.putd1();
                o6.putd1();
        }
}
/* Output
i = 0
j = 0
k = 0
i = 10
j = 0
k = 0
i = 11
j = 12
k = 0
i = 101
j = 102
k = 103
i = 100
j = 200
k = 0
i = 101
j = 102
k = 103
*/
