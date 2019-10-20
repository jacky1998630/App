package com.project.madapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.project.madapp.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private WebView iWebView;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        iWebView = (WebView) root.findViewById(R.id.info);

        WebSettings webSettings = iWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        iWebView.setWebViewClient(new WebViewClient());
        /*Document doc = null;
        try {
            doc = Jsoup.connect("https://lms.latrobe.edu.au/course/view.php?id=68994").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements ele = doc.select("div#yui_3_17_2_1_1571572910116_449");
        iWebView.loadData( ele.toString(), "text/html", "utf-8");*/
        iWebView.loadUrl("https://lms.latrobe.edu.au/course/view.php?id=68994");
        return root;
    }
}