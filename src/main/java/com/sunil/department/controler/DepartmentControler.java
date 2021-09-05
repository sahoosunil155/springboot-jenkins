package com.sunil.department.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.department.entity.Department;
import com.sunil.department.repository.DepartmentRepository;

@RestController
@RequestMapping("/dept")
public class DepartmentControler {
	@Autowired
	private DepartmentRepository deptRepo;
	
	@PostMapping("/")
	public Department saveDept(@RequestBody Department dept) {
		return deptRepo.save(dept);
	}
	
	@GetMapping("/{id}")
	public Department getDeptById(@PathVariable("id") Long id) {
		return deptRepo.findByDeptId(id);
	}
}
