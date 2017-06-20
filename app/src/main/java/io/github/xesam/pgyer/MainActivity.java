package io.github.xesam.pgyer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.xesam.pgyer.module.Pgyer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pgyer.register(this, Pgyer.UPDATE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Pgyer.unregister(Pgyer.UPDATE);
    }
}
