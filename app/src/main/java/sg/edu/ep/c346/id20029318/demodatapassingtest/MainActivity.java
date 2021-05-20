package sg.edu.ep.c346.id20029318.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    Button btnPassInteger;
    Button btnPassChar;
    TextView txtPassDub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        btnPassInteger = findViewById(R.id.butPassInt);
        btnPassChar = findViewById(R.id.butPassChar);
        txtPassDub = findViewById(R.id.txtPassDub);

        //Event handling Step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iInt = new Intent(MainActivity.this, SecondActivity.class);
                iInt.putExtra("value", 1);
                startActivity(iInt);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iChar = new Intent(MainActivity.this, SecondActivity.class);
                iChar.putExtra("cVal", 'a');
                startActivity(iChar);
            }
        });

        txtPassDub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("dVal", 99.9);
                startActivity(intent);
            }
        });


    }
}