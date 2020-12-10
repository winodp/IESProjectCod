package com.ashokit.ies.admin.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.admin.entity.AdminEntiity;
import com.ashokit.ies.admin.model.AdminModel;
import com.ashokit.ies.admin.repository.AdminRepo;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepo adminRepo;
	

	@Override
	public AdminEntiity saveDetails(AdminModel adminModel) {
		//create entity class object
		AdminEntiity adminEntiity = new AdminEntiity();
		//copy data adminmodel to adminentity
		BeanUtils.copyProperties(adminModel, adminEntiity);
		//call repository save() 
		adminEntiity = adminRepo.save(adminEntiity);
		//return result
		return adminEntiity;
	}
	

}
