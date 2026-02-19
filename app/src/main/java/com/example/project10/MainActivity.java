package com.example.project10;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    int num = 0;
    int sign = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void minus(View view) {
        num = Integer.parseInt(et1.getText().toString());
        if (sign == 1){

        }
        else if(sign == 2){

        }
        else if (sign == 3){

        }
        sign = 1;
    }
    public void plus(View view) {
        num = Integer.parseInt(et1.getText().toString());
    }
    public void times(View view) {
        num = Integer.parseInt(et1.getText().toString());
    }
    public void equal(View view) {
        num = Integer.parseInt(et1.getText().toString());
    }
    public void clear(View view) {
        num = Integer.parseInt(et1.getText().toString());
    }
}