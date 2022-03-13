package com.crc.entity.api;

import java.util.List;

public class ListAdminOut {

    private int errcode;
    private String errmsg;
    private List<ResultBean> result;
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

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public static class ResultBean {
        private int sys_level;
        private String userid;

        public int getSys_level() {
            return sys_level;
        }

        public void setSys_level(int sys_level) {
            this.sys_level = sys_level;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }
    }
}
