package com.microservice.rabbitmq.devices.entity;

public class DevChassisInfo {
    private String id;

    private String basicinfoId;

    private String boardId;

    private String chassisType;

    private String chassisName;

    private String deviceType;

    private String totalPower;

    private String needPower;

    private String remainPower;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBasicinfoId() {
        return basicinfoId;
    }

    public void setBasicinfoId(String basicinfoId) {
        this.basicinfoId = basicinfoId == null ? null : basicinfoId.trim();
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId == null ? null : boardId.trim();
    }

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType == null ? null : chassisType.trim();
    }

    public String getChassisName() {
        return chassisName;
    }

    public void setChassisName(String chassisName) {
        this.chassisName = chassisName == null ? null : chassisName.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getTotalPower() {
        return totalPower;
    }

    public void setTotalPower(String totalPower) {
        this.totalPower = totalPower == null ? null : totalPower.trim();
    }

    public String getNeedPower() {
        return needPower;
    }

    public void setNeedPower(String needPower) {
        this.needPower = needPower == null ? null : needPower.trim();
    }

    public String getRemainPower() {
        return remainPower;
    }

    public void setRemainPower(String remainPower) {
        this.remainPower = remainPower == null ? null : remainPower.trim();
    }
}