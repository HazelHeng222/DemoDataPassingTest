package sg.edu.ep.c346.id20029318.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

   //Step 1 initialise
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Step 2 declare
        tvAnswer = findViewById(R.id.textView);

        //Step 3 logic
        Intent intentReceived = getIntent();
        char cValue = intentReceived.getCharExtra("value", '0');
        tvAnswer.setText("Character value received is: " + cValue);


    }
}