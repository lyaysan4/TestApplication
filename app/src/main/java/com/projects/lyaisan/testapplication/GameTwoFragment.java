package com.projects.lyaisan.testapplication;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GameTwoFragment extends Fragment {

    WebView gameTwoWebView;

    public GameTwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_game_two, container,false);
    }

    @Override
    @SuppressLint("SetJavaScriptEnabled")
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gameTwoWebView = view.findViewById(R.id.game_two);
        gameTwoWebView.getSettings().setAllowFileAccessFromFileURLs(true);
        gameTwoWebView.getSettings().setJavaScriptEnabled(true);

        gameTwoWebView.loadUrl("file:///android_asset/game2/index.html");
    }
}
