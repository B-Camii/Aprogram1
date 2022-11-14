package cami.cl.aprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActCuatro extends AppCompatActivity {

    RadioButton Rbtn1,RBtn2,RBtn3;
    Button btnValidar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cuatro);

        Rbtn1 = (RadioButton) findViewById(R.id.RBtn1);
        RBtn2 = (RadioButton) findViewById(R.id.RBtn2);
        RBtn3 = (RadioButton) findViewById(R.id.RBtn3);
        btnValidar = (Button) findViewById(R.id.btnValidarseis);

    }

    public void onclick(View view)
    {
        if (view.getId()==R.id.btnValidarseis)
        {
            Validar();
        }
    }

    private void Validar() {
        String cad = "Seleccionado: \n";

        if (Rbtn1.isChecked() == true) {
            cad += "opcion 1, INCORRECTO :(\n";
        }

        if (RBtn2.isChecked()) {
            cad += "Opcion 2, INCORRECTO :(\n";
        }

        if (RBtn3.isChecked()) {
            cad += " Opcion 3, ¡¡CORRECTO!! :) \n";

            btnValidar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActCuatro.this, MainActCinco.class);
                    startActivity(intent);
                }
            });

        }
        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();


    }
}
