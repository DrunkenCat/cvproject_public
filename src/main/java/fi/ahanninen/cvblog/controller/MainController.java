package fi.ahanninen.cvblog.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.ahanninen.cvblog.bean.BioImpl;
import fi.ahanninen.cvblog.dao.CvDao;

@Controller
public class MainController {
	
	@Inject
	private CvDao cvdao;	
	public CvDao getCvdao() {
		return cvdao;
	}
	public void setCvdao(CvDao cvdao) {
		this.cvdao = cvdao;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getBio (Model model) {
		
		BioImpl bio = (BioImpl) cvdao.fetchBio();
		model.addAttribute("bio", bio);
			
		return "index";
	}
}
