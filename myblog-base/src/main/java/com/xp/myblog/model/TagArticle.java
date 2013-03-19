package com.xp.myblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the tag_article database table.
 * 
 */
@Entity
@Table(name = "tag_article")
public class TagArticle extends IdEntity {

	@Column(nullable = false, length = 255)
	private String article_oId;

	@Column(nullable = false, length = 255)
	private String tag_oId;

	public TagArticle() {
	}

	public String getArticle_oId() {
		return this.article_oId;
	}

	public void setArticle_oId(String article_oId) {
		this.article_oId = article_oId;
	}

	public String getTag_oId() {
		return this.tag_oId;
	}

	public void setTag_oId(String tag_oId) {
		this.tag_oId = tag_oId;
	}

}