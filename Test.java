package MedicalLabPackage;


public class Test
{
	private int patientId;
	private int testCode;
	private String description;
	private int testRate;
	private String testReport;
	
	public String getTestReport() 
	{
		return testReport;
	}

	public void setTestReport(String testReport) 
	{
		this.testReport = testReport;
	}

	public int getTestCode() 
	{
		return testCode;
	}

	public String getDescription() 
	{
		return description;
	}
    

	public Test(int testCode) 
	{
		super();
		this.testCode = testCode;
		this.testReport="Report has not been recieved yet";
		this.testRate=0;
		if (this.testCode==101)
		{
			this.description="Dengue Test";
			this.testRate=2500;
		}
		else if (this.testCode==102)
		{
			this.description="Malaria Test";
			this.testRate=1500;
		}
		Finance f=new Finance(testRate);
		
	}

}

