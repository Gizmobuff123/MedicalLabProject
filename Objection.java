package medicalLabEntities;

public class Objection 
{
	private int objectionId;
	private int profileId;
	private String description;
	public int getObjectionId() 
	{
		return objectionId;
	}
	public void setObjectionId(int objectionId) 
	{
		this.objectionId = objectionId;
	}
	public int getProfileId() 
	{
		return profileId;
	}
	public void setProfileId(int profileId) 
	{
		this.profileId = profileId;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
}

