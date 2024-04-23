package githubApplication;

public abstract class Github {
	private int github_id;
	private String github_username;
	private String password;
	
	public abstract void Commit(); 
	public abstract void Clone();
	public abstract void Push();
	public abstract void Pull();
	
	public Github()
	{
		github_id = 0;
		github_username = "NA";
		password = "NA";
	}
	
	public Github(int github_id, String github_username,String password)
	{
		this.github_id = github_id;
		this.github_username = github_username;
		this.password = password;
	}
	
	public String toString()
	{
		return " Github ID = " + github_id + 
			   ", Github Username = " + github_username + 
			   ", Github Password = " + password;
	}
	

}
