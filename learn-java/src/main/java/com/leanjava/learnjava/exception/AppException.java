package com.leanjava.learnjava.exception;

public class AppException extends RuntimeException{

    public AppException(ErrCode errCode) {
        super(errCode.getMessage());
        this.errCode = errCode;
    }

    private ErrCode errCode;

    public ErrCode getErrCode() {
        return errCode;
    }

    public void setErrCode(ErrCode errCode) {
        this.errCode = errCode;
    }
}
