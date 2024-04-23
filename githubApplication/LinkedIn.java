package githubApplication;

public abstract class LinkedIn {
	private int Linkedin_id;
	private String Linkedin_username;
	private String password;
	
	public abstract void UploadingResume();
	public abstract void EducationalBackground();
	public abstract void AddSkills();
	public abstract void AddingSocialMediaLinks();
	
	public LinkedIn()
	{
		Linkedin_id = 0;
		Linkedin_username = "NA";
		password = "NA";
	}
	
	public LinkedIn(int Linkedin_id,String Linkedin_username,String password)
	{
		this.Linkedin_id = Linkedin_id;
    	this.Linkedin_username = Linkedin_username;
		this.password = password;
	}
	
	public String toString()
	{
		return "Linkedin ID = " + Linkedin_id +
			   ", Linkedin Username = " + Linkedin_username + 
			   ", Linkedin Password = " + password;
	}

}
