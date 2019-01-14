package com.xuyi.aop.constant;

public enum  MethodPositionEnum {

    BEFORE("before","方法执行前"),
    AFTER("after","方法执行后");

    private String code;
    private String desc;

    MethodPositionEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
