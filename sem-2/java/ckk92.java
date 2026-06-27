// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk92.java
// checking of try ... catch
// ********************************************************
class ckkprg092
{
        public static void main(String args[])
        {
                try
                {
                        int d=0;
                        int a=42/d;
                }
//              No execuatble statements are allowed between try catch
//               System.out.println("No statement is allowed here");
                catch(ArithmeticException e)
                {
                        System.out.println("Division by zero");
                        System.out.println(e);
                }
        }
}
