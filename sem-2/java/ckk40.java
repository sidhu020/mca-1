// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk40.java
// checking of variable number of argument
// ********************************************************
class ckkprg040
{
        static void vaTest(int ... v)
        {
                System.out.println("Variable argument "+v.length);
                for(int x:v)
                {
                        System.out.println(x+ " ");
                }
                System.out.println();
        }
        static void vaTest(boolean ... v)
        {
                System.out.println("Variable argument "+v.length);
                for(boolean x:v)
                {
                        System.out.println(x+ " ");
                }
                System.out.println();
        }
        static void vaTest()
        {
                System.out.println("Without the argumernt");
        }
        public static void main(String args[])
        {
                vaTest(1,2,3);
                vaTest();
        }
}
