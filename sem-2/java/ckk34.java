// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk34.java
// checking of String class
// ********************************************************
class ckkprg034
{
        public static void main(String args[])
        {
                String o1="God";
                String o2=" is";
                String o3=" great";
                String o4=o1+o2+o3;
                String o5;
                o5=o4;
                System.out.println(o4);
                System.out.println("o1 = "+o1.length());
                System.out.println("o1 == o2 is "+o1.equals(o2));
                System.out.println("3'rd character of o1 = "+o1.charAt(2));
                System.out.println("o5 = "+o5);
                o5="Hello how are U";
                o5=o5+", OK";
                System.out.println("o5 = "+o5);
                o3="Good";
                System.out.println("o3 = "+o3);
                System.out.println("o4 = "+o4);
                
        }
}