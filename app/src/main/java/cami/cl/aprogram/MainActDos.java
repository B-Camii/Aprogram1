package cami.cl.aprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActDos extends AppCompatActivity {

    TextView  tvTituloDos, tvIntroduccion;
    Button btnSiguienteDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dos);

        tvTituloDos = (TextView) findViewById(R.id.tvTituloDos);

        btnSiguienteDos=(Button) findViewById(R.id.btnSiguientedos);

        btnSiguienteDos .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActDos.this, MainActTres.class);
                startActivity(intent);

            }
        });

    }




}