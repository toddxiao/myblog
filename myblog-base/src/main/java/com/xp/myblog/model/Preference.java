package com.xp.myblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;


/**
 * The persistent class for the preference database table.
 * 
 */
@Entity
@Table(name="preference")
public class Preference extends IdEntity {

	@Column(length=255)
	private String adminEmail;

	@Column(length=1)
	private String allowVisitDraftViaPermalink;

	private int articleListDisplayCount;

	private int articleListPaginationWindowSize;

	@Column(length=20)
	private String articleListStyle;

	@Column(length=255)
	private String blogHost;

	@Lob
	private String blogSubtitle;

	@Lob
	private String blogTitle;

	@Lob
	private String body;

	@Column(length=1)
	private String commentable;

	@Column(length=20)
	private String editorType;

	@Column(length=1)
	private String enableArticleUpdateHint;

	private int externalRelevantArticlesDisplayCount;

	@Column(length=20)
	private String feedOutputMode;

	@Lob
	private String htmlHead;

	@Column(length=255)
	private String keyOfSolo;

	@Column(length=20)
	private String localeString;

	@Column(length=255)
	private String metaDescription;

	@Column(length=255)
	private String metaKeywords;

	private int mostCommentArticleDisplayCount;

	private int mostUsedTagDisplayCount;

	private int mostViewArticleDisplayCount;

	@Lob
	private String noticeBoard;

	@Column(length=1)
	private String pageCacheEnabled;

	private int randomArticlesDisplayCount;

	private int recentArticleDisplayCount;

	private int recentCommentDisplayCount;

	private int relevantArticlesDisplayCount;

	@Lob
	private String signs;

	@Column(length=255)
	private String skinDirName;

	@Column(length=255)
	private String skinName;

	@Lob
	private String skins;

	@Column(length=255)
	private String subject;

	@Column(length=255)
	private String timeZoneId;

	@Column(length=10)
	private String version;

	public Preference() {
	}

