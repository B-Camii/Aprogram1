package cami.cl.aprogram;

import static cami.cl.aprogram.R.id.btnValidarseis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;

public class activity_main_seis extends AppCompatActivity {
    TextView tvPreguntaDos;
    RadioGroup RGAlternativas;
    RadioButton RBAlt1;
    RadioButton RBAlt2;
    RadioButton RBAlt3;
    Button btnValidarSeis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_seis);

        tvPreguntaDos = (TextView) findViewById(R.id.tvPreguntaDos);
        RGAlternativas = (RadioGroup) findViewById(R.id.RGalternativas);
        RBAlt1 = (RadioButton) findViewById(R.id.RBAlt1);
        RBAlt2 = (RadioButton) findViewById(R.id.RBAlt2);
        RBAlt3 = (RadioButton) findViewById(R.id.RBAlt3);
        btnValidarSeis = (Button) findViewById(btnValidarseis);


    }

    public void onclick(View view) {
        if (view.getId() == btnValidarseis) {
            Validar();
        }
    }

    public void Validar() {
        String cad = "Seleccionado: \n";

        if (RBAlt1.isChecked() == true) {
            cad += "opcion 1, INCORRECTO :(\n";
        }

        if (RBAlt2.isChecked()) {
            cad += "Opcion 2, INCORRECTO :(\n";
        }

        if (RBAlt3.isChecked()) {
            cad += " Opcion 3, ¡¡CORRECTO!! :) \n";

            btnValidarSeis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(activity_main_seis.this, MyMapp.class);
                    startActivity(intent);
                }
            });

        }
        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();
    }
}