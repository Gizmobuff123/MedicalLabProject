
public class Deliverable extends Profile
{
	
	private int testCode;
	private String testReport;
	public int getTestCode()
	{
		 return testCode;
	}
	public void setTestCode(int testCode) 
	{
		 this.testCode = testCode;
	}
	public String getTestReport() 
	{
		 return testReport;
	}
	public void setTestReport(String testReport) 
	{
		 this.testReport = testReport;
	}
	public Deliverable(int patientId, String name, String address, 
			String contactNo, String email, String cnic, int testCode, String testReport) 
	{
		super(patientId, name, address, contactNo, email, cnic);
		this.testCode=testCode;
		this.testReport=testReport;	
	}
	
	
	
}
