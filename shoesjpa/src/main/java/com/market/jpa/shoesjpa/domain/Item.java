package com.market.jpa.shoesjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
public class Item {

	@Id @GeneratedValue
	private Long itemNo;
	
	private String itemCode;
	private String name;
	private int price;
	private String brand;
	private String description;
	private String imgLocation;
	
}           
