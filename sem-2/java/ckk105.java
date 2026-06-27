// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk105.java
// use of throws
// ********************************************************
class ckkprg105
{
        static void demo1() throws IllegalAccessException
        {
                        throw new IllegalAccessException("demo");
        }
        public static void main(String args[])
        {
                try
                {
                        demo1();
                }
                catch(IllegalAccessException e)
                {
                        System.out.println("In main"+e);
                }
        }
}
