package com.aaryan.home_page;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class feedback extends AppCompatActivity {
    Button btnsend;
    TextView tvFeedback;
    RatingBar rbStars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        getSupportActionBar().hide();
        tvFeedback = findViewById(R.id.tvFeedback);
        rbStars = findViewById(R.id.rbStars);
        btnsend =(Button) findViewById(R.id.btnSend);
        btnsend.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                String UriText = "mailto:" + Uri.encode("morsefeedback@gmail.com") + "?subject=" +
                        Uri.encode("Feedback") + Uri.encode("");
                Uri uri = Uri.parse(UriText);
                intent.setData(uri);
                startActivity(Intent.createChooser(intent, "send email"));
            }

        });


        rbStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating==1)
                {
                    tvFeedback.setText("Poor");
                }
                else if(rating==2)
                {
                    tvFeedback.setText("Unsatisfactory");
                }
                else if(rating==3)
                {
                    tvFeedback.setText("Satisfactory");
                }
                else if(rating==4)
                {
                    tvFeedback.setText("Very Satisfactory");
                }
                else if(rating==5)
                {
                    tvFeedback.setText("Outstanding");
                }
                else
                {

                }
            }
        });
    }
}