package com.image.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.image.entity.Student;
import com.image.service.StudentService;

@RestController
@RequestMapping(value = "/files")
public class ImageController {
	@Autowired
	private StudentService studentService;

	// Upload File in Folder
  //	public static String uploadDirectory = System.getProperty("user.dir") + "/src/main/resources/static/images";
	// API for testing purpose

	@GetMapping(value = "/test")
	public String home() {
		return "Welcome to Image Uploading app in spring boot";
	}

	@PostMapping(value = "/upload")
	public Student saveStudent(@ModelAttribute Student student, @RequestParam("image") MultipartFile file)
			throws IOException {
		
		
	/*	// Upload File in Folder
	 
		String originalFileName = file.getOriginalFilename();
		Path fileNameAndPath = Paths.get(uploadDirectory, originalFileName);
		Path fileNameAndPath = Paths.get(originalFileName);
	*/
		
		// Upload File in DataBase
		String originalFileName = file.getOriginalFilename();
		student.setProfileImage(originalFileName);


		return studentService.savaStudentData(student);
	}
}
