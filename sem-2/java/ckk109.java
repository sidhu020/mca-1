// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk109.java
// create our own exception
// ********************************************************
class OwnException1 extends Exception
{
        private int dt;
        OwnException1(int a)
        {
                dt=a;
        }
        public String toString()
        {
                return "OwnException1["+dt+"]";
        }
}
class ckkprg109
{
        static void compute(int a) throws OwnException1
        {
                System.out.println("Called compute("+a+")");
                if(a>10)
                        throw new OwnException1(a);
                System.out.println("Normal Exit");
        }
        public static void main(String args[])
        {
                try
                {
                        compute(1);
                        compute(20);
                }
                catch(OwnException1 e)
                {
                        System.out.println("Caught "+e);
                }
        }
}
