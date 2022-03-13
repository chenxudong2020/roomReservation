package com.crc.api;


import com.crc.entity.api.ListSubIdIn;
import com.crc.entity.api.ListSubIdOut;
import com.crc.entity.api.ListSubOut;
import org.spring.boot.extender.interfacecall.annotation.Body;
import org.spring.boot.extender.interfacecall.annotation.InterfaceClient;
import org.spring.boot.extender.interfacecall.annotation.POST;
import org.spring.boot.extender.interfacecall.annotation.Query;


@InterfaceClient
public interface ListSubId {




    @POST("${ListSubId}")
    ListSubIdOut listSub(@Query("access_token") String accessToken, @Body ListSubIdIn listSubIdIn);
}
