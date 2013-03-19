/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : myblog

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2013-03-19 23:51:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `articleTitle` varchar(255) NOT NULL,
  `articleAbstract` text NOT NULL,
  `articleTags` text NOT NULL,
  `articleAuthorEmail` varchar(255) NOT NULL,
  `articleCommentCount` int(11) NOT NULL,
  `articleViewCount` int(11) NOT NULL,
  `articleContent` text NOT NULL,
  `articlePermalink` varchar(255) NOT NULL,
  `articleHadBeenPublished` char(1) NOT NULL,
  `articleIsPublished` char(1) NOT NULL,
  `articlePutTop` char(1) NOT NULL,
  `articleCreateDate` datetime NOT NULL,
  `articleUpdateDate` datetime NOT NULL,
  `articleRandomDouble` double NOT NULL,
  `articleSignId` varchar(255) NOT NULL,
  `articleCommentable` char(1) NOT NULL,
  `articleViewPwd` varchar(100) NOT NULL,
  `articleEditorType` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', '世界，你好！', '<p>欢迎使用 <a style=\"text-decoration: none;\" target=\"_blank\" href=\"https://github.com/b3log/b3log-solo\"><span style=\"color: orange;\">B</span><span style=\"font-size: 9px; color: blue;\"><sup>3</sup></span><span style=\"color: green;\">L</span><span style=\"color: red;\">O</span><span style=\"color: blue;\">G</span> <span style=\"color: orangered; font-weight: bold;\">Solo</span></a>。这是系统自动生成的演示文章。编辑或者删除它，然后开始您的博客！</p>', 'B3log', 'todd.xiao1985@gmail.com', '1', '2', '<p>欢迎使用 <a style=\"text-decoration: none;\" target=\"_blank\" href=\"https://github.com/b3log/b3log-solo\"><span style=\"color: orange;\">B</span><span style=\"font-size: 9px; color: blue;\"><sup>3</sup></span><span style=\"color: green;\">L</span><span style=\"color: red;\">O</span><span style=\"color: blue;\">G</span> <span style=\"color: orangered; font-weight: bold;\">Solo</span></a>。这是系统自动生成的演示文章。编辑或者删除它，然后开始您的博客！</p>', '/b3log-hello-wolrd.html', '1', '1', '0', '2013-03-18 19:21:39', '2013-03-18 19:21:39', '0.6883203682540158', '1', '1', '', 'tinyMCE');
INSERT INTO `article` VALUES ('2', 'fsdadfsdfsd', '<p>asdf</p>', 'asdf', 'todd.xiao1985@gmail.com', '2', '1', '<p>sadfasdfsadfsadfsdf</p>', '/sdaf', '1', '1', '0', '2013-03-18 19:22:43', '2013-03-18 19:22:43', '0.9387987748336906', '1', '1', '', 'tinyMCE');

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `commentContent` text NOT NULL,
  `commentDate` datetime NOT NULL,
  `commentEmail` varchar(255) NOT NULL,
  `commentName` varchar(50) NOT NULL,
  `commentOnId` bigint(18) NOT NULL,
  `commentOnType` varchar(20) NOT NULL,
  `commentSharpURL` varchar(255) NOT NULL,
  `commentThumbnailURL` text NOT NULL,
  `commentURL` varchar(255) NOT NULL,
  `commentOriginalCommentId` varchar(255) NOT NULL,
  `commentOriginalCommentName` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1363605995512 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', '&#24744;&#22909;&#65292;&#36825;&#26159;&#19968;&#26465;&#35780;&#35770;&#12290;_esc_enter_88250_&#35201;&#21024;&#38500;&#35780;&#35770;&#65292;&#35831;&#20808;&#30331;&#24405;&#65292;&#28982;&#21518;&#20877;&#26597;&#30475;&#36825;&#31687;&#25991;&#31456;&#30340;&#35780;&#35770;&#12290;&#22312;&#37027;&#37324;&#65292;&#24744;&#21487;&#20197;&#30475;&#21040;&#32534;&#36753;&#25110;&#32773;&#21024;&#38500;&#35780;&#35770;&#30340;&#36873;&#39033;&#12290;', '2013-03-18 19:21:39', 'dl88250@gmail.com', '88250', '1363605699968', 'article', '/b3log-hello-wolrd.html#1363605700296', 'http://secure.gravatar.com/avatar/59a5e8209c780307dbe9c9ba728073f5??s=60&r=G', 'http://88250.b3log.org', '', '');
