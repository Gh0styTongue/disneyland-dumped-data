package com.disney.wdpro.httpclient.authentication;

import com.disney.wdpro.httpclient.authentication.model.UserBaseProfile;
import java.io.IOException;

/* loaded from: classes23.dex */
public interface UserDataProvider<T> {
    T provideUserData(UserBaseProfile userBaseProfile, String str) throws IOException;

    String refreshJwtToken(String str, String str2, String str3) throws IOException;
}