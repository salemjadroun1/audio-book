package com.example.audiobook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class audioface extends AppCompatActivity {

    TextView audio_nameaudio ;
    ImageView audio_image ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audioface);
        audio_nameaudio = findViewById(R.id.audioface_namebook);
        audio_image = findViewById(R.id.audioface_imageface);

        Intent intent = getIntent();
        audio_nameaudio.setText(intent.getStringExtra("audio_nameaudio"));
        audio_image.setImageResource(intent.getIntExtra("audio_image",0));
    }
}
