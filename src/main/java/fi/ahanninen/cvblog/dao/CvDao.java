package fi.ahanninen.cvblog.dao;

import java.util.ArrayList;

import fi.ahanninen.cvblog.bean.Bio;
import fi.ahanninen.cvblog.bean.Education;
import fi.ahanninen.cvblog.bean.Job;
import fi.ahanninen.cvblog.bean.Project;


public interface CvDao {

	public abstract ArrayList<Job> fetchJobs();

	public abstract ArrayList<Education> fetchEducation();
	
	public abstract ArrayList<Project> fetchProjects();

	public abstract Bio fetchBio();

}