INSERT INTO `comment` VALUES ('2', '[em00][em02][em04][em10]', '2013-03-18 19:26:18', 'sdafasdf@sina.com', 'todd', '1363605763011', 'article', '/sdaf#1363605979692', 'http://localhost:80/b3log/images/default-user-thumbnail.png', 'http://localhost', '', '');
INSERT INTO `comment` VALUES ('3', 'dsffasdf', '2013-03-18 19:26:34', 'sdafasdf@sina.com', 'todd', '1363605763011', 'article', '/sdaf#1363605995511', 'http://localhost:80/b3log/images/default-user-thumbnail.png', 'http://localhost', '', '');

-- ----------------------------
-- Table structure for `link`
-- ----------------------------
DROP TABLE IF EXISTS `link`;
CREATE TABLE `link` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `linkAddress` varchar(255) NOT NULL,
  `linkDescription` varchar(255) NOT NULL,
  `linkOrder` int(11) NOT NULL,
  `linkTitle` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of link
-- ----------------------------

-- ----------------------------
-- Table structure for `page`
-- ----------------------------
DROP TABLE IF EXISTS `page`;
CREATE TABLE `page` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `pageCommentCount` int(11) NOT NULL,
  `pageContent` text NOT NULL,
  `pageOrder` int(11) NOT NULL,
  `pagePermalink` varchar(255) NOT NULL,
  `pageTitle` varchar(255) NOT NULL,
  `pageCommentable` char(1) NOT NULL,
  `pageType` varchar(10) NOT NULL,
  `pageOpenTarget` varchar(255) NOT NULL,
  `pageEditorType` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of page
-- ----------------------------
INSERT INTO `page` VALUES ('1', '0', '', '0', 'http://ASDSAD', 'dsaaDAS', '1', 'link', '_self', 'tinyMCE');

-- ----------------------------
-- Table structure for `preference`
-- ----------------------------
DROP TABLE IF EXISTS `preference`;
CREATE TABLE `preference` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `adminEmail` varchar(255) DEFAULT NULL,
  `allowVisitDraftViaPermalink` char(1) DEFAULT NULL,
  `commentable` char(1) DEFAULT NULL,
  `feedOutputMode` varchar(20) DEFAULT NULL,
  `articleListDisplayCount` int(11) DEFAULT NULL,
  `relevantArticlesDisplayCount` int(11) DEFAULT NULL,
  `articleListPaginationWindowSize` int(11) DEFAULT NULL,
  `articleListStyle` varchar(20) DEFAULT NULL,
  `blogHost` varchar(255) DEFAULT NULL,
  `blogSubtitle` text,
  `blogTitle` text,
  `enableArticleUpdateHint` char(1) DEFAULT NULL,
  `externalRelevantArticlesDisplayCount` int(11) DEFAULT NULL,
  `htmlHead` text,
  `keyOfSolo` varchar(255) DEFAULT NULL,
  `localeString` varchar(20) DEFAULT NULL,
  `metaDescription` varchar(255) DEFAULT NULL,
  `metaKeywords` varchar(255) DEFAULT NULL,
  `mostCommentArticleDisplayCount` int(11) DEFAULT NULL,
  `mostUsedTagDisplayCount` int(11) DEFAULT NULL,
  `mostViewArticleDisplayCount` int(11) DEFAULT NULL,
  `noticeBoard` text,
  `pageCacheEnabled` char(1) DEFAULT NULL,
  `randomArticlesDisplayCount` int(11) DEFAULT NULL,
  `recentCommentDisplayCount` int(11) DEFAULT NULL,
  `recentArticleDisplayCount` int(11) DEFAULT NULL,
  `signs` text,
  `skinDirName` varchar(255) DEFAULT NULL,
  `skinName` varchar(255) DEFAULT NULL,
  `skins` text,
  `timeZoneId` varchar(255) DEFAULT NULL,
  `version` varchar(10) DEFAULT NULL,
  `body` text,
  `subject` varchar(255) DEFAULT NULL,
  `editorType` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of preference
