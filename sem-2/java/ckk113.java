// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk113.java
// multi thread
// ********************************************************
class NewThread3 implements Runnable
{
        String nm;
        Thread t;
        NewThread3(String thrdnm)
        {
                nm=thrdnm;
                t=new Thread(this,nm);
                System.out.println("New thread : "+t);
                t.start();
        }
        public void run()
        {
                try
                {
                        for(int i=1;i<=5;i++)
                        {
                                System.out.println(nm+" : "+i);
                                Thread.sleep(1000);
                        }
                }
                catch(InterruptedException e)
                {
                        System.out.println("Child is interrupted");
                }
                System.out.println(nm+" exiting");
        }
}
class ckkprg113
{
        public static void main(String args[])
        {
                new NewThread3("One");
                new NewThread3("Two");
                new NewThread3("Three");
                try
                {
                        Thread.sleep(10000);
                }
                catch(InterruptedException e)
                {
                        System.out.println("Main thread interrupted");
                }
                System.out.println("Main thread exited");
        }
}

