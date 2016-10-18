package fi.ahanninen.cvblog.bean;

public interface Job {

	public abstract int getJobId();
	public abstract void setJobId(int jobId);

	public abstract String getFirmName();
	public abstract void setFirmName(String firmName);

	public abstract String getJobAssignment();
	public abstract void setJobAssignment(String jobAssignment);
	
	public abstract String getJobStartDate();	
	public abstract void setJobStartDate(String jobStartDate);
	
	public abstract String getJobEndDate();	
	public abstract void setJobEndDate(String jobEndDate);
	
	public abstract String getJobDescription();
	public abstract void setJobDescription(String jobDescription);
	
}
