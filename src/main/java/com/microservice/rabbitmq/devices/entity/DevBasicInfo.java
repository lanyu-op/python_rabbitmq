package com.microservice.rabbitmq.devices.entity;

import java.util.Date;

public class DevBasicInfo {
    private String id;

    private String userId;

    private String fileType;

    private String siteId;

    private String fileName;

    private String filePath;

    private Double fileSize;

    private Date collectTime;

    private String deviceStartTime;

    private String deviceRunTime;

    private String deviceType;

    private String deviceName;

    private String deviceVerison;

    private String devicePatch;

    private Integer deviceStatus;

    private String ipAddress;

    private String isbkp;

    private String bkpBoardType;

    private String bkpPcbVersion;

    private String description;

    private String licenseState;

    private String productName;

    private String productVersion;

    private String productSerialNo;

    private Date createTime;

    private Date expiredTime;

    private String boxNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Double getFileSize() {
        return fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public String getDeviceStartTime() {
        return deviceStartTime;
    }

    public void setDeviceStartTime(String deviceStartTime) {
        this.deviceStartTime = deviceStartTime == null ? null : deviceStartTime.trim();
    }

    public String getDeviceRunTime() {
        return deviceRunTime;
    }

    public void setDeviceRunTime(String deviceRunTime) {
        this.deviceRunTime = deviceRunTime == null ? null : deviceRunTime.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDeviceVerison() {
        return deviceVerison;
    }

    public void setDeviceVerison(String deviceVerison) {
        this.deviceVerison = deviceVerison == null ? null : deviceVerison.trim();
    }

    public String getDevicePatch() {
        return devicePatch;
    }

    public void setDevicePatch(String devicePatch) {
        this.devicePatch = devicePatch == null ? null : devicePatch.trim();
    }

    public Integer getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getIsbkp() {
        return isbkp;
    }

    public void setIsbkp(String isbkp) {
        this.isbkp = isbkp == null ? null : isbkp.trim();
    }

    public String getBkpBoardType() {
        return bkpBoardType;
    }

    public void setBkpBoardType(String bkpBoardType) {
        this.bkpBoardType = bkpBoardType == null ? null : bkpBoardType.trim();
    }

    public String getBkpPcbVersion() {
        return bkpPcbVersion;
    }

    public void setBkpPcbVersion(String bkpPcbVersion) {
        this.bkpPcbVersion = bkpPcbVersion == null ? null : bkpPcbVersion.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLicenseState() {
        return licenseState;
    }

    public void setLicenseState(String licenseState) {
        this.licenseState = licenseState == null ? null : licenseState.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion == null ? null : productVersion.trim();
    }

    public String getProductSerialNo() {
        return productSerialNo;
    }

    public void setProductSerialNo(String productSerialNo) {
        this.productSerialNo = productSerialNo == null ? null : productSerialNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getBoxNo() {
        return boxNo;
    }

    public void setBoxNo(String boxNo) {
        this.boxNo = boxNo == null ? null : boxNo.trim();
    }
}