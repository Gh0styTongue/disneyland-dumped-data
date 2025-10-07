package com.disney.wdpro.photopasscommons.ext;

import android.content.Context;
import androidx.core.content.C3296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/photopasscommons/ext/l;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "permissions", "", "a", "(Landroid/content/Context;[Ljava/lang/String;)Z", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nPhotoPassPermissionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoPassPermissionUtil.kt\ncom/disney/wdpro/photopasscommons/ext/PhotoPassPermissionUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,23:1\n12271#2,2:24\n*S KotlinDebug\n*F\n+ 1 PhotoPassPermissionUtil.kt\ncom/disney/wdpro/photopasscommons/ext/PhotoPassPermissionUtil\n*L\n19#1:24,2\n*E\n"})
/* renamed from: com.disney.wdpro.photopasscommons.ext.l */
/* loaded from: classes15.dex */
public final class C18818l {
    public static final C18818l INSTANCE = new C18818l();

    private C18818l() {
    }

    /* renamed from: a */
    public final boolean m60582a(Context context, String... permissions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        for (String str : permissions) {
            if (C3296a.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }
}