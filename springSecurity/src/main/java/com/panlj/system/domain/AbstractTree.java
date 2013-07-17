package com.panlj.system.domain;

import java.io.Serializable;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class AbstractTree<T> implements Serializable{

	private static final long serialVersionUID = -5334980797651496255L;
	
	
	@Id 
	@GeneratedValue(generator="uuidGenerator")
	@GenericGenerator(name="uuidGenerator", strategy = "uuid")
	private String id;
	
	/**
	 * 名称
	 */
	private String name;

	/**
	 * 名称2  专EXT设计
	 */
	private String text;	
	
	/**
	 * 是否叶子
	 */
	private Boolean leaf;
	
	/**
	 * 树形UUID链
	 */
	private String treePath;
	
	/**
	 * 父节点UUID
	 */
	@ManyToOne(fetch=FetchType.EAGER)
	private T parent;
	
	/**
	 * 是否展开
	 */
	private Boolean expanded;
	
	/**
	 * 是否启用
	 */
	private Boolean isEnable;
	
	/**
	 * 序号
	 */
	private int sequence;



	public Boolean getLeaf() {
		return leaf;
	}

	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
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

	public T getParent() {
		return parent;
	}

	public void setParent(T parent) {
		this.parent = parent;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getExpanded() {
		return expanded;
	}

	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}

	

}
