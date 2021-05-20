package sg.edu.ep.c346.id20029318.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Step 1 initialise
    TextView tvAnswer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Step 2 declare
        tvAnswer = findViewById(R.id.txtPass);

        //Step 3 logic
        Intent intentReceived = getIntent();
        int iVal = intentReceived.getIntExtra("value", 0);
        char cVal = intentReceived.getCharExtra("value", '0');
        double dVal = intentReceived.getDoubleExtra("value", 0.0);
        if (iVal == 1) {
            tvAnswer.setText("Integer value received is: " + iVal);
        }

        if (cVal == 'a'){
            tvAnswer.setText("Character value received is: " + cVal);
        }

        if (dVal == 99.9) {
            tvAnswer.setText("Double value received is: " + dVal);
        }
    }
}