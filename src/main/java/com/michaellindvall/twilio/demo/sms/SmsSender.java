/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * SmsSender.java
 * Dec 10, 2019
 */
package com.michaellindvall.twilio.demo.sms;

/**
 * @author mlindvall
 */
public interface SmsSender {
    void sendSms(SmsRequest smsRequest);
}
