class NewThread implements Runnable 
{
	String name;
	int n;
	long time;
	Thread t;
	NewThread(String s,int n,long th)
	{
		name=s;
		this.n=n;
		time=th;
		t= new Thread(this,name);
		t.start();
	}
	public void run()
	{
		for(int i=n;i>0;i--)
		{
			System.out.println(name);
			try
			{ 
			Thread.sleep(time);
			} 
			catch(InterruptedException e)
			{
				System.out.println("Interrupted");
			}
		}
	}
}
class MultiThread 
{
	public static void main(String args[])
	{
		new NewThread("BMS COLLEGE OF ENGINEERING",2,10000);
		new NewThread("CSE",10,1000);
	}
}
		