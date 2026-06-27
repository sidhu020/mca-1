// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk104.java
// use of throw
// ********************************************************
class ckkprg104
{
        static void demo1()
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
