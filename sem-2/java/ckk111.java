// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk111.java
// createa thread ussing runnable interface
// ********************************************************
class NewThread1 implements Runnable
{
        Thread t;
        NewThread1()
        {
                t=new Thread(this,"New thread");
                System.out.println("Child thread "+t);
                t.start();
                System.out.println("Exit from constructor");
        }
        public void run()
        {
                try
                {
                        for(int i=1;i<=5;i++)
                        {
                                System.out.println("Child thread "+i);
                                Thread.sleep(250);
                        }
                }
                catch(InterruptedException e)
                {
                        System.out.println("Child thread interrupted "+e);
                }
                System.out.println("Exiting child thread");
        }
}
class ckkprg111
{
        public static void main(String args[])
        {
                Thread t1=Thread.currentThread();
                System.out.println("Current in main "+t1);
                new NewThread1();
                System.out.println("After create in main");
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

