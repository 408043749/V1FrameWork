package com.panlj.system.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panlj.system.domain.Menu;

interface IMenuDaoExt<T>{
}

public interface MenuDao extends JpaRepository<Menu,Long>,IMenuDaoExt<Menu>{
	public List<Menu> findByParent_Id(String id);
	public Menu findById(String id);
}
