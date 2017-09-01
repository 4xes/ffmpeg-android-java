package com.github.hiteshsondhi88.sampleffmpeg;


import android.app.Application;
import android.content.Context;

import com.github.hiteshsondhi88.libffmpeg.FFmpeg;

public class App extends Application {

    private static FFmpeg instance;
    private static Context context;

    public static FFmpeg getFFmpegInstance() {
        if (instance == null) {
            instance = FFmpeg.getInstance(context);
        }
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
