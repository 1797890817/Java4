-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.15-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5168
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 demo 的数据库结构
DROP DATABASE IF EXISTS `demo`;
CREATE DATABASE IF NOT EXISTS `demo` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `demo`;

-- 导出  表 demo.article 结构
DROP TABLE IF EXISTS `article`;
CREATE TABLE IF NOT EXISTS `article` (
  `aid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `content` text,
  `uid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- 正在导出表  demo.article 的数据：~6 rows (大约)
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
REPLACE INTO `article` (`aid`, `title`, `content`, `uid`) VALUES
	(1, '文章1', '文章1正文内容...', 1),
	(2, '文章2', '文章2正文内容...', 1),
	(3, '文章3', '文章3正文内容...', 2),
	(4, '文章4', '文章4正文内容...', 3),
	(5, '文章5', '文章5正文内容...', 4),
	(6, '文章6', '文章6正文内容...', 4);
/*!40000 ALTER TABLE `article` ENABLE KEYS */;

-- 导出  表 demo.bittest 结构
DROP TABLE IF EXISTS `bittest`;
CREATE TABLE IF NOT EXISTS `bittest` (
  `a` bit(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  demo.bittest 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `bittest` DISABLE KEYS */;
REPLACE INTO `bittest` (`a`) VALUES
	(b'1011'),
	(b'0011');
/*!40000 ALTER TABLE `bittest` ENABLE KEYS */;

-- 导出  表 demo.blog 结构
DROP TABLE IF EXISTS `blog`;
CREATE TABLE IF NOT EXISTS `blog` (
  `bid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `content` text,
  `uid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- 正在导出表  demo.blog 的数据：~6 rows (大约)
/*!40000 ALTER TABLE `blog` DISABLE KEYS */;
REPLACE INTO `blog` (`bid`, `title`, `content`, `uid`) VALUES
	(1, '日志1', '日志1正文内容...', 1),
	(2, '文章2', '文章2正文内容...', 1),
	(3, '日志3', '日志3正文内容...', 2),
	(4, '文章4', '文章4正文内容...', 3),
	(5, '文章5', '文章5正文内容...', 4),
	(6, '日志6', '日志6正文内容...', 4);
/*!40000 ALTER TABLE `blog` ENABLE KEYS */;

-- 导出  表 demo.cv 结构
DROP TABLE IF EXISTS `cv`;
CREATE TABLE IF NOT EXISTS `cv` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `age` int(10) unsigned DEFAULT '0',
  `mobile` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

-- 正在导出表  demo.cv 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `cv` DISABLE KEYS */;
REPLACE INTO `cv` (`id`, `name`, `age`, `mobile`) VALUES
	(1, 'lisi', 25, 13800001111),
	(2, 'zhaosi', 35, 13766665550),
	(3, 'wang', 21, 13866665555),
	(14, 'zhaoliu01', 50, NULL),
	(15, 'zhaoliu02', 51, NULL),
	(16, 'zhaoliu03', 52, NULL),
	(17, 'zhaoliu04', 53, NULL),
	(18, 'zhaoliu05', 54, NULL),
	(19, 'zhaoliu11', 40, NULL),
	(20, 'zhaoliu12', 41, NULL),
	(21, 'zhaoliu14', 43, NULL),
	(22, 'zhaoliu15', 44, NULL),
	(27, 'zhaoliu21', 60, NULL),
	(28, 'zhaoliu22', 61, NULL),
	(29, 'zhaoliu23', 62, NULL),
	(30, 'zhaoliu24', 63, NULL),
	(31, 'zhaoliu25', 64, NULL),
	(32, 'zhaoliu31', 60, NULL),
	(33, 'zhaoliu32', 61, NULL),
	(34, 'zhaoliu34', 63, NULL),
	(35, 'zhaoliu35', 64, NULL),
	(58, 'zhaoliu41', 60, NULL),
	(59, 'zhaoliu42', 61, NULL);
/*!40000 ALTER TABLE `cv` ENABLE KEYS */;

-- 导出  表 demo.dbltest 结构
DROP TABLE IF EXISTS `dbltest`;
CREATE TABLE IF NOT EXISTS `dbltest` (
  `a` double DEFAULT NULL,
  `b` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  demo.dbltest 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `dbltest` DISABLE KEYS */;
REPLACE INTO `dbltest` (`a`, `b`) VALUES
	(5, 3.2);
/*!40000 ALTER TABLE `dbltest` ENABLE KEYS */;

-- 导出  表 demo.decimaltest 结构
DROP TABLE IF EXISTS `decimaltest`;
CREATE TABLE IF NOT EXISTS `decimaltest` (
  `a` decimal(2,1) DEFAULT NULL,
  `b` decimal(2,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  demo.decimaltest 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `decimaltest` DISABLE KEYS */;
REPLACE INTO `decimaltest` (`a`, `b`) VALUES
	(5.0, 3.2);
/*!40000 ALTER TABLE `decimaltest` ENABLE KEYS */;

-- 导出  表 demo.dttest 结构
DROP TABLE IF EXISTS `dttest`;
CREATE TABLE IF NOT EXISTS `dttest` (
  `d1` datetime DEFAULT NULL,
  `d2` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  demo.dttest 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `dttest` DISABLE KEYS */;
REPLACE INTO `dttest` (`d1`, `d2`) VALUES
	('2017-05-26 11:46:24', '2017-05-26 11:46:24');
/*!40000 ALTER TABLE `dttest` ENABLE KEYS */;

-- 导出  表 demo.edu 结构
DROP TABLE IF EXISTS `edu`;
CREATE TABLE IF NOT EXISTS `edu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `stu_id` bigint(20) unsigned NOT NULL DEFAULT '0',
  `from_date` date NOT NULL DEFAULT '0000-00-00',
  `to_date` date NOT NULL DEFAULT '0000-00-00',
  `degree` tinyint(4) NOT NULL DEFAULT '0',
  `school_id` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `stu_id` (`stu_id`),
  KEY `school_id` (`school_id`),
  CONSTRAINT `edu_ibfk_1` FOREIGN KEY (`stu_id`) REFERENCES `stu` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- 正在导出表  demo.edu 的数据：~4 rows (大约)
/*!40000 ALTER TABLE `edu` DISABLE KEYS */;
REPLACE INTO `edu` (`id`, `stu_id`, `from_date`, `to_date`, `degree`, `school_id`) VALUES
	(1, 2, '2017-05-27', '2017-05-27', 1, 1),
	(2, 1, '2017-06-01', '2017-06-01', 2, 2),
	(3, 3, '2017-06-01', '2017-06-01', 3, 3),
	(4, 4, '2015-07-09', '2017-09-01', 4, 5);
/*!40000 ALTER TABLE `edu` ENABLE KEYS */;

-- 导出  表 demo.enumtest 结构
DROP TABLE IF EXISTS `enumtest`;
CREATE TABLE IF NOT EXISTS `enumtest` (
  `sex` enum('M','F') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  demo.enumtest 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `enumtest` DISABLE KEYS */;
REPLACE INTO `enumtest` (`sex`) VALUES
	('M'),
	('F');
/*!40000 ALTER TABLE `enumtest` ENABLE KEYS */;

-- 导出  表 demo.flttest 结构
DROP TABLE IF EXISTS `flttest`;
CREATE TABLE IF NOT EXISTS `flttest` (
  `a` float DEFAULT NULL,
  `b` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  demo.flttest 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `flttest` DISABLE KEYS */;
REPLACE INTO `flttest` (`a`, `b`) VALUES
	(5, 3.2);
/*!40000 ALTER TABLE `flttest` ENABLE KEYS */;

-- 导出  表 demo.school 结构
DROP TABLE IF EXISTS `school`;
CREATE TABLE IF NOT EXISTS `school` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL DEFAULT '',
  `address` varchar(300) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- 正在导出表  demo.school 的数据：~5 rows (大约)
/*!40000 ALTER TABLE `school` DISABLE KEYS */;
REPLACE INTO `school` (`id`, `name`, `address`) VALUES
	(1, 'hfyz', 'hf'),
	(2, 'whyz', 'wh'),
	(3, 'aqyz', 'aq'),
	(5, 'jzyz', 'jz'),
	(6, 'layz', 'la');
/*!40000 ALTER TABLE `school` ENABLE KEYS */;

-- 导出  表 demo.settest 结构
DROP TABLE IF EXISTS `settest`;
CREATE TABLE IF NOT EXISTS `settest` (
  `a` set('book','pen','room') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  demo.settest 的数据：~9 rows (大约)
/*!40000 ALTER TABLE `settest` DISABLE KEYS */;
REPLACE INTO `settest` (`a`) VALUES
	('book'),
	('book,pen'),
	('book,pen,room'),
	(''),
	('book'),
	('pen'),
	('book,pen'),
	('room'),
	('book,pen,room');
/*!40000 ALTER TABLE `settest` ENABLE KEYS */;

-- 导出  表 demo.stu 结构
DROP TABLE IF EXISTS `stu`;
CREATE TABLE IF NOT EXISTS `stu` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `age` int(11) DEFAULT '0',
  `height` int(11) NOT NULL DEFAULT '0',
  `city` varchar(15) DEFAULT 'bj',
  `weight` int(4) DEFAULT NULL,
  `info` char(4) DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `id_idx` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- 正在导出表  demo.stu 的数据：~9 rows (大约)
/*!40000 ALTER TABLE `stu` DISABLE KEYS */;
REPLACE INTO `stu` (`id`, `name`, `age`, `height`, `city`, `weight`, `info`) VALUES
	(1, 'zhangsan', 25, 170, 'bj', NULL, NULL),
	(2, 'lisi', NULL, 170, 'bj', NULL, NULL),
	(3, 'song', -25, 170, 'bj', NULL, NULL),
	(4, 'wangwu', 25, 170, 'bj', NULL, NULL),
	(5, 'wang', 25, 170, 'bj', NULL, NULL),
	(8, 'wanghai', 55, 170, 'bj', NULL, NULL),
	(15, 'wangjun', 23, 170, 'bj', NULL, NULL),
	(16, 'lijun', 23, 170, 'bj', NULL, NULL),
	(21, 'zhangsan2', 26, 170, 'bj', NULL, NULL);
/*!40000 ALTER TABLE `stu` ENABLE KEYS */;

-- 导出  表 demo.stu2 结构
DROP TABLE IF EXISTS `stu2`;
CREATE TABLE IF NOT EXISTS `stu2` (
  `id` bigint(20) unsigned DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `city` varchar(15) DEFAULT 'bj',
  `weight` int(4) DEFAULT NULL,
  `info` char(4) DEFAULT NULL,
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  demo.stu2 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `stu2` DISABLE KEYS */;
/*!40000 ALTER TABLE `stu2` ENABLE KEYS */;

-- 导出  表 demo.tinyinttest 结构
DROP TABLE IF EXISTS `tinyinttest`;
CREATE TABLE IF NOT EXISTS `tinyinttest` (
  `a` tinyint(4) DEFAULT NULL,
  `b` tinyint(3) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  demo.tinyinttest 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `tinyinttest` DISABLE KEYS */;
REPLACE INTO `tinyinttest` (`a`, `b`) VALUES
	(-128, 127),
	(127, 128),
	(127, 255);
/*!40000 ALTER TABLE `tinyinttest` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
