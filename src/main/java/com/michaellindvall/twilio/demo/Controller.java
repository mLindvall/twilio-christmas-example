/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * Controller.java
 * Dec 10, 2019
 */
package com.michaellindvall.twilio.demo;

import com.michaellindvall.twilio.demo.service.Service;
import com.michaellindvall.twilio.demo.sms.SmsRequest;
import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.voice.Say;
import com.twilio.twiml.voice.Say.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author mlindvall
 */
@RestController
@RequestMapping("api/v1/sms")
@RequiredArgsConstructor
public class Controller {

    private final Service service;

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {
        service.sendSms(smsRequest);
    }

    @PostMapping(value = "/void-note", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Object> getVoiceNote() {
        String otp = "12345";
        Say say = new Say.Builder("Your OTP is: " + otp).voice(Say.Voice.MAN).language(Language.EN_US).build();
        VoiceResponse response = new VoiceResponse.Builder().say(say).build();
        return new ResponseEntity<>(response.toXml(), HttpStatus.OK);
    }
    @PostMapping(value = "/calls", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Object> makeCall() {
        String otp = "12345";
        Say say = new Say.Builder("Your OTP is: " + otp).voice(Say.Voice.MAN).language(Language.EN_US).build();
        VoiceResponse response = new VoiceResponse.Builder().say(say).build();
        return new ResponseEntity<>(response.toXml(), HttpStatus.OK);
    }
}
