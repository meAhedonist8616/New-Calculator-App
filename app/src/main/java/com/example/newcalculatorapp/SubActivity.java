package com.example.newcalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {

    TextView tv1;
    EditText et1,et2;
    Button b1;
    String getNum1,getNum2,diff;
    int num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
        et1=(EditText)findViewById(R.id.nsub1);
        et2=(EditText)findViewById(R.id.nsub2);
        b1=(Button) findViewById(R.id.sub2but);
        tv1=(TextView)findViewById(R.id.resdisp2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                result=num1-num2;
                diff=String.valueOf(result);
                Toast.makeText(getApplicationContext(),diff,Toast.LENGTH_SHORT).show();
                tv1.setText(diff);
            }
        });
    }
}