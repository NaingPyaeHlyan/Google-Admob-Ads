package com.ethicaldigit.motionlayoutexample.Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ethicaldigit.motionlayoutexample.R;
import com.ethicaldigit.motionlayoutexample.Utils;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;

public class NativeAdsActivity extends AppCompatActivity {

    private NativeAd nativeAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Utils.setAdInitialize(this);

        final AdLoader adLoader = new AdLoader.Builder(this, getString(R.string.ad_unit_native))
                .forUnifiedNativeAd(new UnifiedNativeAd.OnUnifiedNativeAdLoadedListener() {
                 @Override
                  public void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
                    // Show the ad

                    }
                })
                .withAdListener(new AdListener(){
                    @Override
                    public void onAdFailedToLoad(int errorCode){
                        // Handle the  failure by logging, altering the UI, and so on.
                    }
                })
                .withNativeAdOptions(new NativeAdOptions.Builder()
                        // Methods in the  NativeAdOptions.Builder class can be
                        // used here to specif individual options settings.
                  .build())
                .build();

        adLoader.loadAds(new AdRequest.Builder().build(), 5);
    }

}
