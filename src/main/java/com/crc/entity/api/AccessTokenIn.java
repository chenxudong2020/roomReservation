package com.crc.entity.api;

import java.io.Serializable;

public class AccessTokenIn implements Serializable {


    /**
     * appKey : dingyormkwbrsxcrepsb
     * appSecret : VtPvy6-5E3bnxGxp3OP4rsAlhrDo44x01IxLVgY_QOqfkGCrKDBaXhgBUpDo2Buq
     */

    private String appKey;
    private String appSecret;


    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
