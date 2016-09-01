package com.gontuseries.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionControlller {


	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");

		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage","Gontu College of Engineering, India");
	}

	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1, BindingResult result) {
		if(result.hasErrors()){
			ModelAndView model= new ModelAndView("AdmissionForm");
			return model;
		}


		ModelAndView model = new ModelAndView("AdmissionSuccess");
		
		
		return model;
	}
	
}

