package com.example.myhilttest.network.bean;

public class RspData {
    private String result;
    private String reason;
    private int error_code;
    private String resultcode;

    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public int getError_code() {
        return error_code;
    }
    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
    public String getResultcode() {
        return resultcode;
    }
    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }
    @Override
    public String toString() {
        return "RspData{" +
                "result='" + result + '\'' +
                ", reason='" + reason + '\'' +
                ", error_code=" + error_code +
                ", resultcode='" + resultcode + '\'' +
                '}';
    }
}
