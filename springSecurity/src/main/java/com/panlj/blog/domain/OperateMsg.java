package com.panlj.blog.domain;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.panlj.system.domain.User;

/**
 * 【作者】 		潘林江
 * 【创建日期 】 2013-5-25 下午5:43:11
 * 【更新时间 】 
 * 【更新者 】 
 * 【标签】   	
 * 【说明】		操作信息
 */
@Embeddable
public class OperateMsg {
	
	/**
	 * 新增操作用户者 
	 */
	@ManyToOne
	private User addedUser;
	
	/**
	 * 新增时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date addedTime;
	
	/**
	 * 更新操作用户者 
	 */
	@ManyToOne
	private User updatedUser;
	
	/**
	 * 更新时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;

	public User getAddedUser() {
		return addedUser;
	}

	public void setAddedUser(User addedUser) {
		this.addedUser = addedUser;
	}

	public Date getAddedTime() {
		return addedTime;
	}

	public void setAddedTime(Date addedTime) {
		this.addedTime = addedTime;
	}

	public User getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(User updatedUser) {
		this.updatedUser = updatedUser;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
}
