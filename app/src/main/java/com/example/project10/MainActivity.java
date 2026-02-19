package com.example.project10;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    double num;
    double num2;
    int sign = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.text1);
    }
    public void minus(View view) {
        num = Integer.parseInt(et1.getText().toString());
        if (sign == 1){
            num2 = num2 - num;
        }
        else if(sign == 2){
            num2 = num2 +num;
        }
        else if (sign == 3) {
            num2 = num2 * num;
        }
        else if (sign == 4) {
            num2 = num2 / num;
        }
        else{
            num2 = num;
        }
        sign = 1;
        et1.setText("");
        et1.setHint(String.valueOf(num2));
    }
    public void plus(View view) {
        num = Integer.parseInt(et1.getText().toString());
        if (sign == 1){
            num2 = num2 - num;
        }
        else if(sign == 2){
            num2 = num2 +num;
        }
        else if (sign == 3) {
            num2 = num2 * num;
        }
        else if (sign == 4) {
            num2 = num2 / num;
        }
        else{
            num2 = num;
        }
        sign = 2;
        et1.setText("");
        et1.setHint(String.valueOf(num2));
    }
    public void times(View view) {
        num = Integer.parseInt(et1.getText().toString());
        if (sign == 1){
            num2 = num2 - num;
        }
        else if(sign == 2){
            num2 = num2 +num;
        }
        else if (sign == 3) {
            num2 = num2 * num;
        }
        else if (sign == 4) {
            num2 = num2 / num;
        }
        else{
            num2 = num;
        }
        sign = 3;
        et1.setText("");
        et1.setHint(String.valueOf(num2));
    }
    public void div(View view) {
        num = Integer.parseInt(et1.getText().toString());
        if (sign == 1){
            num2 = num2 - num;
        }
        else if(sign == 2){
            num2 = num2 +num;
        }
        else if (sign == 3) {
            num2 = num2 * num;
        }
        else if (sign == 4) {
            num2 = num2 / num;
        }
        else{
            num2 = num;
        }
        sign = 4;
        et1.setText("");
        et1.setHint(String.valueOf(num2));
    }
    public void equal(View view) {
        num = Integer.parseInt(et1.getText().toString());
        if (sign == 1){
            num2 = num2 - num;
        }
        else if(sign == 2){
            num2 = num2 +num;
        }
        else if (sign == 3) {
            num2 = num2 * num;
        }
        else if (sign == 4) {
            num2 = num2 / num;
        }
        else{
            num2 = num;
        }
        et1.setHint(String.valueOf(num2));
        et1.setText("");
        sign = 0;
    }

    public void clear(View view) {
        et1.setText("");
        sign = 0;
        num = 0;
        num2= 0;
    }
}