package com.example.hellojava;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView chengingText;
    private Button textButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chengingText = findViewById(R.id.chengingText);
        textButton = findViewById(R.id.textButton);

        String firebase = "Hello firebase";

//        textButton.setOnClickListener(new View.OnClickListener() {
//
//            private final String new_text = "Hello java!";
//            @Override
//            public void onClick(View view) {
//                chengingText.setText(new_text);
//            }
//        });

    }

    public void setHelloJavaText(View view) {
        chengingText.setText("text");
    }
}