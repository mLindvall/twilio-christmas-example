/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * Twilio.java
 * Dec 10, 2019
 */
package com.michaellindvall.twilio.demo.sms;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mlindvall
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE, ElementType.CONSTRUCTOR})
@Qualifier
public @interface Twilio {
}
