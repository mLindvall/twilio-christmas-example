/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * Service.java
 * Dec 10, 2019
 */
package com.michaellindvall.twilio.demo.service;

import com.michaellindvall.twilio.demo.sms.SmsRequest;
import com.michaellindvall.twilio.demo.sms.SmsSender;
import com.michaellindvall.twilio.demo.sms.Twilio;
import lombok.RequiredArgsConstructor;

/**
 * @author mlindvall
 */
@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    @Twilio
    private final SmsSender smsSender;
    public void sendSms(SmsRequest request) {
        smsSender.sendSms(request);
    }
}

