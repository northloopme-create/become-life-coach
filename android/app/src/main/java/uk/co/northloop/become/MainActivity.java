package uk.co.northloop.become;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
    private WebView webView;
    @Override public void onCreate(Bundle state) { super.onCreate(state); webView=new WebView(this); webView.setWebViewClient(new WebViewClient()); webView.setWebChromeClient(new WebChromeClient()); webView.getSettings().setJavaScriptEnabled(true); webView.getSettings().setDomStorageEnabled(true); CookieManager.getInstance().setAcceptCookie(true); CookieManager.getInstance().setAcceptThirdPartyCookies(webView,true); setContentView(webView); webView.loadUrl("https://become-better-daily.ponderosa016.chatgpt.site"); }
    @Override public void onBackPressed() { if(webView.canGoBack())webView.goBack();else super.onBackPressed(); }
}
