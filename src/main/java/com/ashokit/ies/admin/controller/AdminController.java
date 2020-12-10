package com.ashokit.ies.admin.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ashokit.ies.admin.model.AdminModel;
import com.ashokit.ies.admin.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	/**
	 * GetMethod to show the form page
	 * @param model
	 * @return
	 */
	@GetMapping("/login")    
    public String showform(Model model){    
        model.addAttribute("adminmodel", new AdminModel());  
        return "footer";   
    }    
	
	/**
	 * Post Method doing save method operations
	 * @param adminModel
	 * @return
	 */
	@PostMapping("/saveadmin")
	public String saveAdminDetails(@ModelAttribute("adminmodel") AdminModel adminModel) {
		//copy data from adminmodel to adminservice
		BeanUtils.copyProperties(adminModel, adminService);
		//call service method
		adminService = (AdminService) adminService.saveDetails(adminModel);
		return "redirect:/viewadmin";
	}

}
