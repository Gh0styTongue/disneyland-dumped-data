package com.disney.wdpro.scanner.zxing.client.managers;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import com.disney.wdpro.scanner.zxing.client.utils.Constants;
import hr.C28458e;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes17.dex */
public final class BeepManager implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, Closeable {
    private static final float BEEP_VOLUME = 0.1f;
    private static final String TAG = "BeepManager";
    private static final long VIBRATE_DURATION = 200;
    private final Activity activity;
    private MediaPlayer mediaPlayer = null;
    private boolean playBeep;
    private final Bundle prefs;
    private boolean vibrate;

    public BeepManager(Activity activity, Bundle bundle) {
        this.activity = activity;
        this.prefs = bundle;
        updatePrefs();
    }

    private MediaPlayer buildMediaPlayer(Context context) throws IllegalStateException, Resources.NotFoundException, IOException {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(C28458e.beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                return mediaPlayer;
            } catch (Throwable th2) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th2;
            }
        } catch (IOException unused) {
            mediaPlayer.release();
            return null;
        }
    }

    private static boolean shouldBeep(Bundle bundle, Context context) {
        boolean z10 = bundle.getBoolean(Constants.KEY_PLAY_BEEP, true);
        if (!z10 || ((AudioManager) context.getSystemService("audio")).getRingerMode() == 2) {
            return z10;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
        mediaPlayer.seekTo(0);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public synchronized boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        try {
            if (i10 == 100) {
                this.activity.finish();
            } else {
                mediaPlayer.release();
                this.mediaPlayer = null;
                updatePrefs();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return true;
    }

    public synchronized void playBeepSoundAndVibrate() {
        MediaPlayer mediaPlayer;
        try {
            if (this.playBeep && (mediaPlayer = this.mediaPlayer) != null) {
                mediaPlayer.start();
            }
            if (this.vibrate) {
                ((Vibrator) this.activity.getSystemService("vibrator")).vibrate(200L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void updatePrefs() {
        this.playBeep = shouldBeep(this.prefs, this.activity);
        this.vibrate = this.prefs.getBoolean(Constants.KEY_VIBRATE, false);
        if (this.playBeep && this.mediaPlayer == null) {
            this.activity.setVolumeControlStream(3);
            this.mediaPlayer = buildMediaPlayer(this.activity);
        }
    }
}