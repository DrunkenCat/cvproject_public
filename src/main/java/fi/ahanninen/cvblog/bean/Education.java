package fi.ahanninen.cvblog.bean;

public interface Education {
	
	public abstract int getEducationId();
	public abstract void setEducationId(int educationId);
	
	public abstract String getSchoolName();
	public abstract void setSchoolName(String schoolName);
	
	public abstract String getTitle();
	public abstract void setTitle(String title);
	
	public abstract String getDegree();
	public abstract void setDegree(String degree);
	
	public abstract String getSchoolStartDate();
	public abstract void setSchoolStartDate(String schoolStartDate);
	
	public abstract String getSchoolEndDate();
	public abstract void setSchoolEndDate(String schoolEndDate);
	
	public abstract Double getAverage();
	public abstract void setAverage(Double average);
	
	public abstract String getThesis();
	public abstract void setThesis(String thesis);
	
	public abstract int getThesisGrade();
	public abstract void setThesisGrade(int thesisGrade);
	
}
