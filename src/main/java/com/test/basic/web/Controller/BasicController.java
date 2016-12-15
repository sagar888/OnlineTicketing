package com.test.basic.web.Controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.basic.web.entity.AffectedPlaces;
import com.test.basic.web.entity.User;
import com.test.basic.web.services.RequoteSummary;
import com.test.basic.web.utils.BasicSession;

@Controller
@RequestMapping("/requote")
public class BasicController {
	
	@Inject
	private RequoteSummary requoteSummary;
	
	@Inject
	private BasicSession basicSession;
	
	@GetMapping(value="/list")
	public ModelAndView getRequoteSummary(@RequestParam(value ="serialId") String serialId){
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("list");
		User user = requoteSummary.getRequoteSyummary(serialId);
		modelAndView.addObject("user", user);
		basicSession.saveDataInSession("UserData", user);
		return modelAndView;
		
	}
	
	@PostMapping(value="/affectedProduct")
	public ModelAndView getAffectedRequote(){
		
		int id = 1;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("affected");
		User user = (User) basicSession.getDataFromSession("UserData");
		AffectedPlaces affProd = requoteSummary.getAffectedPlaces(user.getId());
		//modelAndView.addObject("affProd", affProd);
		modelAndView.addObject("basicSession", basicSession);
		return modelAndView;
		
	}
	
	
	


}
