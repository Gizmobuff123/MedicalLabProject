
public class Finance 
{
	private static int amountInDashboard = 0;
	
	Finance(int t)
	{
		 super();
		 amountInDashboard=amountInDashboard+t;
	}

	public static int getAmountInDashboard() 
	{
		 return amountInDashboard;
	}
}
