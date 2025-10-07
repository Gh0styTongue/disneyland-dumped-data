package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.disney.wdpro.virtualqueue.C21487R;
import com.squareup.picasso.Transformation;

/* loaded from: classes20.dex */
public class SnowballAnimationUtils {
    private static final float COMPLETED_INTERPOLATOR_TIME = 1.0f;
    private static final int DEFAULT_ANIMATION_TIME = 500;

    private static class CircleTransform implements Transformation {
        @Override // com.squareup.picasso.Transformation
        public String key() {
            return "circle";
        }

        @Override // com.squareup.picasso.Transformation
        public Bitmap transform(Bitmap bitmap) {
            int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin);
            if (!bitmapCreateBitmap.equals(bitmap)) {
                bitmap.recycle();
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, bitmap.getConfig());
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

        private CircleTransform() {
        }
    }

    public static void collapse(View view, int i10, Animation.AnimationListener animationListener) {
        collapse(view, i10, animationListener, 500);
    }

    public static void expand(View view) {
        view.measure(-1, -2);
        expand(view, view.getMeasuredHeight(), null);
    }

    public static Transformation getCropCenterCircleTransform() {
        return new CircleTransform();
    }

    public static SnowballItemAnimator getDefaultItemAnimator(Resources resources) {
        SnowballItemAnimator snowballItemAnimator = new SnowballItemAnimator();
        long integer = resources.getInteger(C21487R.integer.anim_speed_medium);
        snowballItemAnimator.setAddDuration(integer);
        snowballItemAnimator.setRemoveDuration(integer);
        snowballItemAnimator.setChangeDuration(integer);
        snowballItemAnimator.setMoveDuration(resources.getInteger(C21487R.integer.anim_speed_fast));
        snowballItemAnimator.setRemoveMoveDifferenceDuration(integer);
        return snowballItemAnimator;
    }

    public static Animation getFadeAnimation(int i10, float f10, float f11, Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f10, f11);
        if (f10 > f11) {
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
        } else {
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
        }
        alphaAnimation.setDuration(i10);
        if (animationListener != null) {
            alphaAnimation.setAnimationListener(animationListener);
        }
        return alphaAnimation;
    }

    public static Animation getFadeInAnimation(int i10, Animation.AnimationListener animationListener) {
        return getFadeAnimation(i10, 0.0f, 1.0f, animationListener);
    }

    public static Animation getFadeOutAnimation(int i10, Animation.AnimationListener animationListener) {
        return getFadeAnimation(i10, 1.0f, 0.0f, animationListener);
    }

    private static Animation getModifyHeightAnimation(final View view, final int i10, int i11, Animation.AnimationListener animationListener) {
        final int measuredHeight = view.getMeasuredHeight();
        Animation animation = new Animation() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballAnimationUtils.5
            @Override // android.view.animation.Animation
            protected void applyTransformation(float f10, android.view.animation.Transformation transformation) {
                view.getLayoutParams().height = measuredHeight + ((int) (i10 * f10));
                view.requestLayout();
            }

            @Override // android.view.animation.Animation
            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration(i11);
        if (animationListener != null) {
            animation.setAnimationListener(animationListener);
        }
        return animation;
    }

    public static void hideCancelCTAButtonsAnimation(final View view, final View view2, final View view3) {
        view2.measure(-1, -2);
        view3.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        final Animation modifyHeightAnimation = getModifyHeightAnimation(view, (view3.getMeasuredHeight() - view2.getMeasuredHeight()) * (-1), 500, new Animation.AnimationListener() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballAnimationUtils.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view3.setVisibility(8);
                Animation fadeInAnimation = SnowballAnimationUtils.getFadeInAnimation(500, null);
                view2.setVisibility(0);
                view2.startAnimation(fadeInAnimation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view3.startAnimation(getFadeOutAnimation(500, new Animation.AnimationListener() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballAnimationUtils.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view3.setVisibility(4);
                view.startAnimation(modifyHeightAnimation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }));
    }

    public static void showCancelCTAButtonsAnimation(final View view, final View view2, final View view3) {
        view2.measure(-1, -2);
        view3.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        final Animation modifyHeightAnimation = getModifyHeightAnimation(view, view3.getMeasuredHeight() - view2.getMeasuredHeight(), 500, new Animation.AnimationListener() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballAnimationUtils.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Animation fadeInAnimation = SnowballAnimationUtils.getFadeInAnimation(500, null);
                view3.setVisibility(0);
                view3.startAnimation(fadeInAnimation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view2.startAnimation(getFadeOutAnimation(500, new Animation.AnimationListener() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballAnimationUtils.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view2.setVisibility(4);
                view.startAnimation(modifyHeightAnimation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }));
    }

    public static void collapse(final View view, final int i10, Animation.AnimationListener animationListener, int i11) {
        Animation animation = new Animation() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballAnimationUtils.6
            @Override // android.view.animation.Animation
            protected void applyTransformation(float f10, android.view.animation.Transformation transformation) {
                if (f10 == 1.0f) {
                    view.setVisibility(8);
                    view.getLayoutParams().height = i10;
                } else {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i12 = i10;
                    layoutParams.height = i12 - ((int) (i12 * f10));
                    view.requestLayout();
                }
            }

            @Override // android.view.animation.Animation
            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration(i11);
        animation.setAnimationListener(animationListener);
        view.requestLayout();
        view.startAnimation(animation);
    }

    public static void expand(View view, int i10, Animation.AnimationListener animationListener) {
        expand(view, i10, animationListener, 500);
    }

    public static void expand(final View view, final int i10, Animation.AnimationListener animationListener, int i11) {
        view.measure(-1, -2);
        view.setVisibility(0);
        view.getLayoutParams().height = view.getResources().getInteger(C21487R.integer.fix_collapse_value);
        Animation animation = new Animation() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballAnimationUtils.7
            @Override // android.view.animation.Animation
            protected void applyTransformation(float f10, android.view.animation.Transformation transformation) {
                view.getLayoutParams().height = f10 == ((float) view.getResources().getInteger(C21487R.integer.interpolator_completed_time)) ? -2 : (int) (i10 * f10);
                view.requestLayout();
            }

            @Override // android.view.animation.Animation
            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration(i11);
        animation.setAnimationListener(animationListener);
        view.requestLayout();
        view.startAnimation(animation);
    }
}