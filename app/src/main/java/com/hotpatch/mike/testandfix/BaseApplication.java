package com.hotpatch.mike.testandfix;

import android.app.Application;
import android.os.Environment;
import android.util.Log;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.File;
import java.io.IOException;

/**
 * Created by mike on 2016/8/25.
 */
public class BaseApplication extends Application {
    private static final String APATCH_PATH = "/out.apatch";
    private PatchManager mPatchManager;
    @Override
    public void onCreate() {
        super.onCreate();
        mPatchManager = new PatchManager(this);
        mPatchManager.init("1.0");
        mPatchManager.loadPatch();
        // add patch at runtime
        try {
            // .apatch file path
//            String patchFileString = Environment.getExternalStorageDirectory()
//                    .getAbsolutePath() + APATCH_PATH;
        String patchFileString = "/sdcard"+APATCH_PATH;
            File file = new File(patchFileString);
            Log.d("www","isFileExist : "+file.exists() +"patchFileString = "+patchFileString+
                "    Environment.getExternalStorageDirectory()="+Environment.getExternalStorageDirectory().getAbsolutePath()+
                    APATCH_PATH);
            mPatchManager.addPatch(patchFileString);
        } catch (IOException e) {
        }
    }

}
