package com.ethicaldigit.motionlayoutexample.Ads;

import androidx.appcompat.app.AppCompatActivity;

import com.ethicaldigit.motionlayoutexample.R;
import com.ethicaldigit.motionlayoutexample.Utils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.os.Bundle;
import android.view.View;

public class BannerAdsActivity extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ads_view);
        setTitle("Banner Ads");

        // Initialize the Mobile Ads SDK
        Utils.setAdInitialize(this);

        adView = findViewById(R.id.adView);
        adView.setVisibility(View.VISIBLE);

        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    @Override
    protected void onPause() {
        super.onPause();
        adView.setVisibility(View.INVISIBLE);
    }
}
