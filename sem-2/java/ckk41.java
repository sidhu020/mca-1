// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk41.java
// 
// ********************************************************
class che1
{
        int i;
        void putd()
        {
                System.out.println("putd of super class che1");
                System.out.println("i= "+i);
        }
}
class che2 extends che1
{
        int j;
        void putd1()
        {
                System.out.println("putd1 of sub class che2");
                System.out.println("i = "+i);
                System.out.println("j = "+j);
        }
        void sum()
        {
                System.out.println("i+j = "+(i+j));
        }
}
class ckkprg041
{
        public static void main(String args[])
        {
                che2 o1=new che2();
                o1.i=10;o1.j=20;
                o1.putd();
                o1.putd1();
                o1.sum();
        }
}
/*
putd of super class che1
i= 10
putd1 of sub class che2
i = 10
j = 20
i+j = 30
*/