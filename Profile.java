public class Profile
{
	private int patientId;
	private String name;
	private String address;
	private String contactNo;
	private String email;
	private String cnic;
	public int getPatientId() 
	{
		return patientId;
	}
	public void setPatientId(int patientId) 
	{
		this.patientId = patientId;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getContactNo() 
	{
		return contactNo;
	}
	public void setContactNo(String contactNo) 
	{
		this.contactNo = contactNo;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getCnic() 
	{
		return cnic;
	}
	public void setCnic(String cnic) 
	{
		this.cnic = cnic;
	}
	public Profile(int patientId, String name, String address, String contactNo, String email, String cnic) 
	{
		super();
		this.patientId = patientId;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
		this.email = email;
		this.cnic = cnic;
		
	}
	
		
	
}
