package com.xp.myblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the statistic database table.
 * 
 */
@Entity
@Table(name="statistic")
public class Statistic extends IdEntity {

	@Column(nullable=false)
	private int statisticBlogArticleCount;

	@Column(nullable=false)
	private int statisticBlogCommentCount;

	@Column(nullable=false)
	private int statisticBlogViewCount;

	@Column(nullable=false)
	private int statisticPublishedBlogArticleCount;

	@Column(nullable=false)
	private int statisticPublishedBlogCommentCount;

	public Statistic() {
	}

	public int getStatisticBlogArticleCount() {
		return this.statisticBlogArticleCount;
	}

	public void setStatisticBlogArticleCount(int statisticBlogArticleCount) {
		this.statisticBlogArticleCount = statisticBlogArticleCount;
	}

	public int getStatisticBlogCommentCount() {
		return this.statisticBlogCommentCount;
	}

	public void setStatisticBlogCommentCount(int statisticBlogCommentCount) {
		this.statisticBlogCommentCount = statisticBlogCommentCount;
	}

	public int getStatisticBlogViewCount() {
		return this.statisticBlogViewCount;
	}

	public void setStatisticBlogViewCount(int statisticBlogViewCount) {
		this.statisticBlogViewCount = statisticBlogViewCount;
	}

	public int getStatisticPublishedBlogArticleCount() {
		return this.statisticPublishedBlogArticleCount;
	}

	public void setStatisticPublishedBlogArticleCount(int statisticPublishedBlogArticleCount) {
		this.statisticPublishedBlogArticleCount = statisticPublishedBlogArticleCount;
	}

	public int getStatisticPublishedBlogCommentCount() {
		return this.statisticPublishedBlogCommentCount;
	}

	public void setStatisticPublishedBlogCommentCount(int statisticPublishedBlogCommentCount) {
		this.statisticPublishedBlogCommentCount = statisticPublishedBlogCommentCount;
	}

}