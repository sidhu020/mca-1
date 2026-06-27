// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk115.java
// priority thread
// ********************************************************
class Clicker implements Runnable
{
        long click=0;
        Thread t;
        String nm1;
        private boolean running=true;
        Clicker(int p,String nm)
        {
                nm1=nm;
                t=new Thread(this,nm);
                t.setPriority(p);
        }
        public void run()
        {
                while(running)
                        click++;
        }
        public void stop()
        {
                running=false;
        }
        public void start()
        {
                t.start();
        }
}
class ckkprg115
{
        public static void main(String args[])
        {
                Clicker o1=new Clicker(Thread.MAX_PRIORITY,"One");
                Clicker o2=new Clicker(Thread.NORM_PRIORITY,"Two");
                Clicker o3=new Clicker(Thread.MIN_PRIORITY,"Three");

                o1.start();
                o2.start();
                o3.start();
                try
                {
                        Thread.sleep(10000);
                }
                catch(InterruptedException e)
                {
                        System.out.println("Main thread interrupted");
                }

                o1.stop();
                o2.stop();
                o3.stop();
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
                System.out.println("Max priorty thread: "+o1.click);
                System.out.println("Get priorty thread: "+o2.click);
                System.out.println("Min priorty thread: "+o3.click);

                System.out.println("Main thread exited");
        }
}

