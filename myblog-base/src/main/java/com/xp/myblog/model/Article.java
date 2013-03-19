package com.xp.myblog.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the article database table.
 * 
 */
@Entity
@Table(name="article")
public class Article extends IdEntity {


	@Lob
	@Column(nullable=false)
	private String articleAbstract;

	@Column(nullable=false, length=255)
	private String articleAuthorEmail;

	@Column(nullable=false, length=1)
	private String articleCommentable;

	@Column(nullable=false)
	private int articleCommentCount;

	@Lob
	@Column(nullable=false)
	private String articleContent;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date articleCreateDate;

	@Column(length=20)
	private String articleEditorType;

	@Column(nullable=false, length=1)
	private String articleHadBeenPublished;

	@Column(nullable=false, length=1)
	private String articleIsPublished;

	@Column(nullable=false, length=255)
	private String articlePermalink;

	@Column(nullable=false, length=1)
	private String articlePutTop;

	@Column(nullable=false)
	private double articleRandomDouble;

	@Column(nullable=false, length=255)
	private String articleSignId;

	@Lob
	@Column(nullable=false)
	private String articleTags;

	@Column(nullable=false, length=255)
	private String articleTitle;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date articleUpdateDate;

	@Column(nullable=false)
	private int articleViewCount;

	@Column(nullable=false, length=100)
	private String articleViewPwd;

	public Article() {
	}


	public String getArticleAbstract() {
		return this.articleAbstract;
	}

	public void setArticleAbstract(String articleAbstract) {
		this.articleAbstract = articleAbstract;
	}

	public String getArticleAuthorEmail() {
		return this.articleAuthorEmail;
	}

	public void setArticleAuthorEmail(String articleAuthorEmail) {
		this.articleAuthorEmail = articleAuthorEmail;
	}

	public String getArticleCommentable() {
		return this.articleCommentable;
	}

	public void setArticleCommentable(String articleCommentable) {
		this.articleCommentable = articleCommentable;
	}

	public int getArticleCommentCount() {
		return this.articleCommentCount;
	}

	public void setArticleCommentCount(int articleCommentCount) {
		this.articleCommentCount = articleCommentCount;
	}

	public String getArticleContent() {
		return this.articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public Date getArticleCreateDate() {
		return this.articleCreateDate;
	}

	public void setArticleCreateDate(Date articleCreateDate) {
		this.articleCreateDate = articleCreateDate;
	}

	public String getArticleEditorType() {
		return this.articleEditorType;
	}

	public void setArticleEditorType(String articleEditorType) {
		this.articleEditorType = articleEditorType;
	}

	public String getArticleHadBeenPublished() {
		return this.articleHadBeenPublished;
	}

	public void setArticleHadBeenPublished(String articleHadBeenPublished) {
		this.articleHadBeenPublished = articleHadBeenPublished;
	}

	public String getArticleIsPublished() {
		return this.articleIsPublished;
	}

	public void setArticleIsPublished(String articleIsPublished) {
		this.articleIsPublished = articleIsPublished;
	}

	public String getArticlePermalink() {
		return this.articlePermalink;
	}

	public void setArticlePermalink(String articlePermalink) {
		this.articlePermalink = articlePermalink;
	}

	public String getArticlePutTop() {
		return this.articlePutTop;
	}

	public void setArticlePutTop(String articlePutTop) {
		this.articlePutTop = articlePutTop;
	}

	public double getArticleRandomDouble() {
		return this.articleRandomDouble;
	}

	public void setArticleRandomDouble(double articleRandomDouble) {
		this.articleRandomDouble = articleRandomDouble;
	}

	public String getArticleSignId() {
		return this.articleSignId;
	}

	public void setArticleSignId(String articleSignId) {
		this.articleSignId = articleSignId;
	}

	public String getArticleTags() {
		return this.articleTags;
	}

	public void setArticleTags(String articleTags) {
		this.articleTags = articleTags;
	}

	public String getArticleTitle() {
		return this.articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public Date getArticleUpdateDate() {
		return this.articleUpdateDate;
	}

	public void setArticleUpdateDate(Date articleUpdateDate) {
		this.articleUpdateDate = articleUpdateDate;
	}

	public int getArticleViewCount() {
		return this.articleViewCount;
	}

	public void setArticleViewCount(int articleViewCount) {
		this.articleViewCount = articleViewCount;
	}

	public String getArticleViewPwd() {
		return this.articleViewPwd;
	}

	public void setArticleViewPwd(String articleViewPwd) {
		this.articleViewPwd = articleViewPwd;
	}

}