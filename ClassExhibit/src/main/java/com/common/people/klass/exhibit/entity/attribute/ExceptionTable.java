package com.common.people.klass.exhibit.entity.attribute;

public class ExceptionTable {
    private Integer startPC;
    private Integer endPC;
    private Integer handlerPC;
    private Integer catchType;

    public ExceptionTable() {
    }

    public ExceptionTable setStartPC(Integer startPC) {
        this.startPC = startPC;
        return this;
    }

    public ExceptionTable setEndPC(Integer endPC) {
        this.endPC = endPC;
        return this;
    }

    public ExceptionTable setHandlerPC(Integer handlerPC) {
        this.handlerPC = handlerPC;
        return this;
    }

    public ExceptionTable setCatchType(Integer catchType) {
        this.catchType = catchType;
        return this;
    }

    public Integer getStartPC() {
        return startPC;
    }

    public Integer getEndPC() {
        return endPC;
    }

    public Integer getHandlerPC() {
        return handlerPC;
    }

    public Integer getCatchType() {
        return catchType;
    }
}
