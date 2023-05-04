package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText prefText = findViewById(R.id.editPreference);


        // Get a reference to the shared preference
        final SharedPreferences myPreferenceRef = getSharedPreferences("MyPreferenceName", MODE_PRIVATE);
        final SharedPreferences.Editor myPreferenceEditor = myPreferenceRef.edit();

        Button saveButton = findViewById(R.id.button2);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = prefText.getText().toString();
                myPreferenceEditor.putString("MyPreferenceName", text);
                myPreferenceEditor.apply();
            }
        });

    }
}