	public String getAdminEmail() {
		return this.adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAllowVisitDraftViaPermalink() {
		return this.allowVisitDraftViaPermalink;
	}

	public void setAllowVisitDraftViaPermalink(String allowVisitDraftViaPermalink) {
		this.allowVisitDraftViaPermalink = allowVisitDraftViaPermalink;
	}

	public int getArticleListDisplayCount() {
		return this.articleListDisplayCount;
	}

	public void setArticleListDisplayCount(int articleListDisplayCount) {
		this.articleListDisplayCount = articleListDisplayCount;
	}

	public int getArticleListPaginationWindowSize() {
		return this.articleListPaginationWindowSize;
	}

	public void setArticleListPaginationWindowSize(int articleListPaginationWindowSize) {
		this.articleListPaginationWindowSize = articleListPaginationWindowSize;
	}

	public String getArticleListStyle() {
		return this.articleListStyle;
	}

	public void setArticleListStyle(String articleListStyle) {
		this.articleListStyle = articleListStyle;
	}

	public String getBlogHost() {
		return this.blogHost;
	}

	public void setBlogHost(String blogHost) {
		this.blogHost = blogHost;
	}

	public String getBlogSubtitle() {
		return this.blogSubtitle;
	}

	public void setBlogSubtitle(String blogSubtitle) {
		this.blogSubtitle = blogSubtitle;
	}

	public String getBlogTitle() {
		return this.blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCommentable() {
		return this.commentable;
	}

	public void setCommentable(String commentable) {
		this.commentable = commentable;
	}

	public String getEditorType() {
		return this.editorType;
	}

	public void setEditorType(String editorType) {
		this.editorType = editorType;
	}

	public String getEnableArticleUpdateHint() {
		return this.enableArticleUpdateHint;
	}

	public void setEnableArticleUpdateHint(String enableArticleUpdateHint) {
		this.enableArticleUpdateHint = enableArticleUpdateHint;
	}

	public int getExternalRelevantArticlesDisplayCount() {
		return this.externalRelevantArticlesDisplayCount;
	}

	public void setExternalRelevantArticlesDisplayCount(int externalRelevantArticlesDisplayCount) {
		this.externalRelevantArticlesDisplayCount = externalRelevantArticlesDisplayCount;
	}

	public String getFeedOutputMode() {
		return this.feedOutputMode;
	}

	public void setFeedOutputMode(String feedOutputMode) {
		this.feedOutputMode = feedOutputMode;
	}

	public String getHtmlHead() {
		return this.htmlHead;
	}

	public void setHtmlHead(String htmlHead) {
		this.htmlHead = htmlHead;
	}

	public String getKeyOfSolo() {
		return this.keyOfSolo;
	}

	public void setKeyOfSolo(String keyOfSolo) {
		this.keyOfSolo = keyOfSolo;
	}

	public String getLocaleString() {
		return this.localeString;
	}

	public void setLocaleString(String localeString) {
		this.localeString = localeString;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public int getMostCommentArticleDisplayCount() {
		return this.mostCommentArticleDisplayCount;
	}

	public void setMostCommentArticleDisplayCount(int mostCommentArticleDisplayCount) {
		this.mostCommentArticleDisplayCount = mostCommentArticleDisplayCount;
	}

	public int getMostUsedTagDisplayCount() {
		return this.mostUsedTagDisplayCount;
	}

	public void setMostUsedTagDisplayCount(int mostUsedTagDisplayCount) {
		this.mostUsedTagDisplayCount = mostUsedTagDisplayCount;
	}

	public int getMostViewArticleDisplayCount() {
		return this.mostViewArticleDisplayCount;
	}

	public void setMostViewArticleDisplayCount(int mostViewArticleDisplayCount) {
		this.mostViewArticleDisplayCount = mostViewArticleDisplayCount;
	}

	public String getNoticeBoard() {
		return this.noticeBoard;
	}

	public void setNoticeBoard(String noticeBoard) {
		this.noticeBoard = noticeBoard;
	}

	public String getPageCacheEnabled() {
		return this.pageCacheEnabled;
	}

	public void setPageCacheEnabled(String pageCacheEnabled) {
		this.pageCacheEnabled = pageCacheEnabled;
	}

	public int getRandomArticlesDisplayCount() {
		return this.randomArticlesDisplayCount;
	}

	public void setRandomArticlesDisplayCount(int randomArticlesDisplayCount) {
		this.randomArticlesDisplayCount = randomArticlesDisplayCount;
	}

	public int getRecentArticleDisplayCount() {
		return this.recentArticleDisplayCount;
	}

	public void setRecentArticleDisplayCount(int recentArticleDisplayCount) {
		this.recentArticleDisplayCount = recentArticleDisplayCount;
	}

	public int getRecentCommentDisplayCount() {
		return this.recentCommentDisplayCount;
	}

	public void setRecentCommentDisplayCount(int recentCommentDisplayCount) {
		this.recentCommentDisplayCount = recentCommentDisplayCount;
	}

	public int getRelevantArticlesDisplayCount() {
		return this.relevantArticlesDisplayCount;
	}

	public void setRelevantArticlesDisplayCount(int relevantArticlesDisplayCount) {
		this.relevantArticlesDisplayCount = relevantArticlesDisplayCount;
	}

	public String getSigns() {
		return this.signs;
	}

	public void setSigns(String signs) {
		this.signs = signs;
	}

	public String getSkinDirName() {
		return this.skinDirName;
	}

	public void setSkinDirName(String skinDirName) {
		this.skinDirName = skinDirName;
	}

	public String getSkinName() {
		return this.skinName;
	}

	public void setSkinName(String skinName) {
		this.skinName = skinName;
	}

	public String getSkins() {
		return this.skins;
	}

	public void setSkins(String skins) {
		this.skins = skins;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTimeZoneId() {
		return this.timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}