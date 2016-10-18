package fi.ahanninen.cvblog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.ahanninen.cvblog.bean.Project;
import fi.ahanninen.cvblog.bean.ProjectImpl;

public class ProjectRowMapper implements RowMapper<Project> {

	public Project mapRow(ResultSet rs, int rownum) throws SQLException {
		
		Project project = new ProjectImpl();
		
		project.setProjectId(rs.getInt("projectId"));
		project.setProjectName(rs.getString("projectName"));
		project.setProjectRole(rs.getString("projectRole"));
		project.setProjectDescription(rs.getString("projectDescription"));
		project.setProjectUrl(rs.getString("projectUrl"));
		project.setJobId(rs.getInt("jobId"));
		project.setEducationId(rs.getInt("educationId"));
		
		return project;
	}

}
