package com.example.thando.buttonclickapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // Variables to reference the objects
    // We used to create the layout.
    private EditText userInput;
    private TextView textView;
    private Button button;
    private int numTimesClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_click_activity);

        userInput = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("");

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numTimesClicked = numTimesClicked + 1;
                String result = "\nThe button got tapped " + numTimesClicked + " time";
                textView.append(result);
            }
        };

        // This is to initialize our onClickLister to be attached to the OnClick listener.
        // This will handle the event when it happens.
        button.setOnClickListener(ourOnClickListener);
    }
}
