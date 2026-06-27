// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk118.java
// priority thread
// ********************************************************
class Callme
{
        void call(String msg)
        {
                System.out.print("["+msg);
                try
                {
                        Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                        System.out.println("Interrupted");
                }
                System.out.println("]");
        }
}
class Caller implements Runnable
{
        String msg;
        Callme tg;
        Thread t;
        Caller(Callme tg1,String s)
        {
                tg=tg1;
                msg=s;
                t=new Thread(this);
                t.start();
        }
        public void run()
        {
                synchronized(tg)
                {
                        tg.call(msg);
                }
        }
}
class ckkprg118
{
        public static void main(String args[])
        {
                Callme tg2=new Callme();
                Caller o1=new Caller(tg2,"GOD");
                Caller o2=new Caller(tg2,"Bhagvan");
                Caller o3=new Caller(tg2,"allmighty");

                try
                {
                        o1.t.join();
                        o2.t.join();
                        o3.t.join();
                }
                catch(InterruptedException e)
                {
                        System.out.println("Interrupted");
                }
        }
}


