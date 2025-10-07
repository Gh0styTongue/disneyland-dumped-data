package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Profile;
import com.google.common.base.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0011\u0010\r\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUserImpl;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;", "()V", "profileManager", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "getProfileManager", "()Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "setProfileManager", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager;)V", "formatUserName", "", "profile", "Lcom/disney/wdpro/service/model/Profile;", "getLoggedInUserName", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class LoggedInUserImpl implements LoggedInUser {
    public static final int $stable = 8;

    @Inject
    public ProfileManager profileManager;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl", m92053f = "LoggedInUserImpl.kt", m92054i = {0}, m92055l = {16}, m92056m = "getLoggedInUserName", m92057n = {"this"}, m92058s = {"L$0"})
    /* renamed from: com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl$getLoggedInUserName$1 */
    static final class C216141 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C216141(Continuation<? super C216141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoggedInUserImpl.this.getLoggedInUserName(this);
        }
    }

    @Inject
    public LoggedInUserImpl() {
    }

    private final String formatUserName(Profile profile) {
        String strValueOf;
        String strValueOf2;
        Optional<String> suffix;
        Optional<String> suffix2;
        Optional<String> lastName;
        Optional<String> lastName2;
        Optional<String> firstName;
        Optional<String> firstName2;
        PersonName name = profile.getName();
        String str = null;
        String strValueOf3 = "";
        if (name == null || (firstName = name.getFirstName()) == null || !firstName.isPresent()) {
            strValueOf = "";
        } else {
            PersonName name2 = profile.getName();
            strValueOf = String.valueOf((name2 == null || (firstName2 = name2.getFirstName()) == null) ? null : firstName2.get());
        }
        PersonName name3 = profile.getName();
        if (name3 == null || (lastName = name3.getLastName()) == null || !lastName.isPresent()) {
            strValueOf2 = "";
        } else {
            PersonName name4 = profile.getName();
            strValueOf2 = String.valueOf((name4 == null || (lastName2 = name4.getLastName()) == null) ? null : lastName2.get());
        }
        PersonName name5 = profile.getName();
        if (name5 != null && (suffix = name5.getSuffix()) != null && suffix.isPresent()) {
            PersonName name6 = profile.getName();
            if (name6 != null && (suffix2 = name6.getSuffix()) != null) {
                str = suffix2.get();
            }
            strValueOf3 = String.valueOf(str);
        }
        return strValueOf + " " + strValueOf2 + " " + strValueOf3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getLoggedInUserName(kotlin.coroutines.Continuation<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl.C216141
            if (r0 == 0) goto L13
            r0 = r6
            com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl$getLoggedInUserName$1 r0 = (com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl.C216141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl$getLoggedInUserName$1 r0 = new com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl$getLoggedInUserName$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl r5 = (com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r6 = move-exception
            goto L58
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.C30180u0.m93207b()     // Catch: java.lang.Throwable -> L2d
            com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl$getLoggedInUserName$2$1 r2 = new com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl$getLoggedInUserName$2$1     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L2d
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = kotlinx.coroutines.C30064h.m92775g(r6, r2, r0)     // Catch: java.lang.Throwable -> L2d
            if (r6 != r1) goto L51
            return r1
        L51:
            com.disney.wdpro.service.model.Profile r6 = (com.disney.wdpro.service.model.Profile) r6     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = kotlin.Result.m104756constructorimpl(r6)     // Catch: java.lang.Throwable -> L2d
            goto L62
        L58:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            java.lang.Object r6 = kotlin.Result.m104756constructorimpl(r6)
        L62:
            java.lang.Throwable r0 = kotlin.Result.m104759exceptionOrNullimpl(r6)
            if (r0 != 0) goto L74
            com.disney.wdpro.service.model.Profile r6 = (com.disney.wdpro.service.model.Profile) r6
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.lang.String r5 = r5.formatUserName(r6)
            goto L79
        L74:
            r0.getMessage()
            java.lang.String r5 = ""
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl.getLoggedInUserName(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ProfileManager getProfileManager() {
        ProfileManager profileManager = this.profileManager;
        if (profileManager != null) {
            return profileManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profileManager");
        return null;
    }

    public final void setProfileManager(ProfileManager profileManager) {
        Intrinsics.checkNotNullParameter(profileManager, "<set-?>");
        this.profileManager = profileManager;
    }
}