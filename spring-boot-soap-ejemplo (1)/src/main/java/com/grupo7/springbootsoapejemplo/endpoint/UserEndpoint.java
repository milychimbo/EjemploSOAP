package com.grupo7.springbootsoapejemplo.endpoint;

import com.grupo7.spring_boot_soap_ejemplo.GetUserRequest;
import com.grupo7.spring_boot_soap_ejemplo.GetUserResponse;
import com.grupo7.springbootsoapejemplo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserService userService;


    @PayloadRoot(namespace = "http://grupo7.com/spring-boot-soap-ejemplo",
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}