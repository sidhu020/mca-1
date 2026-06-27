// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk107.java
// finally - 2
// ********************************************************
class ckkprg107
{
        static void A()
        {
                try
                {
                        System.out.println("Inside A");
                        throw new RuntimeException("Demo");
                }
                catch(Exception e)
                {
                        System.out.println("Caught in A :"+e);
                }
                finally
                {
                        System.out.println("Finally of A");
                }
        }
        public static void main(String args[])
        {
                try
                {
                        A();
                }
                catch(Exception e)
                {
                        System.out.println("Caught in main :"+e);
                }
        }
}
