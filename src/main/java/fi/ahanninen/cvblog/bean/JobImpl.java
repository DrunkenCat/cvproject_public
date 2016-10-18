package fi.ahanninen.cvblog.bean;

public class JobImpl implements Job{

	private int jobId;
	private String firmName;
	private String jobAssignment;
	private String jobStartDate;
	private String jobEndDate;
	private String jobDescription;
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
		
	}
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
		
	}
	public String getJobAssignment() {
		return jobAssignment;
	}
	public void setJobAssignment(String jobAssignment) {
		this.jobAssignment = jobAssignment;
		
	}
	public String getJobStartDate() {
		return jobStartDate;
	}
	public void setJobStartDate(String jobStartDate) {
		this.jobStartDate = jobStartDate;
		
	}
	public String getJobEndDate() {
		return jobEndDate;
	}
	public void setJobEndDate(String jobEndDate) {
		this.jobEndDate = jobEndDate;
		
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
		
	}
	@Override
	public String toString() {
		return "JobImpl [jobId=" + jobId + ", firmName=" + firmName
				+ ", jobAssignment=" + jobAssignment + ", jobStartDate="
				+ jobStartDate + ", jobEndDate=" + jobEndDate
				+ ", jobDescription=" + jobDescription + "]";
	}
	
}
