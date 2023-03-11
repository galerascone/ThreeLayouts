package com.example.threelayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.threelayouts.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn1.setOnClickListener(view -> {
            startActivity(new Intent(this, Screen1.class));
        });

        binding.btn2.setOnClickListener(view -> {
            startActivity(new Intent(this, Screen2.class));
        });

        binding.btn3.setOnClickListener(view -> {
            startActivity(new Intent(this, Screen3.class));
        });
    }
}