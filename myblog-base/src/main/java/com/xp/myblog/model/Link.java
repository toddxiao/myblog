package com.xp.myblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the link database table.
 * 
 */
@Entity
@Table(name="link")
public class Link extends IdEntity {

	@Column(nullable=false, length=255)
	private String linkAddress;

	@Column(nullable=false, length=255)
	private String linkDescription;

	@Column(nullable=false)
	private int linkOrder;

	@Column(nullable=false, length=255)
	private String linkTitle;

	public Link() {
	}

	public String getLinkAddress() {
		return this.linkAddress;
	}

	public void setLinkAddress(String linkAddress) {
		this.linkAddress = linkAddress;
	}

	public String getLinkDescription() {
		return this.linkDescription;
	}

	public void setLinkDescription(String linkDescription) {
		this.linkDescription = linkDescription;
	}

	public int getLinkOrder() {
		return this.linkOrder;
	}

	public void setLinkOrder(int linkOrder) {
		this.linkOrder = linkOrder;
	}

	public String getLinkTitle() {
		return this.linkTitle;
	}

	public void setLinkTitle(String linkTitle) {
		this.linkTitle = linkTitle;
	}

}