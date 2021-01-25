package com.renjie.crm.until;

import java.lang.Object;
import java.util.Objects;

public class Result {
    private int status;
    private Object data;
    private String msg;

    public Result() {
    }

    public Result(int status, Object data, String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result)) return false;
        Result result = (Result) o;
        return Objects.equals(status, result.status) && Objects.equals(data, result.data) && Objects.equals(msg, result.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, data, msg);
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
