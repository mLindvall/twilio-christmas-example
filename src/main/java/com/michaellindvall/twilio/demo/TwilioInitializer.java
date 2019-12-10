/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * TwilioInitializer.java
 * Dec 10, 2019
 */
package com.michaellindvall.twilio.demo;

import com.michaellindvall.twilio.demo.config.TwilioConfiguration;
import com.twilio.Twilio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author mlindvall
 */
@Configuration
@Slf4j
public class TwilioInitializer {
    private final TwilioConfiguration twilioConfiguration;

    @Autowired
    public TwilioInitializer(TwilioConfiguration config) {
        this.twilioConfiguration = config;
        Twilio.init(twilioConfiguration.getAccountSid(), twilioConfiguration.getAuthToken());
        log.info("TWilio initialized ... with account sid {}", twilioConfiguration.getAccountSid());
    }
}
