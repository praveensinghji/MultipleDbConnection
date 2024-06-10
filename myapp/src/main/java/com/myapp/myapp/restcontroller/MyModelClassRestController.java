package com.myapp.myapp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.myapp.model.MyModelClass;
import com.myapp.myapp.repo.MyModelClassRepo;

@RestController
public class MyModelClassRestController {
	private MyModelClassRepo repo;

	@Autowired
	public MyModelClassRestController(MyModelClassRepo repo) {
		this.repo = repo;
	}
	
	@GetMapping("/getModelData")
	public List<MyModelClass> MyModelAllData(){
		return repo.findAllModelData();
	}
}
