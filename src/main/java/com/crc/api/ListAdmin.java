package com.crc.api;


import com.crc.entity.api.ListAdminOut;
import org.spring.boot.extender.interfacecall.annotation.InterfaceClient;
import org.spring.boot.extender.interfacecall.annotation.POST;
import org.spring.boot.extender.interfacecall.annotation.Query;

@InterfaceClient
public interface ListAdmin {


    @POST("${listAdmin}")
    ListAdminOut ListAdmin(@Query("access_token") String accessToken);
}
