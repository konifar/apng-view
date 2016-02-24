package com.konifar.apngviewsample;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.Toast;

public class AppUtils {

    private static void showToast(String message, Context context, int duration) {
        if (message == null || message.length() == 0) return;

        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public static void showToast(String message, Context context) {
        showToast(message, context, Toast.LENGTH_LONG);
    }

    public static void showToast(int stringResId, Context context) {
        showToast(context.getResources().getString(stringResId), context);
    }

    public static void showWebPage(String url, Context context) {
        if (TextUtils.isEmpty(url)) return;

        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        context.startActivity(intent);
    }

}
