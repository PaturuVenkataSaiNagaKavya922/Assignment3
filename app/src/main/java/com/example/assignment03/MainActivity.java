package com.example.assignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone=findViewById(R.id.phone);
    }
    public void Caller(View view)
    {
        String l=phone.getText().toString();
        Uri uri=Uri.parse("tel:"+l);
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}
