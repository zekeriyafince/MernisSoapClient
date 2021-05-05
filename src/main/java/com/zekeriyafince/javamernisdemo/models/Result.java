package com.zekeriyafince.javamernisdemo.models;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:42
 */
public class Result implements com.zekeriyafince.javamernisdemo.interfaces.IResult {

    private boolean success;
    private String message;

    public Result(boolean success) {
        this.success = success;
    }

    public Result(Boolean success, String message) {
        this(success);
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

}
