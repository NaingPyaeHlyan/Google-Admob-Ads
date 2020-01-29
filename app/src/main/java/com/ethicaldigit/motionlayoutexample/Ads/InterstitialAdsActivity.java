package com.ethicaldigit.motionlayoutexample.Ads;

import androidx.appcompat.app.AppCompatActivity;

import com.ethicaldigit.motionlayoutexample.MainActivity;
import com.ethicaldigit.motionlayoutexample.R;
import com.ethicaldigit.motionlayoutexample.Utils;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class InterstitialAdsActivity extends AppCompatActivity {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize the Mobile Ads SDK
        Utils.setAdInitialize(this);

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.ad_unit_interstitial));

        AdRequest adRequest = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest);

        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                interstitialAd.show();
            }

            @Override
            public void onAdFailedToLoad(int i) {
                Toast.makeText(InterstitialAdsActivity.this, "onAdFailedToLoad() : " + i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdClosed() {
                startActivity(new Intent(InterstitialAdsActivity.this, MainActivity.class));
            }
        });
    }
}
