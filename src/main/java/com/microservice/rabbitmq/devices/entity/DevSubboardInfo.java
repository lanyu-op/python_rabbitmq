package com.microservice.rabbitmq.devices.entity;

public class DevSubboardInfo {
    private String id;

    private String boardId;

    private String picname;

    private String picSlot;

    private String picVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId == null ? null : boardId.trim();
    }

    public String getPicname() {
        return picname;
    }

    public void setPicname(String picname) {
        this.picname = picname == null ? null : picname.trim();
    }

    public String getPicSlot() {
        return picSlot;
    }

    public void setPicSlot(String picSlot) {
        this.picSlot = picSlot == null ? null : picSlot.trim();
    }

    public String getPicVersion() {
        return picVersion;
    }

    public void setPicVersion(String picVersion) {
        this.picVersion = picVersion == null ? null : picVersion.trim();
    }
}