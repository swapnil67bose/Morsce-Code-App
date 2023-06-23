package com.aaryan.home_page;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ImageButton imageButton = findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,learn.class);
            startActivity(intent);
        });
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
        }

        ImageButton imageButton1 = findViewById(R.id.imageButton3);
        imageButton1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,splash.class);
            startActivity(intent);
        });

        ImageButton imageButton2 = findViewById(R.id.imageButton4);
        imageButton2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,converter.class);
            startActivity(intent);
        });

        ImageButton imageButton3 = findViewById(R.id.imageButton6);
        imageButton3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,feedback.class);
            startActivity(intent);
        });






    }
}