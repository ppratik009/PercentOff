package com.example.pprat.PercentOff;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    TextView textView;
    EditText percentTxt;
    EditText numberTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.textView);
        percentTxt = (EditText) findViewById(R.id.percentTxt);
        numberTxt = (EditText) findViewById(R.id.numberTxt);

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                float percentage = Float.parseFloat(percentTxt.getText().toString());
                float decimal = percentage / 100;
                float total = decimal * Float.parseFloat(numberTxt.getText().toString());
                textView.setText(Float.toString(total));
            }
        }
        );
    }


}
