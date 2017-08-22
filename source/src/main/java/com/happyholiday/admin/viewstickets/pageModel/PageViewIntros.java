package com.happyholiday.admin.viewstickets.pageModel;

import java.sql.Timestamp;

public class PageViewIntros extends BaseReceivePage {
	private String id;
	private String viewName;
	private String viewId;
	private String textDescription;
	private String textDescriptionTwo;
	private String textDescriptionThree;
	private String introduction;
	private String introductionTwo;
	private String introductionThree;
	private Boolean isDelete;
	private Timestamp createTime;
	
	
	//查询条件
	private String searchViewName;
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public String getSearchViewName() {
		return searchViewName;
	}
	public void setSearchViewName(String searchViewName) {
		this.searchViewName = searchViewName;
	}
	public String getTextDescriptionTwo() {
		return textDescriptionTwo;
	}
	public void setTextDescriptionTwo(String textDescriptionTwo) {
		this.textDescriptionTwo = textDescriptionTwo;
	}
	public String getTextDescriptionThree() {
		return textDescriptionThree;
	}
	public void setTextDescriptionThree(String textDescriptionThree) {
		this.textDescriptionThree = textDescriptionThree;
	}
	public String getIntroductionTwo() {
		return introductionTwo;
	}
	public void setIntroductionTwo(String introductionTwo) {
		this.introductionTwo = introductionTwo;
	}
	public String getIntroductionThree() {
		return introductionThree;
	}
	public void setIntroductionThree(String introductionThree) {
		this.introductionThree = introductionThree;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getViewId() {
		return viewId;
	}
	public void setViewId(String viewId) {
		this.viewId = viewId;
	}
	public String getTextDescription() {
		return textDescription;
	}
	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
}
