package fi.ahanninen.cvblog.dao;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import fi.ahanninen.cvblog.bean.Bio;
import fi.ahanninen.cvblog.bean.BioImpl;
import fi.ahanninen.cvblog.bean.Education;
import fi.ahanninen.cvblog.bean.Job;
import fi.ahanninen.cvblog.bean.Project;

public class CvDaoSpringJdbcImpl implements CvDao {

	@Inject
	public JdbcTemplate jdbcTemplate;
	public DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	 public JdbcTemplate getJdbctemplate() {
		return jdbcTemplate;
} 

	//Fetch all jobs for work history
	public ArrayList<Job> fetchJobs() {
		String sql = "SELECT jobId, firmName, jobAssignment, jobStartDate, jobEndDate, jobDescription "
				+ "FROM job "
				+ "ORDER BY jobStartDate DESC;";
		
		RowMapper<Job> mapper = new JobRowMapper();
		ArrayList<Job> jobs = (ArrayList<Job>) jdbcTemplate.query(sql, mapper);
		
		return jobs;
	}

	//Fetch all degrees for education
	public ArrayList<Education> fetchEducation() {
		String sql = "SELECT educationId, schoolName, title, degree, schoolStartDate, schoolEndDate, average, thesis, thesisGrade "
				+ "FROM education "
				+ "ORDER BY schoolStartDate DESC;";
		
		RowMapper<Education> mapper = new EducationRowMapper();
		ArrayList<Education> education = (ArrayList<Education>) jdbcTemplate.query(sql, mapper);
		
		return education;
	}
	
	//Fetch all projects
	public ArrayList<Project> fetchProjects() {
		String sql = "SELECT projectId, projectName, projectRole, projectDescription, projectUrl, jobId, educationId "
				+ "FROM project "
				+ "ORDER BY projectid DESC;";
		
		RowMapper<Project> mapper = new ProjectRowMapper();
		ArrayList<Project> projects = (ArrayList<Project>) jdbcTemplate.query(sql, mapper);
		
		return projects;
	}

	public Bio fetchBio() {
		String sql = "SELECT name, birthday, email, bioDescription, pictureUri "
				+ "FROM bio;";
		
		BioImpl bio = getJdbctemplate().queryForObject(
				sql, new Object[] { },
				new BeanPropertyRowMapper<BioImpl>(BioImpl.class));		
		
		return bio;
	}

}
