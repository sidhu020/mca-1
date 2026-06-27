// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk38.java
// checking of variable number of argument
// ********************************************************
class ckkprg038
{
        static void vArgs(int ... v)
        {
                System.out.print("Variable no. of arguments : ");
                System.out.println("int"+v.length);
                for(int x:v)
                        System.out.println(x);
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
//      
//                vArgs();
//              Generates the ambiguit error
                vArgs(1);
                vArgs(10,20,30);
                vArgs(100,200,300,400);
                vArgs(true,true,false,false);
        }
}