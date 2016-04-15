package com.marcoslopez7.interactivestory.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.marcoslopez7.interactivestory.R;

public class MainActivity extends AppCompatActivity {

    private Button startButton;
    private EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.start_button);
        nameText = (EditText) findViewById(R.id.name);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameText.getText().toString();

                if(name != null && !name.isEmpty() && !name.equals("null")) {
                    startStory(name);
                } else {
                    Toast.makeText(getApplicationContext(), "Por favor inserte un nombre",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void startStory(String name){
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }
}
