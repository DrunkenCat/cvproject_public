package fi.ahanninen.cvblog.bean;

public class ProjectImpl implements Project{
	
	private int projectId;
	private String projectName;
	private String projectRole;
	private String projectDescription;
	private String projectUrl;
	private int jobId;
	private int educationId;
	
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectRole() {
		return projectRole;
	}
	public void setProjectRole(String projectRole) {
		this.projectRole = projectRole;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getProjectUrl() {
		return projectUrl;
	}
	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getEducationId() {
		return educationId;
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}
	
	@Override
	public String toString() {
		return "ProjectImpl [projectId=" + projectId + ", projectName="
				+ projectName + ", projectRole=" + projectRole
				+ ", projectDescription=" + projectDescription
				+ ", projectUrl=" + projectUrl + ", jobId=" + jobId
				+ ", educationId=" + educationId + "]";
	}
	
}
