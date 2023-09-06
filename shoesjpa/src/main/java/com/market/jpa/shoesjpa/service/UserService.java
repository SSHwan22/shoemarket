package com.market.jpa.shoesjpa.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.market.jpa.shoesjpa.domain.User;
import com.market.jpa.shoesjpa.dto.user.request.UserRequest;
import com.market.jpa.shoesjpa.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	
	@Transactional
	public Long createUser(User user) {
		 userRepository.save(user);
		 return userRequest.getUserNo();
	}

}
