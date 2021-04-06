package com.example.goog.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.goog.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Adult_Game_Fragment extends Fragment {

    WebView adult_webview;

    public Adult_Game_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =  inflater.inflate(R.layout.fragment_adult__game_, container, false);

        // Web_View Initialization
      adult_webview = view.findViewById(R.id.adult_webview);
      adult_webview.setWebViewClient(new WebViewClient());
      adult_webview.loadUrl("https://www.nutaku.com");
      adult_webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);


      // WebView Web Setting
        WebSettings webSettings = adult_webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setDisplayZoomControls(false);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setAppCacheEnabled(true);


        // WebView Back pressed Method
        adult_webview.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && adult_webview.canGoBack()) {
                    adult_webview.goBack();
                    return true;
                }

                return false;
            }
        });





        return view;

    }
}
