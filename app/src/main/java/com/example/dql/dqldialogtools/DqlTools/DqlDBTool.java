package com.example.dql.dqldialogtools.DqlTools;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author dql
 * @date 2018/4/12
 *
 */

public class DqlDBTool {

    /** 读文件buffer.*/
    private static final int FILE_BUFFER = 1024;
    private static String TAG = "DqlDBTool";

    /**
     * 数据库导出到sdcard.
     * @param context
     * @param dbName 数据库名字 例如 xx.db
     */
    public static void exportDb2Sdcard(Context context, String dbName) {
        String filePath = context.getDatabasePath(dbName).getAbsolutePath();
        byte[] buffer = new byte[FILE_BUFFER];
        int length;
        OutputStream output;
        InputStream input;
        try {
            input = new FileInputStream(new File((filePath)));
            output = new FileOutputStream(context.getExternalCacheDir() + File.separator + dbName);
            while ((length = input.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            output.flush();
            output.close();
            input.close();
            Log.i(TAG, "mv success!");
        } catch (IOException e) {
            Log.e(TAG, e.toString());
        }
    }
}
