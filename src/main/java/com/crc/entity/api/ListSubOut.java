package com.crc.entity.api;

import java.util.List;

public class ListSubOut {


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
        private boolean auto_add_user;
        private boolean create_dept_group;
        private String dept_id;
        private String name;
        private int parent_id;

        public boolean isAuto_add_user() {
            return auto_add_user;
        }

        public void setAuto_add_user(boolean auto_add_user) {
            this.auto_add_user = auto_add_user;
        }

        public boolean isCreate_dept_group() {
            return create_dept_group;
        }

        public void setCreate_dept_group(boolean create_dept_group) {
            this.create_dept_group = create_dept_group;
        }

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getParent_id() {
            return parent_id;
        }

        public void setParent_id(int parent_id) {
            this.parent_id = parent_id;
        }
    }
}


