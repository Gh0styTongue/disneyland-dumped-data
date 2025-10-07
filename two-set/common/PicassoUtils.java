package com.disney.wdpro.virtualqueue.p462ui.common;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.C6894i;
import com.airbnb.lottie.C6977u;
import com.airbnb.lottie.C6994v0;
import com.airbnb.lottie.InterfaceC6925p0;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.p063id.android.tracker.OneIDTrackerEvent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Transformation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012JQ\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 ¨\u0006\""}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "url", "Landroid/widget/ImageView;", "imageView", "Lcom/squareup/picasso/Transformation;", "transformation", "Landroid/view/View;", "placeHolder", "Lcom/squareup/picasso/Callback;", "callback", "", "loadImage", "(Ljava/lang/String;Landroid/widget/ImageView;Lcom/squareup/picasso/Transformation;Landroid/view/View;Lcom/squareup/picasso/Callback;)V", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieView", "Landroid/widget/TextView;", "placeholder", "Landroid/animation/Animator$AnimatorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/airbnb/lottie/p0;", "", "failureListener", "", "pauseOnLoad", "loadLottieAnimation", "(Ljava/lang/String;Lcom/airbnb/lottie/LottieAnimationView;Landroid/widget/TextView;Landroid/animation/Animator$AnimatorListener;Lcom/airbnb/lottie/p0;Z)V", "Landroid/content/Context;", "CircleTransform", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class PicassoUtils {
    public static final int $stable = 8;
    private final Context context;

    @Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils$CircleTransform;", "Lcom/squareup/picasso/Transformation;", "()V", "key", "", "transform", "Landroid/graphics/Bitmap;", OneIDTrackerEvent.EVENT_PARAM_REPORTING_SOURCE, "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class CircleTransform implements Transformation {
        public static final int $stable = 0;

        @Override // com.squareup.picasso.Transformation
        public String key() {
            return "circle";
        }

        @Override // com.squareup.picasso.Transformation
        public Bitmap transform(Bitmap source) {
            Intrinsics.checkNotNullParameter(source, "source");
            int iMin = Math.min(source.getWidth(), source.getHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(source, (source.getWidth() - iMin) / 2, (source.getHeight() - iMin) / 2, iMin, iMin);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(source, x, y, size, size)");
            if (!Intrinsics.areEqual(bitmapCreateBitmap, source)) {
                source.recycle();
            }
            Bitmap.Config config = source.getConfig();
            if (config == null) {
                config = Bitmap.Config.ALPHA_8;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, config);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(size, size,…?: Bitmap.Config.ALPHA_8)");
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            Paint paint = new Paint();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
            paint.setAntiAlias(true);
            float f10 = iMin / 2.0f;
            canvas.drawCircle(f10, f10, f10, paint);
            bitmapCreateBitmap.recycle();
            return bitmapCreateBitmap2;
        }
    }

    @Inject
    public PicassoUtils(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ void loadImage$default(PicassoUtils picassoUtils, String str, ImageView imageView, Transformation transformation, View view, Callback callback, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            transformation = null;
        }
        if ((i10 & 8) != 0) {
            view = null;
        }
        if ((i10 & 16) != 0) {
            callback = null;
        }
        picassoUtils.loadImage(str, imageView, transformation, view, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadLottieAnimation$default(PicassoUtils picassoUtils, String str, LottieAnimationView lottieAnimationView, TextView textView, Animator.AnimatorListener animatorListener, InterfaceC6925p0 interfaceC6925p0, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            textView = null;
        }
        if ((i10 & 8) != 0) {
            animatorListener = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC6925p0 = null;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        picassoUtils.loadLottieAnimation(str, lottieAnimationView, textView, animatorListener, interfaceC6925p0, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadLottieAnimation$lambda$1(LottieAnimationView lottieView, Animator.AnimatorListener animatorListener, TextView textView, boolean z10, C6894i c6894i) {
        Intrinsics.checkNotNullParameter(lottieView, "$lottieView");
        lottieView.setComposition(c6894i);
        if (animatorListener != null) {
            lottieView.addAnimatorListener(animatorListener);
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        lottieView.setVisibility(0);
        lottieView.playAnimation();
        if (z10) {
            lottieView.setFrame(0);
            lottieView.pauseAnimation();
        }
    }

    public final void loadImage(String url, final ImageView imageView, Transformation transformation, final View placeHolder, final Callback callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        imageView.setVisibility(8);
        if (url.length() == 0) {
            return;
        }
        RequestCreator requestCreatorStableKey = Picasso.get().load(url).stableKey(url);
        if (transformation != null) {
            requestCreatorStableKey = requestCreatorStableKey.transform(transformation);
        }
        if (placeHolder != null) {
            requestCreatorStableKey = requestCreatorStableKey.noPlaceholder();
            placeHolder.setVisibility(0);
        }
        requestCreatorStableKey.into(imageView, new Callback() { // from class: com.disney.wdpro.virtualqueue.ui.common.PicassoUtils.loadImage.2
            @Override // com.squareup.picasso.Callback
            public void onError(Exception e10) {
                Intrinsics.checkNotNullParameter(e10, "e");
                View view = placeHolder;
                if (view != null) {
                    view.setVisibility(0);
                }
                imageView.setVisibility(8);
                Callback callback2 = callback;
                if (callback2 != null) {
                    callback2.onError(e10);
                }
            }

            @Override // com.squareup.picasso.Callback
            public void onSuccess() {
                View view = placeHolder;
                if (view != null) {
                    view.setVisibility(8);
                }
                imageView.setVisibility(0);
                Callback callback2 = callback;
                if (callback2 != null) {
                    callback2.onSuccess();
                }
            }
        });
    }

    public final void loadLottieAnimation(String url, final LottieAnimationView lottieView, final TextView placeholder, final Animator.AnimatorListener listener, InterfaceC6925p0<Throwable> failureListener, final boolean pauseOnLoad) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(lottieView, "lottieView");
        C6994v0<C6894i> c6994v0M33183J = C6977u.m33183J(this.context, url);
        if (placeholder != null) {
            placeholder.setVisibility(0);
        }
        c6994v0M33183J.m33331d(new InterfaceC6925p0() { // from class: com.disney.wdpro.virtualqueue.ui.common.g
            @Override // com.airbnb.lottie.InterfaceC6925p0
            public final void onResult(Object obj) {
                PicassoUtils.loadLottieAnimation$lambda$1(lottieView, listener, placeholder, pauseOnLoad, (C6894i) obj);
            }
        });
        if (failureListener != null) {
            c6994v0M33183J.m33330c(failureListener);
        }
    }
}