package com.app.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.bean.EmployeeBean;
import com.app.service.dao.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository profileRepository;
	
	@RequestMapping("/profiles")
	public EmployeeBean[] all() {
		List<EmployeeBean> profiles = profileRepository.getAllProfiles();
		return profiles.toArray(new EmployeeBean[profiles.size()]);
	}
	
	@RequestMapping("/profiles/{id}")
	public EmployeeBean byId(@PathVariable("id") String userId) {
		EmployeeBean EmployeeBean = profileRepository.getProfile(userId);
		return EmployeeBean;
	}
}
