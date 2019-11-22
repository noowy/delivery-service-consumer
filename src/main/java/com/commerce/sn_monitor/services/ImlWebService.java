package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.configs.ImlApiConfig;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryResponse;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatus;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatusRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

@Service
public class ImlWebService implements OrderDeliveryProcessingService
{

    private RestTemplate rest;
    private ImlApiConfig conf;

    public ImlWebService(RestTemplate rest, ImlApiConfig conf)
    {
        this.rest = rest;
        this.conf = conf;
    }

    @Override
    public ImlOrderDeliveryResponse makeDeliveryRequest(ImlOrderDeliveryRequest order)
    {

        return null;
    }

    @Override
    public ImlOrderDeliveryStatus getDeliveryStatus(ImlOrderDeliveryStatusRequest statusRequest)
    {
        String statusEndpoint = conf.ENDPOINT + "/GetStatuses";

        HttpHeaders headers = getRequiredHeaders();

        ImlOrderDeliveryStatusRequest requestInfo = new ImlOrderDeliveryStatusRequest();

        return null;
    }

    private HttpHeaders getRequiredHeaders()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic " + conf.getBase64EncodedCredentials());
        return headers;
    }
}