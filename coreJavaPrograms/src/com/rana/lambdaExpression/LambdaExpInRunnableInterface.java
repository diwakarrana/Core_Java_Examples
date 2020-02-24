package com.rana.lambdaExpression;

public class LambdaExpInRunnableInterface 
{

	public static void main(String[] args) 
	{
		Runnable r = ()->
		{           // lambda expression....
			for(int i=0; i<10; i++)
			{
				System.out.println("child thread");
				try 
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i< 10; i++)
		{
			System.out.println("main thread");
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
