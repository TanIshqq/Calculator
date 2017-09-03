package com.example.lenovo.augustcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    static int ctr =0;
    static int op = 0;
    static double ans =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView v1 = (TextView)findViewById(R.id.inputbox);

        Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String str = v1.getText().toString();
                str += 1;
                v1.setText(str);
            }
        });

        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = v1.getText().toString();
                str += 2;
                v1.setText(str);
            }
        });
        Button b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = v1.getText().toString();
                str += 3;
                v1.setText(str);
            }
        });
        Button b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = v1.getText().toString();
                str += 4;
                v1.setText(str);
            }
        });
        Button b5 = (Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = v1.getText().toString();
                str += 5;
                v1.setText(str);
            }
        });
        Button b6 = (Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = v1.getText().toString();
                str += 6;
                v1.setText(str);
            }
        });
        Button b7 = (Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = v1.getText().toString();
                str += 7;
                v1.setText(str);
            }
        });
        Button b8 = (Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = v1.getText().toString();
                str += 8;
                v1.setText(str);
            }
        });
        Button b9 = (Button)findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = v1.getText().toString();
                str += 9;
                v1.setText(str);
            }
        });
        Button b0 = (Button)findViewById(R.id.button0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = v1.getText().toString();
                str += 0;
                v1.setText(str);
            }
        });

        Button decimal = (Button)findViewById(R.id.decimal);
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String str = v1.getText().toString();
                //double ans = Double.parseDouble(str);
                str = str + ".";
                v1.setText(str);



            }
        });


        Button bCE = (Button)findViewById(R.id.clear);
        bCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v1.setText("");
                ctr = 0;
                op = 0;
                ans = 0;

            }
        });
        Button equal = (Button)findViewById(R.id.equals);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double small = Double.parseDouble(v1.getText().toString());
                if(ctr == 0)
                    ans = small;
                switch (op) {
                    case 1: ans += small; break;
                    case 2: ans -= small;break;
                    case 3: ans *= small;break;
                    case 4: ans /= small;break;
                    default: break;
                }
                v1.setText(ans + "");
                op=0;

            }
        });
        Button plus = (Button)findViewById(R.id.add);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double small = Double.parseDouble(v1.getText().toString());
                v1.setText("");
                if(ctr == 0)
                    ans = small;
                switch (op) {
                    case 1: ans += small; break;
                    case 2: ans -= small;break;
                    case 3: ans *= small;break;
                    case 4: ans /= small;break;
                    default: break;
                }
                op = 1;
                ctr++;
            }
        });
        Button minus = (Button)findViewById(R.id.subtract);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double small = Double.parseDouble(v1.getText().toString());
                v1.setText("");
                if(ctr == 0)
                    ans = small;
                switch (op) {
                    case 1: ans += small; break;
                    case 2: ans -= small;break;
                    case 3: ans *= small;break;
                    case 4: ans /= small;break;
                    default: break;
                }
                op = 2;
                ctr++;
            }
        });
        Button multiply1 = (Button)findViewById(R.id.multiply);
        multiply1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double small = Double.parseDouble(v1.getText().toString());
                v1.setText("");
                if(ctr == 0)
                    ans = small;
                switch (op) {
                    case 1: ans += small; break;
                    case 2: ans -= small;break;
                    case 3: ans *= small;break;
                    case 4: ans /= small;break;
                    default: break;
                }
                op = 3;
                ctr++;
            }
        });
        Button divide1 = (Button)findViewById(R.id.divide);
        divide1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double small = Double.parseDouble(v1.getText().toString());
                v1.setText("");
                if(ctr == 0)
                    ans = small;
                switch (op) {
                    case 1: ans += small; break;
                    case 2: ans -= small;break;
                    case 3: ans *= small;break;
                    case 4: ans /= small;break;
                    default: break;
                }
                op = 4;
                ctr++;
            }
        });

    }

}

