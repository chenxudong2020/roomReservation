package com.crc.api;

import com.crc.entity.api.ListIdOut;
import com.crc.entity.api.ListSubIdIn;
import com.crc.entity.api.ListSubIdOut;
import org.spring.boot.extender.interfacecall.annotation.Body;
import org.spring.boot.extender.interfacecall.annotation.InterfaceClient;
import org.spring.boot.extender.interfacecall.annotation.POST;
import org.spring.boot.extender.interfacecall.annotation.Query;

@InterfaceClient
public interface ListId {


    @POST("${listId}")
    ListIdOut listId(@Query("access_token") String accessToken, @Body ListSubIdIn listSubIdIn);
}
