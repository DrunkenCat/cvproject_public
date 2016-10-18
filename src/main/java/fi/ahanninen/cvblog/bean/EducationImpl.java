package fi.ahanninen.cvblog.bean;

public class EducationImpl implements Education {
	
	private int educationId;
	private String schoolName;
	private String title;
	private String degree;
	private String schoolStartDate;
	private String schoolEndDate;
	private Double average;
	private String thesis;
	private int thesisGrade;
	
	public int getEducationId() {
		return educationId;
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSchoolStartDate() {
		return schoolStartDate;
	}
	public void setSchoolStartDate(String schoolStartDate) {
		this.schoolStartDate = schoolStartDate;
	}
	public String getSchoolEndDate() {
		return schoolEndDate;
	}
	public void setSchoolEndDate(String schoolEndDate) {
		this.schoolEndDate = schoolEndDate;
	}
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	public String getThesis() {
		return thesis;
	}
	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	public int getThesisGrade() {
		return thesisGrade;
	}
	public void setThesisGrade(int thesisGrade) {
		this.thesisGrade = thesisGrade;
	}
	
	@Override
	public String toString() {
		return "EducationImpl [educationId=" + educationId + ", schoolName="
				+ schoolName + ", title=" + title + ", degree=" + degree
				+ ", schoolStartDate=" + schoolStartDate + ", schoolEndDate="
				+ schoolEndDate + ", average=" + average + ", thesis=" + thesis
				+ ", thesisGrade=" + thesisGrade + "]";
	}
}
