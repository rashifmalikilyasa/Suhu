package com.example.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt_celcius, edt_fahrenheit, edt_reamur, edt_kelvin;

    protected float celcius, fahrenheit, reamur, kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_celcius = (EditText) findViewById(R.id.edt_celcius);
        edt_fahrenheit = (EditText) findViewById(R.id.edt_fahrenheit);
        edt_reamur = (EditText) findViewById(R.id.edt_reamur);
        edt_kelvin = (EditText) findViewById(R.id.edt_kelvin);

        Button button = (Button) findViewById(R.id.btn_hasil);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                celcius = Float.parseFloat(edt_celcius.getText().toString());

                fahrenheit = ((celcius * 9 ) / 5 ) + 32;
                reamur = ((celcius * 4) / 5);
                kelvin = celcius + 273;

                edt_fahrenheit.setText(Float.toString(fahrenheit));
                edt_reamur.setText(Float.toString(reamur));
                edt_kelvin.setText(Float.toString(kelvin));
            }
        });
    }
}
