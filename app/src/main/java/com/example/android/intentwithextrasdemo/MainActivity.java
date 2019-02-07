package com.example.android.intentwithextrasdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int numOfDays = 0;
    private static final int REQUEST_CODE_WAS_RESTARTED = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button increaseButton = (Button) findViewById(R.id.increaseButton);
        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateNumOfDays(numOfDays + 1);

            }
        });
        Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = NumOfDaysActivity.newIntent(MainActivity.this, numOfDays);
                startActivityForResult(i, REQUEST_CODE_WAS_RESTARTED);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode != Activity.RESULT_OK) {
            return;
        }
        //Make sure the result is from the DisplayScoreActivity
        if (requestCode == REQUEST_CODE_WAS_RESTARTED) {
            if (data != null) {
                boolean wasRestarted = NumOfDaysActivity.wasRestarted(data);
                if (wasRestarted) {
                    updateNumOfDays(0);
                    Toast.makeText(this, R.string.restarted, Toast.LENGTH_LONG).show();
                }
            }
        }
    }

    private void updateNumOfDays(int newNum) {
        numOfDays = newNum;
        TextView numberTextView = (TextView) findViewById(R.id.numberTextView);
        numberTextView.setText(Integer.toString(numOfDays));

    }
}

