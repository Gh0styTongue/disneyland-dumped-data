package com.disney.wdpro.universal_checkout_ui.daohybrid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes20.dex */
public @interface JSWebViewBridgeMapping {
    String value() default "";
}