package com.example.android.intentwithextrasdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NumOfDaysActivity extends AppCompatActivity {

    private static final String EXTRA_NUM_OF_DAYS =
            "com.example.android.intentswithextrasdemo.score";
    private static final String EXTRA_WAS_RESTARTED =
            "com.example.android.intentswithextrasdemo.scorediscredited";
    private TextView numberTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_of_days);

        int finalNum = getIntent().getIntExtra(EXTRA_NUM_OF_DAYS, 0);
        numberTextView = (TextView) findViewById(R.id.numberTextView);
        numberTextView.setText(Integer.toString(finalNum));

        Button startOverButton = (Button) findViewById(R.id.startOverButton);
        startOverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberTextView.setText("");
                setWasRestartedResult();
            }
        });
    }

    private void setWasRestartedResult() {
        Intent dataIntentToSendBack = new Intent();
        dataIntentToSendBack.putExtra(EXTRA_WAS_RESTARTED, true);
        setResult(RESULT_OK, dataIntentToSendBack);
    }

    public static boolean wasRestarted(Intent result) {
        return result.getBooleanExtra(EXTRA_WAS_RESTARTED, false);
    }

    public static Intent newIntent(Context packageContext, int numOfDays) {
        Intent i = new Intent(packageContext, NumOfDaysActivity.class);
        i.putExtra(EXTRA_NUM_OF_DAYS, numOfDays);
        return i;
    }


}

