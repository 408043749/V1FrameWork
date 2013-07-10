package com.panlj.system.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class AbstractTree implements Serializable{

	private static final long serialVersionUID = -5334980797651496255L;
	
	
	@Id 
	@GeneratedValue(generator="uuidGenerator")
	@GenericGenerator(name="uuidGenerator", strategy = "uuid")
	private String uuid;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 是否叶子
	 */
	private Boolean isLeaf;
	
	/**
	 * 树形UUID链
	 */
	private String treePath;
	
	/**
	 * 是否启用
	 */
	private Boolean isEnable;
	
	/**
	 * 序号
	 */
	private int sequence;


	public Boolean getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getTreePath() {
		return treePath;
	}

	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}

	public Boolean getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
