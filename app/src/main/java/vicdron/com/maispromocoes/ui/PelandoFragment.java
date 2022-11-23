package vicdron.com.maispromocoes.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import vicdron.com.maispromocoes.R;


public class PelandoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_pelando, container, false);
        ((AdView) view.findViewById(R.id.adView)).loadAd(new AdRequest.Builder().build());

        WebView webView = (WebView) view.findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.pelando.com.br/");

        return view;
    }
}