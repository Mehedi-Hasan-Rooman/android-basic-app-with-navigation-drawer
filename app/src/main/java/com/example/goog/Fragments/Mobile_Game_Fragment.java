package com.example.goog.Fragments;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;

import com.example.goog.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Mobile_Game_Fragment extends Fragment {

    static WebView webView_moilegame;

    public Mobile_Game_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mobile__game_, container, false);

        // Web_View Initialization
        webView_moilegame = view.findViewById(R.id.web_view_mobilegame);
        webView_moilegame.setWebViewClient(new WebViewClient());
        webView_moilegame.loadUrl("https://usagamerland.blogspot.com/");
        webView_moilegame.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);


        //web View Web Setting
        WebSettings webSettings = webView_moilegame.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);
        webSettings.setAppCacheEnabled(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setDisplayZoomControls(false);



        // Webview Back Pressed Method
        webView_moilegame.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && webView_moilegame.canGoBack()) {
                    webView_moilegame.goBack();
                    return true;
                }

                return false;
            }
        });


        return view;


    }


}





