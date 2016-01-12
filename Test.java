
public class Test
{
	private int testCode;
	private String description;
	
	public int getTestCode() 
	{
		return testCode;
	}
	

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}


	public Test(int testCode) 
	{
		super();
		this.testCode = testCode;
	}
}
