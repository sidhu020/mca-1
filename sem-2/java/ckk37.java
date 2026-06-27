// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk37.java
// checking of variable number of argument
// ********************************************************
class ckkprg037
{
        static void vArgs(int ... v)
        {
                System.out.print("Variable no. of arguments = ");
                System.out.println(v.length);
                for(int x:v)
                        System.out.println(x);
        }
        public static void main(String args[])
        {
                vArgs();
                vArgs(1);
                vArgs(10,20,30);
                vArgs(100,200,300,400);
        }
}