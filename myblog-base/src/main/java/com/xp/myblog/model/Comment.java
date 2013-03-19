package com.xp.myblog.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the comment database table.
 * 
 */
@Entity
@Table(name="comment")
public class Comment extends IdEntity {

	@Lob
	@Column(nullable=false)
	private String commentContent;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date commentDate;

	@Column(nullable=false, length=255)
	private String commentEmail;

	@Column(nullable=false, length=50)
	private String commentName;

	@Column(nullable=false)
	private BigInteger commentOnId;

	@Column(nullable=false, length=20)
	private String commentOnType;

	@Column(nullable=false, length=255)
	private String commentOriginalCommentId;

	@Column(nullable=false, length=50)
	private String commentOriginalCommentName;

	@Column(nullable=false, length=255)
	private String commentSharpURL;

	@Lob
	@Column(nullable=false)
	private String commentThumbnailURL;

	@Column(nullable=false, length=255)
	private String commentURL;

	public Comment() {
	}

	public String getCommentContent() {
		return this.commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCommentDate() {
		return this.commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public String getCommentEmail() {
		return this.commentEmail;
	}

	public void setCommentEmail(String commentEmail) {
		this.commentEmail = commentEmail;
	}

	public String getCommentName() {
		return this.commentName;
	}

	public void setCommentName(String commentName) {
		this.commentName = commentName;
	}

	public BigInteger getCommentOnId() {
		return this.commentOnId;
	}

	public void setCommentOnId(BigInteger commentOnId) {
		this.commentOnId = commentOnId;
	}

	public String getCommentOnType() {
		return this.commentOnType;
	}

	public void setCommentOnType(String commentOnType) {
		this.commentOnType = commentOnType;
	}

	public String getCommentOriginalCommentId() {
		return this.commentOriginalCommentId;
	}

	public void setCommentOriginalCommentId(String commentOriginalCommentId) {
		this.commentOriginalCommentId = commentOriginalCommentId;
	}

	public String getCommentOriginalCommentName() {
		return this.commentOriginalCommentName;
	}

	public void setCommentOriginalCommentName(String commentOriginalCommentName) {
		this.commentOriginalCommentName = commentOriginalCommentName;
	}

	public String getCommentSharpURL() {
		return this.commentSharpURL;
	}

	public void setCommentSharpURL(String commentSharpURL) {
		this.commentSharpURL = commentSharpURL;
	}

	public String getCommentThumbnailURL() {
		return this.commentThumbnailURL;
	}

	public void setCommentThumbnailURL(String commentThumbnailURL) {
		this.commentThumbnailURL = commentThumbnailURL;
	}

	public String getCommentURL() {
		return this.commentURL;
	}

	public void setCommentURL(String commentURL) {
		this.commentURL = commentURL;
	}

}