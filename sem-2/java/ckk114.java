// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk114.java
// is alive and join
// ********************************************************
class NewThread4 implements Runnable
{
        String nm;
        Thread t;
        NewThread4(String thrdnm)
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
                System.out.println(nm+" : exiting");
        }
}
class ckkprg114
{
        public static void main(String args[])
        {
                NewThread4 o1=new NewThread4("One");
                NewThread4 o2=new NewThread4("Two");
                NewThread4 o3=new NewThread4("Three");
                System.out.println("Thread is alive "+o1.t.isAlive());
                System.out.println("Thread is alive "+o2.t.isAlive());
                System.out.println("Thread is alive "+o3.t.isAlive());
                try
                {
                        System.out.println("Threa is valiting-1");
                        o1.t.join();
                        System.out.println("Threa is valiting-2");
                        o2.t.join();
                        System.out.println("Threa is valiting-3");
                        o3.t.join();
                }
                catch(InterruptedException e)
                {
                        System.out.println("Main thread interrupted");
                }
                System.out.println("Thread is alive "+o1.t.isAlive());
                System.out.println("Thread is alive "+o2.t.isAlive());
                System.out.println("Thread is alive "+o3.t.isAlive());
                System.out.println("Main thread exited");
        }
}

