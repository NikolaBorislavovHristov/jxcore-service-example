package com.stellarscript.jxcoreserviceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.jxcore.node.JXCoreService;

public final class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent startJXCoreIntent = new Intent(getApplicationContext(), JXCoreService.class);
        startService(startJXCoreIntent);
    }

}
