package com.example.lab1gui;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int ch=1;
    int c=1;
    float font= 30;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t= findViewById(R.id.textView);
        Button btn1= findViewById(R.id.btn1);
        btn1.setOnClickListener(view -> {
            t.setTextSize(font);
            font = font + 5;
            if(font == 50)
                font= 30;
        });
        Button btn2= findViewById(R.id.btn2);
        btn2.setOnClickListener(view -> {
            switch (ch)
            {
                case 1:
                    t.setTextColor(Color.RED);
                    break;
                case 2:
                    t.setTextColor(Color.GREEN);
                    //t.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                   // t.setTypeface(Typeface.create("cursive",Typeface.NORMAL));
                    break;
                case 3:
                    t.setTextColor(Color.BLUE);
                    break;
                case 4:
                    t.setTextColor(Color.CYAN);
                    break;
                case 5:
                    t.setTextColor(Color.YELLOW);
                    break;
                case 6:
                    t.setTextColor(Color.MAGENTA);
                    break;

            }
            ch++;
            if(ch==7)
                ch=1;
                //t.setTextColor(Color.GRAY);
        });
        Button btn3= findViewById(R.id.btn3);
        btn3.setOnClickListener(view -> {
         switch(c)
         {
             case 1:
                 t.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                 break;
             case 2:
                 t.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                 break;
             case 3:
                 t.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
                 break;
             case 4:
                 t.setTypeface(Typeface.create("Arial",Typeface.NORMAL));
                 break;
         }
         c++;
         if(c==5)
             c=1;
             //t.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        });
    }
}