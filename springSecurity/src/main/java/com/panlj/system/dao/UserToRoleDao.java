package com.panlj.system.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.panlj.system.domain.UserToRole;

interface IUserToRoleDaoExt<T>{
}

public interface UserToRoleDao extends PagingAndSortingRepository<UserToRole,Long>,JpaSpecificationExecutor<UserToRole>,IUserToRoleDaoExt<UserToRole> {
}
