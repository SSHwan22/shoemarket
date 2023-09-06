package com.market.jpa.shoesjpa.dto.user.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserRequest {

	private Long userNo;
	private String id;
	private String password;
	private String name;
	private String email;
	private String phone;
}
