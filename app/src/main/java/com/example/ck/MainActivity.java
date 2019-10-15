package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
        Button button2;
        Button button3;
        Button button4;
        Button button5;
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button5);
        button5 = (Button)findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser5();
            }
        });


    }
    public void browser1(){
        String[] TO = {"superalavi20@gmail.com"};

        Intent browser1Intent = new Intent(Intent.ACTION_SEND);

        browser1Intent.setType("text/plain");
        browser1Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );
        browser1Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser1Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser1Intent);
    }
    public void browser2(){
        String[] TO = {"adityabhandari1500@gmail.com"};

        Intent browser2Intent = new Intent(Intent.ACTION_SEND);

        browser2Intent.setType("text/plain");
        browser2Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );
        browser2Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser2Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser2Intent);
    }
    public void browser3(){
        String[] TO = {"kunaljuneja07@gmail.com"};

        Intent browser3Intent = new Intent(Intent.ACTION_SEND);

        browser3Intent.setType("text/plain");
        browser3Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );
        browser3Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser3Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser3Intent);
    }
    public void browser4(){
        String[] TO = {"chauhannikita199@gmail.com"};

        Intent browser4Intent = new Intent(Intent.ACTION_SEND);

        browser4Intent.setType("text/plain");
        browser4Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );
        browser4Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser4Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser4Intent);
    }
    public void browser5(){
        String[] TO = {"rishikaumesh@gmail.com"};

        Intent browser5Intent = new Intent(Intent.ACTION_SEND);

        browser5Intent.setType("text/plain");
        browser5Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );
        browser5Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser5Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser5Intent);
    }
}
