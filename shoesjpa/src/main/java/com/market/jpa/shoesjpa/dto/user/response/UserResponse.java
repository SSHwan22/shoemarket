package com.market.jpa.shoesjpa.dto.user.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserResponse {
	
	private Long userNo;
	private String id;
	private String password;
	private String name;
	private String email;
	private String phone;
	
	public UserResponse() {
	}
	
	public UserResponse(Long userNo) {
		this.userNo = userNo;
	}
}
