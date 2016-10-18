package fi.ahanninen.cvblog.bean;

public interface Project {

	public abstract int getProjectId();
	public abstract void setProjectId(int projectId);
	
	public abstract String getProjectName();
	public abstract void setProjectName(String projectName);
	
	public abstract String getProjectRole();
	public abstract void setProjectRole(String projectRole);
	
	public abstract String getProjectDescription();
	public abstract void setProjectDescription(String projectDescription);
	
	public abstract String getProjectUrl();
	public abstract void setProjectUrl (String projectUrl);
	
	public abstract int getJobId();
	public abstract void setJobId(int jobId);
	
	public abstract int getEducationId();
	public abstract void setEducationId(int educationId);
	
}
