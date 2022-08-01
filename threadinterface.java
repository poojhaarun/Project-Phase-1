class Hi implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("welcome");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){
				
			}
		}
	}
}
class Hello implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("everyone");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){
				
			}
		}
	}
}
public class threadinterface {
	public static void main(String[] args)
	{
		Hi ob1 = new Hi();
		Hello ob2 = new Hello();
		Thread th1 = new Thread(ob1);
		Thread th2 = new Thread(ob2);
		th1.start();
		try{
			Thread.sleep(10);
		}
		catch(Exception e){
			
		}
		th2.start();
		
		
	}

}
