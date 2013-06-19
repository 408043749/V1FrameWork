package com.panlj.blog.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * 【作者】 		潘林江
 * 【创建日期 】 2013-5-25 下午5:53:02
 * 【更新时间 】 
 * 【更新者 】 
 * 【标签】   	
 * 【说明】	文章
 */
@Entity
public class Article implements Serializable{
	private static final long serialVersionUID = 3339113011949668608L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 关键字
	 */
	private String keyWord;
	
	/**
	 * 内容
	 */
	@Lob
	@Basic(fetch=FetchType.LAZY)
	private String content;
	
	
	/**
	 * 操作信息
	 */
	@Embedded
	private OperateMsg operateMsg;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getKeyWord() {
		return keyWord;
	}


	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public OperateMsg getOperateMsg() {
		return operateMsg;
	}


	public void setOperateMsg(OperateMsg operateMsg) {
		this.operateMsg = operateMsg;
	}
	
	
}
