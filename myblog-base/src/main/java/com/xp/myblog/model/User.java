package com.xp.myblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name = "user")
public class User extends IdEntity {

	@Column(nullable = false)
	private int userArticleCount;

	@Column(nullable = false, length = 255)
	private String userEmail;

	@Column(nullable = false, length = 255)
	private String userName;

	@Column(nullable = false, length = 255)
	private String userPassword;
	
	@Column(nullable = false, length = 64)
	private String salt;

	@Column(nullable = false)
	private int userPublishedArticleCount;

	@Column(nullable = false, length = 255)
	private String userRole;

	public User() {
	}

	public int getUserArticleCount() {
		return this.userArticleCount;
	}

	public void setUserArticleCount(int userArticleCount) {
		this.userArticleCount = userArticleCount;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public int getUserPublishedArticleCount() {
		return this.userPublishedArticleCount;
	}

	public void setUserPublishedArticleCount(int userPublishedArticleCount) {
		this.userPublishedArticleCount = userPublishedArticleCount;
	}

	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

}