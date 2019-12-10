/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * TwilioConfiguration.java
 * Dec 10, 2019
 */
package com.michaellindvall.twilio.demo.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author mlindvall
 */
@Configuration
@ConfigurationProperties("twilio")
@NoArgsConstructor
@Setter
@Getter
public class TwilioConfiguration {

    private String accountSid;
    private String authToken;
    private String trialNumber;
}