-- ----------------------------
INSERT INTO `preference` VALUES ('1', 'todd.xiao1985@gmail.com', '0', '1', 'abstract', '20', '5', '15', 'titleAndAbstract', 'localhost:80/b3log', 'Java 开源博客', 'B3log Solo 示例', '1', '5', '', 'Your key', 'zh_CN', 'An open source blog with Java. Java 开源博客', 'Java 博客,GAE,b3log', '5', '20', '5', 'Open Source, Open Mind, <br/>Open Sight, Open Future!', '0', '5', '10', '10', '[{\"signHTML\":\"\",\"oId\":0},{\"signHTML\":\"efa\",\"oId\":1},{\"signHTML\":\"sdfa\",\"oId\":2},{\"signHTML\":\"sadf\",\"oId\":3}]', 'neoease', 'NeoEase', '[{\"skinName\":\"Tree House\",\"skinDirName\":\"tree-house\"},{\"skinName\":\"i-nove\",\"skinDirName\":\"i-nove\"},{\"skinName\":\"timeline\",\"skinDirName\":\"timeline\"},{\"skinName\":\"owmx-3.0\",\"skinDirName\":\"owmx-3.0\"},{\"skinName\":\"Community\",\"skinDirName\":\"community\"},{\"skinName\":\"Andrea\",\"skinDirName\":\"andrea\"},{\"skinName\":\"ease\",\"skinDirName\":\"ease\"},{\"skinName\":\"NeoEase\",\"skinDirName\":\"neoease\"},{\"skinName\":\"favourite\",\"skinDirName\":\"favourite\"},{\"skinName\":\"经典淡蓝\",\"skinDirName\":\"classic\"},{\"skinName\":\"Mobile\",\"skinDirName\":\"mobile\"}]', 'Asia/Shanghai', '0.5.6', null, null, 'tinyMCE');
INSERT INTO `preference` VALUES ('2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Your comment on post[<a href=\'${postLink}\'>${postTitle}</a>] received an reply: <p>${replier}: <span><a href=\'${replyURL}\'>${replyContent}</a></span></p>', '${blogTitle}: New reply of your comment', null);

-- ----------------------------
-- Table structure for `statistic`
-- ----------------------------
DROP TABLE IF EXISTS `statistic`;
CREATE TABLE `statistic` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `statisticBlogArticleCount` int(11) NOT NULL,
  `statisticBlogCommentCount` int(11) NOT NULL,
  `statisticBlogViewCount` int(11) NOT NULL,
  `statisticPublishedBlogArticleCount` int(11) NOT NULL,
  `statisticPublishedBlogCommentCount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of statistic
-- ----------------------------
INSERT INTO `statistic` VALUES ('1', '2', '3', '0', '2', '3');

-- ----------------------------
-- Table structure for `tag`
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `tagPublishedRefCount` int(11) NOT NULL,
  `tagReferenceCount` int(11) NOT NULL,
  `tagTitle` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1363605763063 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tag
-- ----------------------------
INSERT INTO `tag` VALUES ('1', '1', '1', 'B3log');
INSERT INTO `tag` VALUES ('2', '1', '1', 'asdf');

-- ----------------------------
-- Table structure for `tag_article`
-- ----------------------------
DROP TABLE IF EXISTS `tag_article`;
CREATE TABLE `tag_article` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `article_oId` varchar(255) NOT NULL,
  `tag_oId` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1363605763115 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tag_article
-- ----------------------------
INSERT INTO `tag_article` VALUES ('1', '1363605699968', '1363605700018');
INSERT INTO `tag_article` VALUES ('2', '1363605763011', '1363605763062');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `userEmail` varchar(255) NOT NULL,
  `userName` varchar(255) NOT NULL,
  `userPassword` varchar(255) NOT NULL,
  `salt` varchar(64) NOT NULL,
  `userRole` varchar(255) NOT NULL,
  `userArticleCount` int(11) NOT NULL,
  `userPublishedArticleCount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'todd.xiao1985@gmail.com', 'admin', '21232f297a57a5a743894a0e4a801fc3', '', 'adminRole', '2', '2');
INSERT INTO `user` VALUES ('2', 'assdf@sina.com', 'todd', 'c60ba607dafb7a7150dcdf7ec61924b3', '', 'defaultRole', '0', '0');
