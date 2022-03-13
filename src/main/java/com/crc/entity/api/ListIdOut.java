package com.crc.entity.api;

import java.util.List;

public class ListIdOut {

    private int errcode;
    private String errmsg;
    private ResultBean result;
    private String request_id;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public static class ResultBean {
        private List<String> userid_list;

        public List<String> getUserid_list() {
            return userid_list;
        }

        public void setUserid_list(List<String> userid_list) {
            this.userid_list = userid_list;
        }
    }
}
