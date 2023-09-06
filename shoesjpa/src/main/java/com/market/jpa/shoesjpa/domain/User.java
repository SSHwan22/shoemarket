package com.market.jpa.shoesjpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
public class User {

	@Id @GeneratedValue 
	private Long userNo;
	
	private String id;
	private String password;
	private String name;
	private String email;
	private String phone;
	
	@OneToMany(mappedBy = "user")
	private List<Order> orders = new ArrayList<>();
}
