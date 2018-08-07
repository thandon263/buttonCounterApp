package com.example.thando.buttonclickapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // Variables to reference the objects
    // We used to create the layout.
    private EditText userInput;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_click_activity);

        userInput = (EditText) findViewById(R.id.editText);
        userInput.setText("");
        // Local variable for the onCreate method
        Button button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = userInput.getText().toString();
                result = result + "\n";
                textView.append(result);
                // Clear text after the click is handled.
                userInput.setText("");
            }
        };
        // This is to initialize our onClickLister to be attached to the OnClick listener.
        // This will handle the event when it happens.
        button.setOnClickListener(ourOnClickListener);
    }
}
