package com.sunzhibin.newmusic;

import android.os.Environment;

import java.io.File;

/**
 * Created by codeest on 2016/8/3.
 */
public class Constants {

    public static final String PATH_DATA = MainApplication.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    public static final String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "codeest" + File.separator + "GeekNews";
}
