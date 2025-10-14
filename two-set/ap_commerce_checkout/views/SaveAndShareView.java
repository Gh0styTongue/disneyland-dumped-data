package com.disney.wdpro.ap_commerce_checkout.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.pdf.PdfDocument;
import android.os.Environment;
import android.print.PrintAttributes;
import android.print.pdf.PrintedPdfDocument;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.support.util.C20932b;
import com.google.common.base.C22466q;
import com.google.common.collect.Maps;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes23.dex */
public class SaveAndShareView extends FrameLayout {
    private static final int DEFAULT_PADDING = 0;
    private static final float DEFAULT_SCALING = 1.0f;
    private static final float PAGE_HEIGHT = 11.0f;
    private static final double PAGE_WIDTH = 8.5d;
    private static final int PDF_DPI = 5;
    private static final int PDF_OFFSET = 10;
    private ShareViewStatusListener shareViewStatusListener;
    private SaveAndShareViewClient viewClient;

    /* renamed from: com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView$1 */
    static /* synthetic */ class C87461 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ap_commerce_checkout$views$SaveAndShareView$MetaData$OutputFileType */
        static final /* synthetic */ int[] f29272x8878a441;

        static {
            int[] iArr = new int[MetaData.OutputFileType.values().length];
            f29272x8878a441 = iArr;
            try {
                iArr[MetaData.OutputFileType.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29272x8878a441[MetaData.OutputFileType.PRINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29272x8878a441[MetaData.OutputFileType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Instrumented
    class CreatePDFFileTask {
        private PdfDocument createMultiPagePdfDocument(View view, int i10, int i11) {
            int width = view.getWidth();
            int letterSizeHeight = getLetterSizeHeight(width);
            PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(view.getContext(), getPrintSettings());
            int i12 = 0;
            while (true) {
                int i13 = i12 * letterSizeHeight;
                if (i13 + i11 >= i10) {
                    view.scrollTo(0, 0);
                    return printedPdfDocument;
                }
                int i14 = i12 + 1;
                PdfDocument.Page pageStartPage = printedPdfDocument.startPage(new PdfDocument.PageInfo.Builder(width, letterSizeHeight, i14).create());
                Canvas canvas = pageStartPage.getCanvas();
                canvas.translate(0.0f, (-i13) + r3);
                view.scrollTo(0, i13 - (i12 * 10));
                view.draw(canvas);
                try {
                    canvas.save();
                    canvas.restore();
                } catch (IllegalStateException e10) {
                    if (e10.getMessage() == null) {
                        break;
                    }
                    if (!e10.getMessage().contains("Underflow in restore")) {
                        if (!e10.getCause().getMessage().contains("Underflow in restore")) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    throw e10;
                }
                printedPdfDocument.finishPage(pageStartPage);
                i12 = i14;
            }
            throw e10;
        }

        private File getFile(String str) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdir();
            }
            return new File(externalStoragePublicDirectory, str);
        }

        private int getLetterSizeHeight(int i10) {
            return (int) ((i10 * SaveAndShareView.PAGE_HEIGHT) / SaveAndShareView.PAGE_WIDTH);
        }

        private PrintAttributes getPrintSettings() {
            return new PrintAttributes.Builder().setColorMode(1).setResolution(new PrintAttributes.Resolution("1", "pdfresolution", 5, 5)).setMediaSize(PrintAttributes.MediaSize.NA_LETTER).setMinMargins(PrintAttributes.Margins.NO_MARGINS).build();
        }

        public Integer doInBackground(CreatePDFFileTaskParams... createPDFFileTaskParamsArr) throws IOException {
            int i10;
            CreatePDFFileTaskParams createPDFFileTaskParams = createPDFFileTaskParamsArr[0];
            String str = createPDFFileTaskParams.filename;
            PdfDocument pdfDocumentCreateMultiPagePdfDocument = createMultiPagePdfDocument(createPDFFileTaskParams.view, createPDFFileTaskParams.height, createPDFFileTaskParams.padding);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(getFile(str));
                pdfDocumentCreateMultiPagePdfDocument.writeTo(fileOutputStream);
                fileOutputStream.close();
                pdfDocumentCreateMultiPagePdfDocument.close();
                i10 = 1;
            } catch (Exception e10) {
                LogInstrumentation.m79026e("Error", e10.getMessage());
                i10 = -1;
            }
            return Integer.valueOf(i10);
        }

        public void onPostExecute(Integer num) {
            SaveAndShareView.this.handleResultFromCreatePDFFile(num);
        }

        private CreatePDFFileTask() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class CreatePDFFileTaskParams {
        String filename;
        int height;
        int padding;
        View view;

        CreatePDFFileTaskParams(String str, View view, int i10, int i11) {
            this.filename = str;
            this.view = view;
            this.height = i10;
            this.padding = i11;
        }
    }

    public static final class MetaData {
        private static final String DEFAULT_FILE_NAME = "default.pdf";
        private static final OutputFileType DEFAULT_FILE_TYPE = OutputFileType.PDF;
        private final Map<Extra, Object> extraMap;
        private final String outputFileName;
        private final OutputFileType outputFileType;

        public enum Extra {
            VERTICAL_PADDING,
            VERTICAL_SCALING
        }

        public static class MetaDataBuilder {
            private Map<Extra, Object> extraMap = Maps.m69381r();
            private String outputFileName;
            private OutputFileType outputFileType;

            public MetaDataBuilder addExtra(Extra extra, Object obj) {
                this.extraMap.put(extra, obj);
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            }

            public MetaDataBuilder withOutputFileName(String str) {
                this.outputFileName = str;
                return this;
            }

            public MetaDataBuilder withOutputFileType(OutputFileType outputFileType) {
                this.outputFileType = outputFileType;
                return this;
            }
        }

        public enum OutputFileType {
            TEXT,
            PDF,
            PRINT
        }

        private MetaData(MetaDataBuilder metaDataBuilder) {
            this.outputFileName = C22466q.m68722b(metaDataBuilder.outputFileName) ? DEFAULT_FILE_NAME : metaDataBuilder.outputFileName;
            this.outputFileType = metaDataBuilder.outputFileType == null ? DEFAULT_FILE_TYPE : metaDataBuilder.outputFileType;
            this.extraMap = metaDataBuilder.extraMap;
        }
    }

    public interface SaveAndShareViewClient<T> {
        T getDataToShare();

        MetaData getMetaData();
    }

    public class ShareViewOnClickListener implements View.OnClickListener {
        public ShareViewOnClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SaveAndShareView.this.shareViewStatusListener != null) {
                SaveAndShareView.this.shareViewStatusListener.onStart();
            }
            try {
                SaveAndShareView.this.savePDF();
            } catch (Exception unused) {
                SaveAndShareView.this.handleResultFromCreatePDFFile(-1);
            }
        }
    }

    public interface ShareViewStatusListener {
        void onResult(int i10);

        void onStart();
    }

    public SaveAndShareView(Context context) {
        super(context);
        init();
    }

    private void createPDF(String str, TextView textView) {
        createPDF(str, textView, textView.getLineHeight() * textView.getLineCount(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResultFromCreatePDFFile(Integer num) {
        ShareViewStatusListener shareViewStatusListener = this.shareViewStatusListener;
        if (shareViewStatusListener != null) {
            shareViewStatusListener.onResult(num.intValue());
        }
    }

    private void init() {
        View.inflate(getContext(), C8689R.layout.save_and_share_view, this);
        setOnClickListener(new ShareViewOnClickListener());
        C20932b.m63185d(this, C8689R.string.save_as_pdf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void savePDF() {
        float fFloatValue;
        int iIntValue;
        SaveAndShareViewClient saveAndShareViewClient = this.viewClient;
        if (saveAndShareViewClient == null) {
            return;
        }
        MetaData metaData = saveAndShareViewClient.getMetaData();
        Object dataToShare = this.viewClient.getDataToShare();
        if (!(dataToShare instanceof WebView)) {
            if (dataToShare instanceof TextView) {
                createPDF(metaData.outputFileName, (TextView) dataToShare);
                return;
            }
            return;
        }
        WebView webView = (WebView) dataToShare;
        Map map = metaData.extraMap;
        MetaData.Extra extra = MetaData.Extra.VERTICAL_SCALING;
        if (map.containsKey(extra)) {
            try {
                fFloatValue = ((Float) metaData.extraMap.get(extra)).floatValue();
            } catch (ClassCastException unused) {
            }
        } else {
            fFloatValue = 1.0f;
        }
        Map map2 = metaData.extraMap;
        MetaData.Extra extra2 = MetaData.Extra.VERTICAL_PADDING;
        if (map2.containsKey(extra2)) {
            try {
                iIntValue = ((Integer) metaData.extraMap.get(extra2)).intValue();
            } catch (ClassCastException unused2) {
            }
        } else {
            iIntValue = 0;
        }
        if (C87461.f29272x8878a441[metaData.outputFileType.ordinal()] != 1) {
            createPDF(metaData.outputFileName, webView, (int) (webView.getContentHeight() * fFloatValue), iIntValue);
        } else {
            createPDF(metaData.outputFileName, webView, (int) (webView.getContentHeight() * fFloatValue), iIntValue);
        }
    }

    public void setSaveAndShareViewClient(SaveAndShareViewClient saveAndShareViewClient) {
        this.viewClient = saveAndShareViewClient;
    }

    public void setShareViewStatusListener(ShareViewStatusListener shareViewStatusListener) {
        this.shareViewStatusListener = shareViewStatusListener;
    }

    private void createPDF(String str, final View view, int i10, int i11) {
        if (str == null || view == null || i10 <= 0) {
            return;
        }
        final CreatePDFFileTaskParams createPDFFileTaskParams = new CreatePDFFileTaskParams(str, view, i10, i11);
        final CreatePDFFileTask createPDFFileTask = new CreatePDFFileTask();
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.disney.wdpro.ap_commerce_checkout.views.b
            @Override // java.util.function.Supplier
            public final Object get() {
                return createPDFFileTask.doInBackground(createPDFFileTaskParams);
            }
        }).thenAccept(new Consumer() { // from class: com.disney.wdpro.ap_commerce_checkout.views.c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                view.post(new Runnable() { // from class: com.disney.wdpro.ap_commerce_checkout.views.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        createPDFFileTask.onPostExecute(num);
                    }
                });
            }
        });
    }

    public SaveAndShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SaveAndShareView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init();
    }
}