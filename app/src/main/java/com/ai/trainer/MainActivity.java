package com.ai.trainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ClickFunction(View view){

        EditText traineeName = (EditText) findViewById(R.id.userName);

        EditText passwordText = (EditText) findViewById(R.id.passwordText);

        Log.i("Values", traineeName.getText().toString());
        Log.i("value", passwordText.getText().toString());
        String popupMsg = "Hi " + traineeName.getText().toString();
        Toast.makeText(this, popupMsg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}