package com.project.madapp.ui.notifications;

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

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private WebView aWebView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        notificationsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        aWebView = (WebView) root.findViewById(R.id.aweb);

        WebSettings webSettings = aWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        aWebView.setWebViewClient(new WebViewClient());
        /*Document doc = null;
        try {
            doc = Jsoup.connect("https://lms.latrobe.edu.au/course/view.php?id=68994").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements ele = doc.select("div#yui_3_17_2_1_1571572910116_449");
        aWebView.loadData( ele.toString(), "text/html", "utf-8");*/
        aWebView.loadUrl("https://lms.latrobe.edu.au/course/view.php?id=68994");

        return root;
    }
}