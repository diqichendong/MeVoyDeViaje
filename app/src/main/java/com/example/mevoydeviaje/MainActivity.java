package com.example.mevoydeviaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radGrp1, radGrp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radGrp1 = findViewById(R.id.radGrp1);
        radGrp2 = findViewById(R.id.radGrp2);
    }

    public void informacion(View v) {
        String destino = ((RadioButton) findViewById(radGrp1.getCheckedRadioButtonId())).getText().toString();
        String transporte = ((RadioButton) findViewById(radGrp2.getCheckedRadioButtonId())).getText().toString();

        Toast.makeText(this, "Me voy a " + destino + " en " + transporte, Toast.LENGTH_SHORT).show();
    }
}