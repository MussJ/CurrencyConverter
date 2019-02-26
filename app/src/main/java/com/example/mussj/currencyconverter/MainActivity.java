package com.example.mussj.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro,pound,usd,dinar,btc,ruble,aus,can,yen;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euro=findViewById(R.id.euro);
        pound=findViewById(R.id.pound);
        usd=findViewById(R.id.dollar);
        dinar=findViewById(R.id.dinar);
        btc=findViewById(R.id.bitcoin);
        ruble=findViewById(R.id.ruble);
        aus=findViewById(R.id.aus);
        can=findViewById(R.id.can);
        yen=findViewById(R.id.yen);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        euro.setOnClickListener(new View.OnClickListener() {          //TODO do the other buttons
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.012;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(" "+numberFormat.format(k));
                }
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {          //TODO do the other buttons
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.011;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(" "+numberFormat.format(k));
                }
            }
        });
        usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.014;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(" "+numberFormat.format(k));
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*1.54;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(" "+numberFormat.format(k));
                }
            }
        });
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.0043;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(" "+numberFormat.format(k));
                }
            }
        });
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.0000040;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(" "+numberFormat.format(k));
                }
            }
        });
        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.93;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(" "+numberFormat.format(k));
                }
            }
        });

        aus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.020;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(" "+numberFormat.format(k));
                }
            }
        });
        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.019;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(" "+numberFormat.format(k));
                }
            }
        });
    }
}
