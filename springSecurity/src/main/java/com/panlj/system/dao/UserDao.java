package com.panlj.system.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.panlj.system.domain.User;

interface IUserDaoExt<T>{
}

public interface UserDao extends PagingAndSortingRepository<User,Long>,JpaSpecificationExecutor<User>,IUserDaoExt<User> {
	public User findById(Long id);
	public User findByUsername(String username);
	public List<User> findByUsernameLike(String username);
}
