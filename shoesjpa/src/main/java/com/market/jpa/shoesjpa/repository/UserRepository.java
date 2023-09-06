package com.market.jpa.shoesjpa.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.market.jpa.shoesjpa.domain.User;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserRepository {

	private final EntityManager em;
	
	public void save(User user) {
		em.persist(user);
	}
}
