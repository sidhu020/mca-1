// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk39.java
// checking of variable number of argument
// ********************************************************
class ckkprg039
{
        static void vArgs()
        {
                System.out.println("Without any parameter");
        }
        static void vArgs(int ... v)
        {
                System.out.print("Variable no. of arguments : ");
                System.out.println("int"+v.length);
                for(int i=0;i<v.length;i++)
                        System.out.println(v[i]);
        }
        static void vArgs(boolean ... v)
        {
                System.out.print("Variable no. of arguments : ");
                System.out.println("boolean "+v.length);
                for(boolean x:v)
                        System.out.println(x);
        }
        public static void main(String args[])
        {
                vArgs();
                vArgs(1);
                vArgs(10,20,30);
                vArgs(100,200,300,400);
                vArgs(true,true,false,false);
        }
}