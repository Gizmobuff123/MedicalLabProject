package medicalLabEntities;

public class Profile
{
	private int profileId;
	private String name;
	private String address;
	private String contactNo;
	private String email;
	private String cnic;
	public int getProfileId() 
	{
		return profileId;
	}
	public void setProfileId(int profileId) 
	{
		this.profileId = profileId;
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
	public Profile(int profileId, String name, String address, String contactNo, String email, String cnic, int testCode) 
	{
		super();
		this.profileId = profileId;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
		this.email = email;
		this.cnic = cnic;
	
	}
	public Profile()
	{
		super();
	}	
}

