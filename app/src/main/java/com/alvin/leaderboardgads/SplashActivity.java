package com.alvin.leaderboardgads;

import android.content.Intent;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

//import java.util.logging.Handler;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        new Handler()
                .postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    }
                }, 2000);
    }
    @Override
    public void onBackPressed() {}
}
