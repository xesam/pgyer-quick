package io.github.xesam.pgyer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pgyersdk.update.PgyUpdateManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PgyUpdateManager.register(this, null);
    }
}
