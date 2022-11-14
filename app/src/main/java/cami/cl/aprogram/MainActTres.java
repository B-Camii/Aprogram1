package cami.cl.aprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActTres extends AppCompatActivity {

    Button btnSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tres);

        btnSiguiente = (Button) findViewById(R.id.btnSiguienteUno);

        btnSiguiente .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActTres.this, MainActCuatro.class);
                startActivity(intent);

            }
        });
    }

}