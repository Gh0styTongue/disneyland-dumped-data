package com.disney.wdpro.photopasscommons.ext;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m92038d2 = {"Ljava/io/File;", "", "fileName", "a", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.f */
/* loaded from: classes15.dex */
public final class C18812f {
    /* renamed from: a */
    public static final File m60571a(File file, String fileName) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        String strSubstringBeforeLast$default = StringsKt.substringBeforeLast$default(path, separator, (String) null, 2, (Object) null);
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "path");
        File file2 = new File(strSubstringBeforeLast$default + separator + fileName + "." + StringsKt.substringAfterLast$default(path2, ".", (String) null, 2, (Object) null));
        return (file.renameTo(file2) || file2.exists()) ? file2 : file;
    }
}