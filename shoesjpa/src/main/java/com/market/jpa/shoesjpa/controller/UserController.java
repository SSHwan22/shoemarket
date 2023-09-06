package com.market.jpa.shoesjpa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.jpa.shoesjpa.dto.user.request.UserRequest;
import com.market.jpa.shoesjpa.dto.user.response.UserResponse;
import com.market.jpa.shoesjpa.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;
	
	@PostMapping("/create")
	public UserResponse createUser(UserRequest userRequest) {
		Long id = userService.createUser(userRequest);
		return new UserResponse(id);
	}
}
