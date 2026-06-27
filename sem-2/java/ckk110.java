// ********************************************************
// Program by Dr. CK Kumbharana
// program name ckk110.java
// create main thread
// ********************************************************
class ckkprg110
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println("Current thread :"+t);	
		t.setName("CKK thread");
		System.out.println("Name after change :"+t);	
		try
		{
			for(int n=5;n>0;n--)	
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
	}
}	
