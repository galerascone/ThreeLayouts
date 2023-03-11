package com.example.threelayouts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.threelayouts.databinding.ActivityScreen2Binding;

public class Screen2 extends AppCompatActivity {
    private ActivityScreen2Binding binding;
    private boolean flag  = false;
    private boolean flag2  = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScreen2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.civPinterest.setOnClickListener(v -> {
            if(flag){
                flag = false;
                binding.circularProgressBar.setProgress(0);
                binding.civPinterest.setBorderColor(ContextCompat.getColor(this , R.color.gray));
            }else{
                flag = true;
                binding.circularProgressBar.setProgress(100);
                binding.civPinterest.setBorderColor(ContextCompat.getColor(this , R.color.red));
            }
        });

        binding.civPinterest2.setOnClickListener(v -> {
            if(flag2){
                flag2 = false;
                binding.circularProgressBar2.setProgress(0);
                binding.civPinterest2.setBorderColor(ContextCompat.getColor(this , R.color.gray));
            }else{
                flag2 = true;
                binding.circularProgressBar2.setProgress(100);
                binding.civPinterest2.setBorderColor(ContextCompat.getColor(this , R.color.red));
            }
        });
    }
}