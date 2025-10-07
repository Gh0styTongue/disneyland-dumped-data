package com.disney.wdpro.universal_checkout_ui.daohybrid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Instrumented
/* loaded from: classes20.dex */
public enum PdfViewerHelper {
    INSTANCE;

    private static final String APPLICATION_CONTENT_TYPE_PDF = "application/pdf";
    private static final String DIR_NAME = "pdf_agreements";
    private static final String TAG = "PdfHelper";
    private String pdfFileName = "agreement.pdf";

    PdfViewerHelper() {
    }

    public static PdfViewerHelper getInstance() {
        return INSTANCE;
    }

    public boolean deletePdfAgreementsDir(File file) {
        if (file != null && file.isDirectory()) {
            for (String str : file.list()) {
                if (!deletePdfAgreementsDir(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public File getPdfAgreementsDir(Context context) {
        return new File(context.getCacheDir(), DIR_NAME);
    }

    public void viewPdfFile(File file, Activity activity, String str) throws Exception {
        try {
            Uri uriForFile = FileProvider.getUriForFile(activity, str, file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, APPLICATION_CONTENT_TYPE_PDF);
            intent.setFlags(67108864);
            intent.addFlags(1);
            activity.startActivity(intent);
        } catch (Exception e10) {
            LogInstrumentation.m79026e(TAG, e10.getMessage());
            throw new Exception(e10.getMessage());
        }
    }

    public File writeBytesAsFile(Context context, byte[] bArr) throws Exception {
        if (bArr == null) {
            throw new Exception("No pdf data is available");
        }
        File pdfAgreementsDir = getPdfAgreementsDir(context);
        try {
            pdfAgreementsDir.mkdirs();
            try {
                File file = new File(pdfAgreementsDir, this.pdfFileName);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return file;
            } catch (IOException e10) {
                LogInstrumentation.m79026e(TAG, e10.getMessage());
                throw new Exception("Error writing pdf data bytes to cache");
            }
        } catch (SecurityException e11) {
            LogInstrumentation.m79026e(TAG, e11.getMessage());
            throw new Exception("Permissions issue");
        }
    }
}