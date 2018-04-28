package com.projects.lyaisan.testapplication;


import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GameOneFragment extends Fragment {

    WebView gameOneWebView;

    public GameOneFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState) {

        return inflater.inflate(
                R.layout.fragment_game_one,
                container,
                false);
    }

    @Override
    @SuppressLint("SetJavaScriptEnabled")
    public void onViewCreated(View view, Bundle savedInstanceSaved) {
        super.onViewCreated(view, savedInstanceSaved);

        gameOneWebView = view.findViewById(R.id.game_one);
        gameOneWebView.getSettings().setAllowFileAccessFromFileURLs(true);
        gameOneWebView.getSettings().setJavaScriptEnabled(true);
        gameOneWebView.loadUrl("file:///android_asset/game_one/index.html");
    }
}
