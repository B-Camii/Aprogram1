package cami.cl.aprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActCinco extends AppCompatActivity {
Button btnSiguienteCinco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cinco);

        btnSiguienteCinco = (Button) findViewById(R.id.BtnSiguienteCinco);

        btnSiguienteCinco .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActCinco.this, activity_main_seis.class);
                startActivity(intent);
            }
        });
    }
}