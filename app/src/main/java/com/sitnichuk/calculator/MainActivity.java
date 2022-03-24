package com.sitnichuk.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.input);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btOne:
                        input.setText(input.getText().toString().concat(getResources().getString(R.string.key1)));
                        break;
                    case R.id.btTwo:
                        input.setText(input.getText().toString().concat(getResources().getString(R.string.key2)));
                        break;
                    case R.id.btThree:
                        input.setText(input.getText().toString().concat(getResources().getString(R.string.key3)));
                        break;
                    case R.id.btFour:
                        input.setText(input.getText().toString().concat(getResources().getString(R.string.key4)));
                        break;
                    case R.id.btFive:
                        input.setText(input.getText().toString().concat(getResources().getString(R.string.key5)));
                        break;
                    case R.id.btSix:
                        input.setText(input.getText().toString().concat(getResources().getString(R.string.key6)));
                        break;
                    case R.id.btSeven:
                        input.setText(input.getText().toString().concat(getResources().getString(R.string.key7)));
                        break;
                    case R.id.btEight:
                        input.setText(input.getText().toString().concat(getResources().getString(R.string.key8)));
                        break;
                    case R.id.btNine:
                        input.setText(input.getText().toString().concat(getResources().getString(R.string.key9)));
                        break;
                    case R.id.btZero:
                        input.setText(input.getText().toString().concat(getResources().getString(R.string.key0)));
                        break;
                }
            }
        };

        findViewById(R.id.btOne).setOnClickListener(clickListener);
        findViewById(R.id.btTwo).setOnClickListener(clickListener);
        findViewById(R.id.btThree).setOnClickListener(clickListener);
        findViewById(R.id.btFour).setOnClickListener(clickListener);
        findViewById(R.id.btFive).setOnClickListener(clickListener);
        findViewById(R.id.btSix).setOnClickListener(clickListener);
        findViewById(R.id.btSeven).setOnClickListener(clickListener);
        findViewById(R.id.btEight).setOnClickListener(clickListener);
        findViewById(R.id.btNine).setOnClickListener(clickListener);
        findViewById(R.id.btZero).setOnClickListener(clickListener);
    }
}