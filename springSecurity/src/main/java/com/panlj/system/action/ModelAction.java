package com.panlj.system.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.ui.Model;


public class ModelAction<T> {
	/**
	 * 当前页码
	 */
	private int pageNumber = 1 ;
	/**
	 * 页面大小
	 */
	private int pagzSize = 15;
	/**
	 * 总页面数量
	 */
	private int totalPage = 0;
	private String sortType;
	/**
	 * 排序
	 */
	private Sort sort;
	
	/**
	 *  查询结果集
	 */
	private List<T> rows = new ArrayList<T>();
	/**
	 * 	页面显示分页区间
	 */
	private List<Integer> pageRage = new ArrayList<Integer>();
	
	/**
	 * 【姓名】    panlj
	 * 【日期】    2013-6-19
	 * 【时间】    下午12:49:51
	 * 【说明】     pageNumber 为当前页数	 new PageRequest()中 默认初始页为0 
	 * @return
	 */
	public PageRequest buildPageRequest(HttpServletRequest request) {
		
		if(StringUtils.isNotEmpty(request.getParameter("pageNumber")) &&  StringUtils.isNumeric(request.getParameter("pageNumber"))){
			pageNumber = Integer.parseInt(request.getParameter("pageNumber")) ;
		}
		if(StringUtils.isNotEmpty(request.getParameter("pagzSize")) &&  StringUtils.isNumeric(request.getParameter("pagzSize"))){
			pagzSize = Integer.parseInt(request.getParameter("pagzSize")) ;
		}
        if (sort==null) {
            sort = new Sort(Direction.DESC, "id");
        } 
        return new PageRequest(pageNumber-1, pagzSize, sort);
    }
	
	/**
	 * 【姓名】    panlj
	 * 【日期】    2013-6-19
	 * 【时间】    下午2:33:23
	 * 【说明】     设置返回客户端的分页参数
	 * @param model
	 */
	public void pageHandle(Model model){
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("pagzSize", pagzSize);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("rows", rows);
		model.addAttribute("pageRage", getPageRange());
	}
	
	/**
	 * 【姓名】    panlj
	 * 【日期】    2013-6-19
	 * 【时间】    下午2:37:28
	 * 【说明】     定义查询条件
	 * @return
	 */
	public Specification<T> buildSpecification(){
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public JpaSpecificationExecutor<T> setDomainRepository(Object dao){
		return (JpaSpecificationExecutor<T>)dao;
	}
	
	/**
	 * 【姓名】    panlj
	 * 【日期】    2013-6-19
	 * 【时间】    下午2:36:43
	 * 【说明】    条件分页查询 
	 * @param specification
	 * @param pageable
	 * @param dao
	 * @param model
	 * @return
	 */
	public Page<T> findAll(Specification<T> specification,Pageable pageable ,Object dao,Model model ){
		Page<T> page = setDomainRepository(dao).findAll(specification, pageable);
		if(page!=null){
			totalPage = page.getTotalPages();
			rows = page.getContent();
		}
		pageHandle(model);
		return page;
	}
	
	public List<Integer> getPageRange(){
		pageRage.clear();
		int currentPage = getPageNumber();
		
		int min = 1;//最小值
		int maxStep= 6;//除最小值 最大增加分页按钮个数
		int totalCount = min+maxStep;//总按钮个数
		
		
		if(totalPage<=totalCount || currentPage+(currentPage-1)<=totalCount){
			//1,（总页数小于最大按钮数）或者（当前按钮数值+该数值前所有的按钮数量 ）时  显示所有页数
			for(int i=min;i<=totalCount;i++){
				pageRage.add(i);
			}
		}else if(currentPage+(currentPage-1)>=totalPage){
			//2,当前按钮数值+该数值前所有的按钮数量>总页面数时  显示 总页面数 前的总按钮个数
			for(int i=(totalPage-maxStep);i<=totalPage;i++){
				pageRage.add(i);
			}
		}else{
			for(int i=-3;i<=3;i++){
				if(currentPage+i>0 && currentPage+i<=totalPage){
					pageRage.add(currentPage+i);
				}
			}
		}
		return pageRage;
	}
	
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber<0){
			this.pageNumber = 0;
		}
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
