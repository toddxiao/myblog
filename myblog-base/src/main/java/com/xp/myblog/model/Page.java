package com.xp.myblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;


/**
 * The persistent class for the page database table.
 * 
 */
@Entity
@Table(name="page")
public class Page extends IdEntity {

	@Column(nullable=false, length=1)
	private String pageCommentable;

	@Column(nullable=false)
	private int pageCommentCount;

	@Lob
	@Column(nullable=false)
	private String pageContent;

	@Column(length=20)
	private String pageEditorType;

	@Column(nullable=false, length=255)
	private String pageOpenTarget;

	@Column(nullable=false)
	private int pageOrder;

	@Column(nullable=false, length=255)
	private String pagePermalink;

	@Column(nullable=false, length=255)
	private String pageTitle;

	@Column(nullable=false, length=10)
	private String pageType;

	public Page() {
	}

	public String getPageCommentable() {
		return this.pageCommentable;
	}

	public void setPageCommentable(String pageCommentable) {
		this.pageCommentable = pageCommentable;
	}

	public int getPageCommentCount() {
		return this.pageCommentCount;
	}

	public void setPageCommentCount(int pageCommentCount) {
		this.pageCommentCount = pageCommentCount;
	}

	public String getPageContent() {
		return this.pageContent;
	}

	public void setPageContent(String pageContent) {
		this.pageContent = pageContent;
	}

	public String getPageEditorType() {
		return this.pageEditorType;
	}

	public void setPageEditorType(String pageEditorType) {
		this.pageEditorType = pageEditorType;
	}

	public String getPageOpenTarget() {
		return this.pageOpenTarget;
	}

	public void setPageOpenTarget(String pageOpenTarget) {
		this.pageOpenTarget = pageOpenTarget;
	}

	public int getPageOrder() {
		return this.pageOrder;
	}

	public void setPageOrder(int pageOrder) {
		this.pageOrder = pageOrder;
	}

	public String getPagePermalink() {
		return this.pagePermalink;
	}

	public void setPagePermalink(String pagePermalink) {
		this.pagePermalink = pagePermalink;
	}

	public String getPageTitle() {
		return this.pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getPageType() {
		return this.pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

}