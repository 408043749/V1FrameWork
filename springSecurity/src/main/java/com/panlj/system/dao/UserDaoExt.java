package com.panlj.system.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.panlj.system.domain.User;

@Repository
public class UserDaoExt implements IUserDaoExt<User>{
	@PersistenceContext
	private EntityManager entityManager;
	
}
