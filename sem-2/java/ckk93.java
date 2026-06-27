// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk93.java
// checking of multiple catch
// ********************************************************
class ckkprg093
{
        public static void main(String args[])
        {
                try
                {
                        int a=args.length;
                        System.out.println("a = "+a);
                        int b=42/a;
                        int c[]={1};
                        c[42]=9;   
                }
                catch(ArithmeticException e)
                {
                        System.out.println("Division by zero");
                        System.out.println(e);
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                        System.out.println("Array index of out of bound");
                }
                System.out.println("Completion of try-catch block");
        }
}
