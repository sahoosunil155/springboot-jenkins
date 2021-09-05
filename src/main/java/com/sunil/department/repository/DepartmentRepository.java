package com.sunil.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunil.department.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDeptId(long id);

}
