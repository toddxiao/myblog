package com.xp.myblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the tag database table.
 * 
 */
@Entity
@Table(name = "tag")
public class Tag extends IdEntity {

	@Column(nullable = false)
	private int tagPublishedRefCount;

	@Column(nullable = false)
	private int tagReferenceCount;

	@Column(nullable = false, length = 255)
	private String tagTitle;

	public Tag() {
	}

	public int getTagPublishedRefCount() {
		return this.tagPublishedRefCount;
	}

	public void setTagPublishedRefCount(int tagPublishedRefCount) {
		this.tagPublishedRefCount = tagPublishedRefCount;
	}

	public int getTagReferenceCount() {
		return this.tagReferenceCount;
	}

	public void setTagReferenceCount(int tagReferenceCount) {
		this.tagReferenceCount = tagReferenceCount;
	}

	public String getTagTitle() {
		return this.tagTitle;
	}

	public void setTagTitle(String tagTitle) {
		this.tagTitle = tagTitle;
	}

}