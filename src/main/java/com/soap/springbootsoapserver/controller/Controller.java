package com.soap.springbootsoapserver.controller;

import com.soap.springbootsoapserver.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.w3._2001.xmlschema.GetCarRequest;
import org.w3._2001.xmlschema.GetCarResponse;

@Endpoint
public class Controller {

    @Autowired
    private CarService carService;

    @PayloadRoot(namespace = "http://www.w3.org/2001/XMLSchema",
    localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCarRequest(@RequestPayload GetCarRequest request){
        GetCarResponse response = new GetCarResponse();
        response.setCar(carService.getCar(request.getModel()));
        return response;
    }
}
