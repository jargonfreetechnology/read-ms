package com.acontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.User;

@RestController //http://localhost:9020/read
public class ReadController {

	@Autowired
	private com.bservice.IreadService readService;
	
	@GetMapping("/read")
	public List<User> read() {

		List<User> userList = readService.findAllUser();
		
		return userList;

	}
}