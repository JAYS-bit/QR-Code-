package com.example.qrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.qrscanner.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


  ActivityMainBinding binding;
  public static TextView scantext ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        scantext= binding.scantext;
        setContentView(binding.getRoot());

        binding.scanbtn.setOnClickListener(v->{

            startActivity(new Intent(MainActivity.this,ScannerView.class));


        });
    }
}