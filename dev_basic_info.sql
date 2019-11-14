/*
Navicat MySQL Data Transfer

Source Server         : 39.100.149.97
Source Server Version : 50645
Source Host           : 39.100.149.97:3306
Source Database       : smartbox-boot

Target Server Type    : MYSQL
Target Server Version : 50645
File Encoding         : 65001

Date: 2019-11-14 16:02:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dev_basic_info`
-- ----------------------------
DROP TABLE IF EXISTS `dev_basic_info`;
CREATE TABLE `dev_basic_info` (
  `id` varchar(55) NOT NULL DEFAULT '' COMMENT '序号',
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户id',
  `file_type` varchar(2) DEFAULT NULL COMMENT '文件类型',
  `site_id` varchar(32) DEFAULT NULL COMMENT '局点ID',
  `file_name` varchar(32) DEFAULT NULL COMMENT '文件名称',
  `file_path` varchar(60) DEFAULT NULL COMMENT '文件路径',
  `file_size` double(32,0) DEFAULT NULL COMMENT '文件大小',
  `collect_time` datetime DEFAULT NULL COMMENT '收集时间',
  `device_start_time` varchar(32) DEFAULT NULL COMMENT '设备启动时间',
  `device_run_time` varchar(500) DEFAULT NULL COMMENT '设备运行时间',
  `device_type` varchar(16) DEFAULT NULL COMMENT '设备类型',
  `device_name` varchar(200) DEFAULT NULL COMMENT '设备名称',
  `device_verison` varchar(200) DEFAULT NULL COMMENT '设备版本',
  `device_patch` varchar(32) DEFAULT NULL COMMENT '设备补丁',
  `device_status` int(1) DEFAULT '0' COMMENT '设备状态0异常1正常',
  `ip_address` varchar(32) DEFAULT NULL COMMENT 'IP地址',
  `isbkp` varchar(6) DEFAULT NULL COMMENT '是否备板',
  `bkp_board_type` varchar(32) DEFAULT NULL COMMENT '备板类型',
  `bkp_pcb_version` varchar(32) DEFAULT NULL COMMENT '备板编码',
  `description` varchar(255) DEFAULT NULL COMMENT '设备描述信息',
  `license_state` varchar(4) DEFAULT NULL COMMENT 'license状态',
  `product_name` varchar(255) DEFAULT NULL COMMENT 'license名称',
  `product_version` varchar(255) DEFAULT NULL COMMENT '产品版本',
  `product_serial_no` varchar(32) DEFAULT NULL COMMENT '产品序列号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `expired_time` datetime DEFAULT NULL COMMENT '过期时间',
  `box_no` varchar(100) DEFAULT NULL COMMENT '盒子编号mac',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='设备基本信息表：网元基本信息，包括设备名称、设备版本、补丁等信息';

-- ----------------------------
-- Records of dev_basic_info
-- ----------------------------
INSERT INTO `dev_basic_info` VALUES ('1', 'e9ca23d68d884d4ebb19d07889727dae', '1', '1', 'test.json', 'xxx', '1024', '2019-09-06 00:00:00', '2019-09-07 18:37:39', '2019-09-07 18:37:44', 'S9300', 'xxxx', 'V200R013C00SPC500', 'null', '1', '192.168.1.100', 'true', 'LE0KS9306', 'E02BAKI VER.E', 'Quidway S9306 Terabit Routing Switch ', '生效', '华为商业授权', 'V1', 'XXXX', '2019-09-08 02:22:35', '2019-09-08 02:22:39', 'smbox1');
INSERT INTO `dev_basic_info` VALUES ('10', '10', null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('12', 'e9ca23d68d884d4ebb19d07889727dae', '1', '2', 'test.json', 'xxx', '1024', '2019-09-06 00:00:00', '2019-09-07 18:37:39', '2019-09-07 18:37:44', 'S9300', 'xxxx', 'V200R013C00SPC500', 'null', '0', '192.168.1.101', 'true', 'LE0KS9306', 'E02BAKI VER.E', 'Quidway S9306 Terabit Routing Switch ', '生效', '华为商业授权', 'V1', 'XXXX', '2019-09-08 02:22:35', '2019-09-08 02:22:39', 'smbox1');
INSERT INTO `dev_basic_info` VALUES ('13', null, null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quid', 'V200R013C00SPC500', null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('14', null, null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quid', 'V200R013C00SPC500', null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('15', null, null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quid', 'V200R013C00SPC500', null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('16', null, null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quid', 'V200R013C00SPC500', null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('17', null, null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quid', 'V200R013C00SPC500', null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('18', null, null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quid', 'V200R013C00SPC500', null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('19', null, null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quid', 'V200R013C00SPC500', null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('2', '1', null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('20', null, null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quid', 'V200R013C00SPC500', null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('21', null, null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quid', 'V200R013C00SPC500', null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('3', '3', null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('3f40877f066d11eabe2400163e043dd1', '662d318c3f74b1714d8af5e11f270bb3', null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quidway  S9306  Terabit  Routing  Switch', 'V200R013C00SPC500', null, '0', '192.168.1.101', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('3f9b20bc066d11eabe2400163e043dd1', '662d318c3f74b1714d8af5e11f270bb3', null, null, null, null, null, null, null, '14  weeks,  6  days,  16  hours,  10  minutes', null, 'Quidway  S9306  Terabit  Routing  Switch', 'V200R013C00SPC500', null, '0', '192.168.1.102', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('4', '4', null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('5', '5', null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('6', '6', null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('7', '7', null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('8', '8', null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_basic_info` VALUES ('9', '9', null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dev_board_info`
-- ----------------------------
DROP TABLE IF EXISTS `dev_board_info`;
CREATE TABLE `dev_board_info` (
  `id` varchar(55) NOT NULL DEFAULT '' COMMENT '序号',
  `basic_info_id` varchar(55) DEFAULT NULL COMMENT '基本信息表id',
  `chassis_id` varchar(55) DEFAULT NULL COMMENT '机框id',
  `board_type` varchar(4) DEFAULT NULL COMMENT '单板类型',
  `slot` varchar(4) DEFAULT NULL COMMENT '槽位号',
  `slot_status` int(1) DEFAULT NULL COMMENT '槽位状态',
  `board_name` varchar(32) DEFAULT NULL COMMENT '单板名称',
  `board_pcb_version` varchar(32) DEFAULT NULL COMMENT '单板版本',
  `cpu_usage_rate` double(32,2) DEFAULT NULL COMMENT 'CPU使用率',
  `mem_usage_rate` double(32,2) DEFAULT NULL COMMENT '内存使用率',
  `mem_used` varchar(32) DEFAULT NULL COMMENT '内存使用大小',
  `mem_total` varchar(32) DEFAULT NULL COMMENT '内存总大小',
  `sdram` varchar(32) DEFAULT NULL COMMENT 'SDRAM大小',
  `flash` varchar(32) DEFAULT NULL COMMENT 'flash大小',
  `nvram` varchar(32) DEFAULT NULL COMMENT 'nvram大小',
  `cfcard_mem` varchar(32) DEFAULT NULL COMMENT 'cfcard内存大小',
  `board_up_time` varchar(64) DEFAULT NULL COMMENT '设备启动时间',
  `user_count` varchar(32) DEFAULT NULL COMMENT '用户数',
  `ipv4_user_count` varchar(32) DEFAULT NULL COMMENT 'IPV4用户',
  `ipv6_user_count` varchar(32) DEFAULT NULL COMMENT 'IPV6用户',
  `mac_in_used` varchar(32) DEFAULT NULL COMMENT 'MAC',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='设备单板基本信息表';

-- ----------------------------
-- Records of dev_board_info
-- ----------------------------
INSERT INTO `dev_board_info` VALUES ('', 'cc7de2a9eb4611e9be2400163e043dd1', 'cc8931f2eb4611e9be2400163e043dd1', null, null, null, 'MPU  7(Slave)', 'SWC02MFUD000', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c4230e9-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'MPU  7(Slave)', 'SWC02MFUD000', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c4d2d0b-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'MPU  8(Master)', 'SWC02MFUD000  VER.B', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c587694-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'LPU  1', 'SWC02MFUD000  VER.B', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c5d6475-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'LPU  2', 'SWC02MFUD000  VER.B', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c635e64-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'LPU  5', 'SWC02MFUD000  VER.B', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c68e56c-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'CMU  9(Master)', '', null, null, null, null, 'null', null, null, null, '4  weeks,  6  days,  16  hours,  8  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c78a6d2-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'MPU  7(Slave)', 'SWC02MFUD000  VER.B', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c840d32-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'MPU  8(Master)', 'SWC02MFUD000  VER.B', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c8dccda-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'LPU  1', 'SWC02MFUD000  VER.B', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c92bbb1-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'LPU  2', 'SWC02MFUD000  VER.B', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c97c93d-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'LPU  5', 'SWC02MFUD000  VER.B', null, null, null, null, 'null', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('0c9c7ecd-eb45-11e9-be24-00163e043dd1', '0', '0', null, null, null, 'CMU 9(Master)', '', null, null, null, null, 'null', null, null, null, '4 weeks, 6 days, 16 hours, 8 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('1', '1', '1', 'MPU', '7', '1', 'MPU 7(Slave)', 'SWC02MFUD000 VER.B', null, null, null, null, '4096', '64', '512', null, '14 weeks, 6 days, 3 hours, 32 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('10', '1', '2', 'LPU', '2', '0', 'LPU2', 'SWC02X32SX2S VER.A', null, null, null, null, '1024', '64', null, null, '14 weeks, 6 days, 3 hours, 32 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('11', '1', '2', 'LPU', '5', '0', 'LPU5', 'SWC02X32SX2S VER.A', null, null, null, null, '2048', '64', null, null, '14 weeks, 6 days, 3 hours, 32 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('12', '12', '2', 'CMU', '9', '1', 'CMU 9(Master)', 'LE02CMUA VER.B', null, null, null, null, null, null, null, null, '14 weeks, 6 days, 3 hours, 32 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('13', '3', '2', null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('2', '1', '1', 'MPU', '8', '0', 'MPU 8(Master)', 'SWC02MFUD000 VER.B', null, null, null, null, '4096', '64', '512', null, '4 weeks, 6 days, 16 hours, 9 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3', '1', '1', 'LPU', '1', '0', 'LPU 1', 'SWC02X32SX2S VER.A', null, null, null, null, '1024', '64', null, null, '14 weeks, 6 days, 15 hours, 59 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3f54234a066d11eabe2400163e043dd1', '3f40877f066d11eabe2400163e043dd1', '3f4b8337066d11eabe2400163e043dd1', null, null, null, 'MPU  7(Slave)', 'SWC02MFUD000', null, null, null, null, '4096  M  bytes', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3f666076066d11eabe2400163e043dd1', '3f40877f066d11eabe2400163e043dd1', '3f4b8337066d11eabe2400163e043dd1', null, null, null, 'MPU  8(Master)', 'SWC02MFUD000  VER.B', null, null, null, null, '4096  M  bytes', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3f79f21c066d11eabe2400163e043dd1', '3f40877f066d11eabe2400163e043dd1', '3f4b8337066d11eabe2400163e043dd1', null, null, null, 'LPU  1', 'SWC02MFUD000  VER.B', null, null, null, null, '4096  M  bytes', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3f82417c066d11eabe2400163e043dd1', '3f40877f066d11eabe2400163e043dd1', '3f4b8337066d11eabe2400163e043dd1', null, null, null, 'LPU  2', 'SWC02MFUD000  VER.B', null, null, null, null, '4096  M  bytes', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3f8a3b12066d11eabe2400163e043dd1', '3f40877f066d11eabe2400163e043dd1', '3f4b8337066d11eabe2400163e043dd1', null, null, null, 'LPU  5', 'SWC02MFUD000  VER.B', null, null, null, null, '4096  M  bytes', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3f9229be066d11eabe2400163e043dd1', '3f40877f066d11eabe2400163e043dd1', '3f4b8337066d11eabe2400163e043dd1', null, null, null, 'CMU  9(Master)', '', null, null, null, null, '', null, null, null, '4  weeks,  6  days,  16  hours,  8  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3faeaa5a066d11eabe2400163e043dd1', '3f9b20bc066d11eabe2400163e043dd1', '3fa42b0c066d11eabe2400163e043dd1', null, null, null, 'MPU  7(Slave)', 'SWC02MFUD000  VER.B', null, null, null, null, '4096  M  bytes', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3fc103f3066d11eabe2400163e043dd1', '3f9b20bc066d11eabe2400163e043dd1', '3fa42b0c066d11eabe2400163e043dd1', null, null, null, 'MPU  8(Master)', 'SWC02MFUD000  VER.B', null, null, null, null, '4096  M  bytes', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3fd3da75066d11eabe2400163e043dd1', '3f9b20bc066d11eabe2400163e043dd1', '3fa42b0c066d11eabe2400163e043dd1', null, null, null, 'LPU  1', 'SWC02MFUD000  VER.B', null, null, null, null, '4096  M  bytes', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3fdd79a3066d11eabe2400163e043dd1', '3f9b20bc066d11eabe2400163e043dd1', '3fa42b0c066d11eabe2400163e043dd1', null, null, null, 'LPU  2', 'SWC02MFUD000  VER.B', null, null, null, null, '4096  M  bytes', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3fe5a1b4066d11eabe2400163e043dd1', '3f9b20bc066d11eabe2400163e043dd1', '3fa42b0c066d11eabe2400163e043dd1', null, null, null, 'LPU  5', 'SWC02MFUD000  VER.B', null, null, null, null, '4096  M  bytes', null, null, null, '14  weeks,  6  days,  3  hours,  32  minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('3fee5386066d11eabe2400163e043dd1', '3f9b20bc066d11eabe2400163e043dd1', '3fa42b0c066d11eabe2400163e043dd1', null, null, null, 'CMU 9(Master)', '', null, null, null, null, '', null, null, null, '4 weeks, 6 days, 16 hours, 8 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('4', '1', '1', 'LPU', '2', '0', 'LPU 2', 'SWC02X32SX2S VER.A', null, null, null, null, '1024', '64', null, null, '14 weeks, 6 days, 15 hours, 59 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('5', '1', '1', 'LPU', '5', '0', 'LPU 5', 'SWC02G48TXF0 VER.A', null, null, null, null, '2048', '64', null, null, '14 weeks, 6 days, 16 hours, 2 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('6', '1', '1', 'CMU', '9', '0', 'CMU 9(Master)', 'LE02CMUA VER.B', null, null, null, null, null, null, null, null, '14 weeks, 6 days, 3 hours, 32 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('7', '1', '2', 'MPU', '7', '0', 'MPU 7(Slave)', 'SWC02MFUD000 VER.B', null, null, null, null, '4096', '64', '512', null, '14 weeks, 6 days, 3 hours, 32 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('8', '1', '2', 'MPU', '8', '0', 'MPU 8(Master)', 'SWC02MFUD000 VER.B', null, null, null, null, '4096', '64', '512', null, '14 weeks, 6 days, 3 hours, 32 minutes', null, null, null, null);
INSERT INTO `dev_board_info` VALUES ('9', '1', '2', 'LPU', '1', '0', 'LPU 1', 'SWC02X32SX2S VER.A', null, null, null, null, '1024', '64', null, null, '14 weeks, 6 days, 3 hours, 32 minutes', null, null, null, null);

-- ----------------------------
-- Table structure for `dev_box_info`
-- ----------------------------
DROP TABLE IF EXISTS `dev_box_info`;
CREATE TABLE `dev_box_info` (
  `id` varchar(55) NOT NULL DEFAULT '' COMMENT '盒子ID',
  `box_no` varchar(100) DEFAULT NULL COMMENT '盒子编号MAC',
  `box_status` int(1) DEFAULT NULL COMMENT '盒子状态',
  `box_detail` varchar(100) DEFAULT NULL COMMENT '盒子描述',
  `box_type` varchar(50) DEFAULT NULL COMMENT '设备ID',
  `user_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='盒子基本信息表-白名单';

-- ----------------------------
-- Records of dev_box_info
-- ----------------------------
INSERT INTO `dev_box_info` VALUES ('1', 'XXXX', '1', '北京方正电子', 'v1版本', '662d318c3f74b1714d8af5e11f270bb3');
INSERT INTO `dev_box_info` VALUES ('2', 'GGGG', '1', '联想', 'v1.1版本', 'e9ca23d68d884d4ebb19d07889727dae');
INSERT INTO `dev_box_info` VALUES ('3', 'smbox1', '1', '北京方正电子', 'v1版本', '662d318c3f74b1714d8af5e11f270bb3');

-- ----------------------------
-- Table structure for `dev_chassis_info`
-- ----------------------------
DROP TABLE IF EXISTS `dev_chassis_info`;
CREATE TABLE `dev_chassis_info` (
  `id` varchar(55) NOT NULL DEFAULT '' COMMENT '序号',
  `basicinfo_id` varchar(55) DEFAULT NULL COMMENT '设备基本信息表id',
  `board_id` varchar(55) DEFAULT NULL COMMENT '机框id',
  `chassis_type` varchar(12) DEFAULT NULL COMMENT '机框类型1-master;2-slave',
  `chassis_name` varchar(32) DEFAULT NULL COMMENT '机框名称',
  `device_type` varchar(32) DEFAULT NULL COMMENT '设备类型',
  `total_power` varchar(32) DEFAULT NULL COMMENT '电源大小',
  `need_power` varchar(32) DEFAULT NULL COMMENT '需要电源大小',
  `remain_power` varchar(32) DEFAULT NULL COMMENT '当前电源大小',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='机框基本信息表';

-- ----------------------------
-- Records of dev_chassis_info
-- ----------------------------
INSERT INTO `dev_chassis_info` VALUES ('2', '11', '2', 'Standby', 'Chassis 2 (Standby Switch)', 'S9300', null, null, null);
INSERT INTO `dev_chassis_info` VALUES ('3f4b8337066d11eabe2400163e043dd1', '3f40877f066d11eabe2400163e043dd1', null, null, 'Chassis  1  (Master  Switch)', 'S9300', null, null, null);
INSERT INTO `dev_chassis_info` VALUES ('3fa42b0c066d11eabe2400163e043dd1', '3f9b20bc066d11eabe2400163e043dd1', null, null, 'Chassis  2  (Master  Switch)', 'S9300', null, null, null);

-- ----------------------------
-- Table structure for `dev_interface_info`
-- ----------------------------
DROP TABLE IF EXISTS `dev_interface_info`;
CREATE TABLE `dev_interface_info` (
  `id` varchar(55) NOT NULL DEFAULT '' COMMENT '序号',
  `basicinfo_id` varchar(55) DEFAULT NULL COMMENT '设备ID',
  `interface_name` varchar(32) DEFAULT NULL COMMENT '接口名称',
  `master_inter_name` varchar(55) DEFAULT NULL COMMENT '上层接口名称',
  `interface_type` varchar(8) DEFAULT NULL COMMENT '接口类型',
  `interface_slot` varchar(32) DEFAULT NULL COMMENT '接口槽位号',
  `in_uti` varchar(32) DEFAULT NULL COMMENT '入口利用率',
  `out_uti` varchar(32) DEFAULT NULL COMMENT '出口利用率',
  `phy_status` varchar(4) DEFAULT NULL COMMENT '物理口状态',
  `protocal_status` varchar(32) DEFAULT NULL COMMENT '协议口状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='接口基本信息';

-- ----------------------------
-- Records of dev_interface_info
-- ----------------------------
INSERT INTO `dev_interface_info` VALUES ('1', '1', 'Eth-Trunk1', null, 'NA', null, '0%', '0%', 'up', 'up');
INSERT INTO `dev_interface_info` VALUES ('10', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('11', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('12', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('13', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('14', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('15', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('16', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('17', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('18', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('19', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('2', '1', ' XGigabitEthernet1/2/0/8 ', null, '10G', '1/2/0/8 ', '0%', '0%', 'up', 'up');
INSERT INTO `dev_interface_info` VALUES ('20', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('21', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('22', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('24', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('25', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('3', '1', null, null, null, null, null, null, 'up', 'up');
INSERT INTO `dev_interface_info` VALUES ('4', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('5', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('6', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('7', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('8', '1', null, null, null, null, null, null, null, null);
INSERT INTO `dev_interface_info` VALUES ('9', '1', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dev_subboard_info`
-- ----------------------------
DROP TABLE IF EXISTS `dev_subboard_info`;
CREATE TABLE `dev_subboard_info` (
  `id` varchar(55) NOT NULL DEFAULT '' COMMENT '序号',
  `board_id` varchar(55) DEFAULT NULL COMMENT '单板编号',
  `picName` varchar(32) DEFAULT NULL COMMENT '子卡名称',
  `pic_slot` varchar(4) DEFAULT NULL COMMENT '子卡槽位号',
  `pic_version` varchar(32) DEFAULT NULL COMMENT '子卡版本号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of dev_subboard_info
-- ----------------------------
INSERT INTO `dev_subboard_info` VALUES ('', 'cc8e3359eb4611e9be2400163e043dd1', null, null, 'SWC02VS04000  VER.A');
INSERT INTO `dev_subboard_info` VALUES ('0c48603e-eb45-11e9-be24-00163e043dd1', '0', null, null, 'SWC02VS04000  VER.A');
INSERT INTO `dev_subboard_info` VALUES ('0c52db07-eb45-11e9-be24-00163e043dd1', '0', null, null, 'SWC02VS04000  VER.A');
INSERT INTO `dev_subboard_info` VALUES ('0c7eddf3-eb45-11e9-be24-00163e043dd1', '0', null, null, 'SWC02VS04000  VER.A');
INSERT INTO `dev_subboard_info` VALUES ('0c88d4eb-eb45-11e9-be24-00163e043dd1', '0', null, null, 'SWC02VS04000  VER.A');
INSERT INTO `dev_subboard_info` VALUES ('1', '1', 'LE1D2VS04000', '1', 'SWC02VS04000 VER.A');
INSERT INTO `dev_subboard_info` VALUES ('10', '1', null, null, null);
INSERT INTO `dev_subboard_info` VALUES ('11', '1', null, null, null);
INSERT INTO `dev_subboard_info` VALUES ('12', '1', null, null, null);
INSERT INTO `dev_subboard_info` VALUES ('2', '2', 'LE1D2VS04000', '1', 'SWC02VS04000 VER.A');
INSERT INTO `dev_subboard_info` VALUES ('3', '7', 'LE1D2VS04000', '1', 'SWC02VS04000');
INSERT INTO `dev_subboard_info` VALUES ('3f5e42c0066d11eabe2400163e043dd1', '3f54234a066d11eabe2400163e043dd1', 'LE1D2VS04000', '1', 'SWC02VS04000  VER.A');
INSERT INTO `dev_subboard_info` VALUES ('3f71db40066d11eabe2400163e043dd1', '3f666076066d11eabe2400163e043dd1', 'LE1D2VS04000', '1', 'SWC02VS04000  VER.A');
INSERT INTO `dev_subboard_info` VALUES ('3fb6ac51066d11eabe2400163e043dd1', '3faeaa5a066d11eabe2400163e043dd1', 'LE1D2VS04000', '1', 'SWC02VS04000  VER.A');
INSERT INTO `dev_subboard_info` VALUES ('3fca5c02066d11eabe2400163e043dd1', '3fc103f3066d11eabe2400163e043dd1', 'LE1D2VS04000', '1', 'SWC02VS04000  VER.A');
INSERT INTO `dev_subboard_info` VALUES ('4', '8', 'LE1D2VS04000', '1', 'SWC02VS04000');
INSERT INTO `dev_subboard_info` VALUES ('5', '1', null, '2', null);
INSERT INTO `dev_subboard_info` VALUES ('6', '1', null, null, null);
INSERT INTO `dev_subboard_info` VALUES ('7', '1', null, null, null);
INSERT INTO `dev_subboard_info` VALUES ('8', '1', null, null, null);
INSERT INTO `dev_subboard_info` VALUES ('9', '1', null, null, null);
