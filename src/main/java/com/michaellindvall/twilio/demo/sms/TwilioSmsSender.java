/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * TwilioSmsSender.java
 * Dec 10, 2019
 */
package com.michaellindvall.twilio.demo.sms;

import com.michaellindvall.twilio.demo.config.TwilioConfiguration;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author mlindvall
 */
@Service
@Slf4j
@AllArgsConstructor
@Twilio
public class TwilioSmsSender implements SmsSender {

    private final TwilioConfiguration twilioConfiguration;
    @Override
    public void sendSms(final SmsRequest smsRequest) {
        if (isPhoneNumberValid(smsRequest.getPhoneNumber())) {
            PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String message = smsRequest.getMessage();
            final MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            log.info("sent sms {}", smsRequest);
        } else {
            throw new IllegalArgumentException("Phone number [" + smsRequest.getPhoneNumber() + "] is not a valid number");
        }
    }

    private boolean isPhoneNumberValid(final String phoneNumber) {
        // TODO google's own phone number validator
        return true;
    }
}
