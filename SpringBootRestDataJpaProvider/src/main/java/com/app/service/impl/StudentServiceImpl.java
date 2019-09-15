package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Student;
import com.app.repo.StudentRepository;
import com.app.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository repo;
	
	@Transactional
	public Integer saveStudent(Student s) {
		return repo.save(s).getStdId();
	}

	@Transactional
	public void updateStudent(Student s) {
		repo.save(s);
	}

	@Transactional
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
	}

	@Transactional(readOnly = true)
	public Optional<Student> getOneStudent(Integer id) {
		return repo.findById(id);
	}

	@Transactional(readOnly = true)
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	
	@Transactional(readOnly = true)
	public boolean isPresent(Integer id) {
		return repo.existsById(id);
	}
	
	
	
	
	
}
