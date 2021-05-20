package sg.edu.ep.c346.id20029318.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Step 1 initialise
    TextView txtChar;
    TextView txtInt;
    TextView txtDub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Step 2 declare
        txtChar = findViewById(R.id.txtPassDub);
        txtInt = findViewById(R.id.txtPassInt);
        txtDub = findViewById(R.id.txtPassDub);

        //Step 3 logic
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);
        txtInt.setText("Integer value received is: " + value);

        char cVal = intentReceived.getCharExtra("cVal", '0');
        txtChar.setText("Character value received is: " + cVal);

        double dVal = intentReceived.getIntExtra("dVal", 0);
        txtDub.setText("Double value received is: " + dVal);










    }
}