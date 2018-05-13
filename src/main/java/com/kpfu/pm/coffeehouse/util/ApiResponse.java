package com.kpfu.pm.coffeehouse.util;

public class ApiResponse<T> {

    private T responseData;

    private String error;

    public ApiResponse(T responseData, String error) {
        this.responseData = responseData;
        this.error = error;
    }

    public T getResponseData() {
        return responseData;
    }

    public void setResponseData(T responseData) {
        this.responseData = responseData;
    }

    public String getError() {
        return error;
    }

    public void setError(String errors) {
        this.error = errors;
    }

}
