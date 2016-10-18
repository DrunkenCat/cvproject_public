package fi.ahanninen.cvblog.controller;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.ahanninen.cvblog.bean.Education;
import fi.ahanninen.cvblog.bean.Job;
import fi.ahanninen.cvblog.bean.Project;
import fi.ahanninen.cvblog.dao.CvDao;

@Controller
public class CvController{
	
	@Inject
	private CvDao cvdao;	
	public CvDao getCvdao() {
		return cvdao;
	}
	public void setCvdao(CvDao cvdao) {
		this.cvdao = cvdao;
	}
	
	//Fetch all jobs for work history
	@RequestMapping(value = "cv/workhistory", method = RequestMethod.GET)
	public String getJobs (Model model) {
			
		ArrayList<Job> jobs = cvdao.fetchJobs();	
		model.addAttribute("jobs", jobs);
		
		return "workhistory";
	}
	
	//Fetch all degrees for education
	@RequestMapping(value = "cv/education", method = RequestMethod.GET)
	public String getEd (Model model) {
		
		ArrayList<Education> education = cvdao.fetchEducation();
		model.addAttribute("education", education);
		
		return "education";
	}
	
	//Fetch all projects
	@RequestMapping(value = "cv/projects", method = RequestMethod.GET)
	public String getProjects(Model model) {
		
		ArrayList<Project> projects = cvdao.fetchProjects();
		model.addAttribute("projects", projects);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		
		return "projects";
	}
	
}
