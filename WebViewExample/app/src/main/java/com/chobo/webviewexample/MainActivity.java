package com.chobo.webviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView wb;
    private String url = "https://finance.naver.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wb = findViewById(R.id.webView);
        wb.getSettings().setJavaScriptEnabled(true); //webview에 대한 세팅. 자바스크립트에 대한 허용
        wb.loadUrl(url);
        wb.setWebChromeClient(new WebChromeClient()); //구글 크롬에 대한
        wb.setWebViewClient(new WebViewClientClass()); // 일반적인 경우에 대한

    }

    //ctrl + O(알파벳) -> 메소드 찾기
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) { //뒤로가기 버튼. 이 코드가 없으면 뒤로가기 누를 시 앱이 바로 종료 됨
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wb.canGoBack()){
            wb.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClientClass extends WebViewClient { //WebView가 URL 로딩을 어떻게 처리할지를 개발자가 커스텀할 수 있게 해주는 역할
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {//현재 페이지 url을 읽어올 수 있는 메소드
            view.loadUrl(url);
            return true;
        }
    }
}