package com.microservice.rabbitmq.devices.entity;

public class DevInterfaceInfo {
    private String id;

    private String basicinfoId;

    private String interfaceName;
    
    private String masterInterName;

    public String getMasterInterName() {
		return masterInterName;
	}

	public void setMasterInterName(String masterInterName) {

        this.masterInterName = masterInterName == null ? null : masterInterName.trim();
	}

	private String interfaceType;

    private String interfaceSlot;

    private String inUti;

    private String outUti;

    private String phyStatus;

    private String protocalStatus;

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

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName == null ? null : interfaceName.trim();
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType == null ? null : interfaceType.trim();
    }

    public String getInterfaceSlot() {
        return interfaceSlot;
    }

    public void setInterfaceSlot(String interfaceSlot) {
        this.interfaceSlot = interfaceSlot == null ? null : interfaceSlot.trim();
    }

    public String getInUti() {
        return inUti;
    }

    public void setInUti(String inUti) {
        this.inUti = inUti == null ? null : inUti.trim();
    }

    public String getOutUti() {
        return outUti;
    }

    public void setOutUti(String outUti) {
        this.outUti = outUti == null ? null : outUti.trim();
    }

    public String getPhyStatus() {
        return phyStatus;
    }

    public void setPhyStatus(String phyStatus) {
        this.phyStatus = phyStatus == null ? null : phyStatus.trim();
    }

    public String getProtocalStatus() {
        return protocalStatus;
    }

    public void setProtocalStatus(String protocalStatus) {
        this.protocalStatus = protocalStatus == null ? null : protocalStatus.trim();
    }
}