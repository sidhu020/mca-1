// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk120.java
// 
// ********************************************************
class Q
{
        int n;
        boolean v=false;  
      	synchronized void get()
        {
		while(!v)
		{
			try
			{ wait();}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted exception caught");
			}
		}	
	        System.out.println("Got : "+n);
		v=false;
		notify();			
		        	
	}
        synchronized void put(int n)
        {
		while(v)
		try
		{ 
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted exception caught");
		}	
               	this.n=n;
		v=true;
               	System.out.println("Put : "+n);
		notify();
        }
}
class Producer implements Runnable
{
        	Q q;
        	Producer(Q q)
        	{
                		this.q=q;
                		new Thread(this,"Producer").start();
        	}
        	public void run()
        	{
                		int i=0;
                		while(true)
                		{
                        		q.put(i++);
                		}
        	}
}

class Consumer implements Runnable
{
       	Q q;
       	Consumer(Q q)
       	{
               	this.q=q;
               	new Thread(this,"Consumer").start();
       	}
       	public void run()
       	{
               	while(true)
               	q.get();
       	}
}

class ckkprg120
{
       	public static void main(String args[])
       	{
               		Q q=new Q();
               		new Producer(q);
               		new Consumer(q);
               		System.out.println("Press Ctrl+c");
       	}
}
