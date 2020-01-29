package com.ethicaldigit.motionlayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ethicaldigit.motionlayoutexample.Ads.BannerAdsActivity;
import com.ethicaldigit.motionlayoutexample.Ads.InterstitialAdsActivity;
import com.ethicaldigit.motionlayoutexample.Ads.NativeAdsActivity;
import com.ethicaldigit.motionlayoutexample.Ads.RewardedAdsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBanner(View view) {
        startActivity(new Intent(MainActivity.this, BannerAdsActivity.class));
    }

    public void clickInterstitial(View view) {
        startActivity(new Intent(MainActivity.this, InterstitialAdsActivity.class));
    }

    public void clickNative(View view) {
        startActivity(new Intent(MainActivity.this, NativeAdsActivity.class));
    }

    public void clickRewarded(View view) {
        startActivity(new Intent(MainActivity.this, RewardedAdsActivity.class));
    }
}
