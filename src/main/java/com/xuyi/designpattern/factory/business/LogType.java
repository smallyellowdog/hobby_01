package com.xuyi.designpattern.factory.business;

public enum  LogType {

    LOG1(1,"日志类型1"),
    LOG2(2,"日志类型2");

    private int code;
    private String desc;

    LogType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
