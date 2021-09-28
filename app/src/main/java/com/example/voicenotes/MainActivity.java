package com.example.voicenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public  void registerDetails(View view){
        TextView Signup=findViewById(R.id.Signup);
        Intent intent= new Intent(this, Register.class);
        startActivity(intent);

    }

    public void loginDetails(View view){
        TextView Signin=findViewById(R.id.Signin);
        Intent intent1=new Intent(this, Login.class);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}