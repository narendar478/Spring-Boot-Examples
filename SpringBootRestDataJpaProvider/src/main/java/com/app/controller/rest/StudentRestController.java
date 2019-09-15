package com.app.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.IStudentService;

@RestController
@RequestMapping("/rest/student")
public class StudentRestController {
	@Autowired
	private IStudentService service;
	
	
	//1. save student data
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Student student){
		ResponseEntity<String> resp=null;
		
		try {
			Integer id=service.saveStudent(student);
			resp=new ResponseEntity<String>("Student '"+id+"' created",HttpStatus.OK);
		}catch (Exception e) {
			resp=new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		
		
		return resp;
	}
	
	
	//2. get All Records
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
		ResponseEntity<?> resp=null;
		
		List<Student> list=service.getAllStudents();
		
		if(list==null || list.isEmpty()) {
			String message="No Data Found";
			resp=new ResponseEntity<String>(message,HttpStatus.OK);
		}else {
			resp=new ResponseEntity<List<Student>>(list,HttpStatus.OK);
		}
		return resp;
	}
	
	//3. delete based on id , if exist
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(
			@PathVariable Integer id){
		ResponseEntity<String> resp=null;
		
		//check for exist
		boolean present=service.isPresent(id);
		if(present) { //if exist
			service.deleteStudent(id);
			resp=new ResponseEntity<String>("Deleted '"+id+"' successfully",HttpStatus.OK);
		}else { //not exist
			resp=new ResponseEntity<String>("'"+id+"' Not Exist",HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	//4. update data
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Student student){
		ResponseEntity<String> resp=null;
		
		//check for id exist
		boolean present=service.isPresent(student.getStdId());
		if(present) { //if exist
			service.updateStudent(student);
			resp=new ResponseEntity<String>("Updated Successfully",HttpStatus.OK);
		}else { //not exist
			resp=new ResponseEntity<String>("Record '"+student.getStdId()+"' not found",HttpStatus.BAD_REQUEST);
		}
		
		return resp;
	}
	
	
	
	
	
	
	
	
	
	
}
