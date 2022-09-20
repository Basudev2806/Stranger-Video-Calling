package com.basudev.videocalling.Models;

import android.webkit.JavascriptInterface;

import com.basudev.videocalling.UI.Activities.CallActivity;

public class InterfaceJava {

    CallActivity callActivity;

    public InterfaceJava(CallActivity callActivity) {
        this.callActivity = callActivity;
    }

    @JavascriptInterface
    public void onPeerConnected(){
        callActivity.onPeerConnected();
    }

}
