package com.example.android.scorekeeper;

import android.content.Context;
import android.widget.Toast;

public class ToastingAll {
    public static void showToast(Context mContext, String message){
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}
