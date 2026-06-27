// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk101.java
// use of throw
// ********************************************************
class ckkprg101
{
        static void demo1()
        {
                try
                {
                        throw new NullPointerException("demo");
                }
                catch(ArithmeticException e)
                {
                        System.out.println("In demo1");
                        throw e;
                }
        }
        public static void main(String args[])
        {
                try
                {
                        demo1();
                }
                catch(NullPointerException e)
                {
                        System.out.println("In main"+e);
                }
        }
}
