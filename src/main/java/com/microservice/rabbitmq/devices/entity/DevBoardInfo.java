package com.microservice.rabbitmq.devices.entity;

public class DevBoardInfo {
    private String id;

    private String basicInfoId;

    private String chassisId;

    private String boardType;

    private String slot;

    private Integer slotStatus;

    private String boardName;

    private String boardPcbVersion;

    private Double cpuUsageRate;

    private Double memUsageRate;

    private String memUsed;

    private String memTotal;

    private String sdram;

    private String flash;

    private String nvram;

    private String cfcardMem;

    private String boardUpTime;

    private String userCount;

    private String ipv4UserCount;

    private String ipv6UserCount;

    private String macInUsed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBasicInfoId() {
        return basicInfoId;
    }

    public void setBasicInfoId(String basicInfoId) {
        this.basicInfoId = basicInfoId == null ? null : basicInfoId.trim();
    }

    public String getChassisId() {
        return chassisId;
    }

    public void setChassisId(String chassisId) {
        this.chassisId = chassisId == null ? null : chassisId.trim();
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType == null ? null : boardType.trim();
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot == null ? null : slot.trim();
    }

    public Integer getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(Integer slotStatus) {
        this.slotStatus = slotStatus;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName == null ? null : boardName.trim();
    }

    public String getBoardPcbVersion() {
        return boardPcbVersion;
    }

    public void setBoardPcbVersion(String boardPcbVersion) {
        this.boardPcbVersion = boardPcbVersion == null ? null : boardPcbVersion.trim();
    }

    public Double getCpuUsageRate() {
        return cpuUsageRate;
    }

    public void setCpuUsageRate(Double cpuUsageRate) {
        this.cpuUsageRate = cpuUsageRate;
    }

    public Double getMemUsageRate() {
        return memUsageRate;
    }

    public void setMemUsageRate(Double memUsageRate) {
        this.memUsageRate = memUsageRate;
    }

    public String getMemUsed() {
        return memUsed;
    }

    public void setMemUsed(String memUsed) {
        this.memUsed = memUsed == null ? null : memUsed.trim();
    }

    public String getMemTotal() {
        return memTotal;
    }

    public void setMemTotal(String memTotal) {
        this.memTotal = memTotal == null ? null : memTotal.trim();
    }

    public String getSdram() {
        return sdram;
    }

    public void setSdram(String sdram) {
        this.sdram = sdram == null ? null : sdram.trim();
    }

    public String getFlash() {
        return flash;
    }

    public void setFlash(String flash) {
        this.flash = flash == null ? null : flash.trim();
    }

    public String getNvram() {
        return nvram;
    }

    public void setNvram(String nvram) {
        this.nvram = nvram == null ? null : nvram.trim();
    }

    public String getCfcardMem() {
        return cfcardMem;
    }

    public void setCfcardMem(String cfcardMem) {
        this.cfcardMem = cfcardMem == null ? null : cfcardMem.trim();
    }

    public String getBoardUpTime() {
        return boardUpTime;
    }

    public void setBoardUpTime(String boardUpTime) {
        this.boardUpTime = boardUpTime == null ? null : boardUpTime.trim();
    }

    public String getUserCount() {
        return userCount;
    }

    public void setUserCount(String userCount) {
        this.userCount = userCount == null ? null : userCount.trim();
    }

    public String getIpv4UserCount() {
        return ipv4UserCount;
    }

    public void setIpv4UserCount(String ipv4UserCount) {
        this.ipv4UserCount = ipv4UserCount == null ? null : ipv4UserCount.trim();
    }

    public String getIpv6UserCount() {
        return ipv6UserCount;
    }

    public void setIpv6UserCount(String ipv6UserCount) {
        this.ipv6UserCount = ipv6UserCount == null ? null : ipv6UserCount.trim();
    }

    public String getMacInUsed() {
        return macInUsed;
    }

    public void setMacInUsed(String macInUsed) {
        this.macInUsed = macInUsed == null ? null : macInUsed.trim();
    }
}