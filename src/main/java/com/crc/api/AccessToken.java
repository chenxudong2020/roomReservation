package com.crc.api;


import com.crc.entity.api.AccessTokenIn;
import com.crc.entity.api.AccessTokenOut;
import org.spring.boot.extender.interfacecall.annotation.InterfaceClient;
import org.spring.boot.extender.interfacecall.annotation.POST;

@InterfaceClient
public interface AccessToken {


    @POST("${accessToken}")
    AccessTokenOut getAccessToken(AccessTokenIn in);
}
