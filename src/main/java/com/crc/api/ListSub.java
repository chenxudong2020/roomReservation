package com.crc.api;


import com.crc.entity.api.ListAdminOut;
import com.crc.entity.api.ListSubOut;
import org.spring.boot.extender.interfacecall.annotation.InterfaceClient;
import org.spring.boot.extender.interfacecall.annotation.POST;
import org.spring.boot.extender.interfacecall.annotation.Query;


@InterfaceClient
public interface ListSub {




    @POST("${listSub}")
    ListSubOut listSub(@Query("access_token") String accessToken);
}
