/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * SmsRequest.java
 * Dec 10, 2019
 */
package com.michaellindvall.twilio.demo.sms;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author mlindvall
 */
@RequiredArgsConstructor
@Data
public class SmsRequest {

    @JsonProperty("phoneNumber")
    @NotBlank
    private final String phoneNumber; // destination number

    @JsonProperty("message")
    @NotBlank
    private final String message;
}
