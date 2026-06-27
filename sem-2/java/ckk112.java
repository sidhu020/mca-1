// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk112.java
// createa thread ussing thread extendinbg
// ********************************************************
class NewThread1 extends Thread
{
        NewThread1()
        {
                super("New thread");
                System.out.println("Child thread "+this);
                start();
        }
        public void run() 
        {
                try
                {
                        for(int i=1;i<=5;i++)
                        {
                                System.out.println("Child thread "+i);
                                Thread.sleep(500);
                        }
                }
                catch(InterruptedException e)
                {
                        System.out.println("Child thread interrupted "+e);
                }
                System.out.println("Exiting child thread");
        }
}
class ckkprg112
{
        public static void main(String args[])
        {
                new NewThread1();
                try
                {
                        for(int i=1;i<=5;i++)
                        {
                                System.out.println("Main thread : "+i);
                                Thread.sleep(1000);
                        }
                }
                catch(InterruptedException e)
                {
                        System.out.println("Main thread exception");
                }
                System.out.println("Main thread Complterd");
        }
}
