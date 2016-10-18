package fi.ahanninen.cvblog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import fi.ahanninen.cvblog.bean.Education;
import fi.ahanninen.cvblog.bean.EducationImpl;

public class EducationRowMapper implements RowMapper<Education> {

	public Education mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Education education = new EducationImpl();
		SimpleDateFormat sdf = new SimpleDateFormat ("dd.MM.yyyy");
		
		education.setEducationId(rs.getInt("educationId"));
		education.setSchoolName(rs.getString("schoolName"));
		education.setTitle(rs.getString("title"));
		education.setDegree(rs.getString("degree"));
		
		try {
			education.setSchoolStartDate(sdf.format(rs.getDate("schoolStartDate")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (rs.getDate("schoolEndDate") != null) {
			try {
				education.setSchoolEndDate(sdf.format(rs.getDate("schoolEndDate")));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		
		if (rs.getDouble("average") != 0.0) {
			education.setAverage(rs.getDouble("average"));
		} else {
			education.setAverage(null);
		}
		
		
		education.setThesis(rs.getString("thesis"));
		education.setThesisGrade(rs.getInt("thesisGrade"));
		
		return education;
	}

}
