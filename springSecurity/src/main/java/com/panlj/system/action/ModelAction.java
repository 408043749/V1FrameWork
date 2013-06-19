package com.panlj.system.action;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;


public class ModelAction<T> {
	private int pageNumber = 1;
	private int pagzSize = 15;
	private String sortType;
	private Sort sort;
	
	public PageRequest buildPageRequest() {
        if (sort==null) {
            sort = new Sort(Direction.DESC, "id");
        } 
        return new PageRequest(pageNumber, pagzSize, sort);
    }
	
	public Specification<T> buildSpecification(){
		return null;
	}
	
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPagzSize() {
		return pagzSize;
	}
	public void setPagzSize(int pagzSize) {
		this.pagzSize = pagzSize;
	}
	public String getSortType() {
		return sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}
	
	
}
