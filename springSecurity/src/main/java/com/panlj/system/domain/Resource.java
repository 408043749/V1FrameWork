package com.panlj.system.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="Sys_Resource")
public class Resource extends AbstractTree<Resource> implements Serializable{

	private static final long serialVersionUID = -5334980797651496255L;
	
	
	
}
