/*
Navicat MySQL Data Transfer

Source Server         : Tencent
Source Server Version : 80018
Source Host           :
Source Database       : axin_db

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2022-01-18 13:35:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `contact`
-- ----------------------------
DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img` text NOT NULL,
  `name` text NOT NULL,
  `friendid` varchar(255) NOT NULL,
  `number` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contact
-- ----------------------------
INSERT INTO `contact` VALUES ('7', 'https://gitee.com/mxd_2022/smartboot/raw/master/images/author.png', 't-im作者', '15511090451', '15100101666');
INSERT INTO `contact` VALUES ('8', 'https://gitee.com/mxd_2022/smartboot/raw/master/images/user.jpg', 't-im用户', '15100101666', '15511090451');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `avatar` varchar(255) NOT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `phone` (`phone`) USING BTREE,
  UNIQUE KEY `number` (`number`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '15511090451', 't-im作者', '888', '15511090451', 'https://gitee.com/mxd_2022/smartboot/raw/master/images/author.png', 't-im作者');
INSERT INTO `user` VALUES ('5', '15100101666', 't-im用户', '666', '15100101666', 'https://gitee.com/mxd_2022/smartboot/raw/master/images/user.jpg', 't-im粉丝');
