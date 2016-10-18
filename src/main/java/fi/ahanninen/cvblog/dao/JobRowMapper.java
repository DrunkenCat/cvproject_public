package fi.ahanninen.cvblog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import fi.ahanninen.cvblog.bean.Job;
import fi.ahanninen.cvblog.bean.JobImpl;

public class JobRowMapper implements RowMapper<Job> {

	public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Job job = new JobImpl();		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd.MM.yyyy");
		
		job.setJobId(rs.getInt("jobId"));
		job.setFirmName(rs.getString("firmName"));
		job.setJobAssignment(rs.getString("jobAssignment"));
		
		try {
			job.setJobStartDate(sdf.format(rs.getDate("jobStartDate")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (rs.getDate("jobEndDate") != null) {
			try {
				job.setJobEndDate(sdf.format(rs.getDate("jobEndDate")));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		job.setJobDescription(rs.getString("jobDescription"));
		
		return job;
	}

}
