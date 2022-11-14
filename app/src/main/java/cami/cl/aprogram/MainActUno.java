package cami.cl.aprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActUno extends AppCompatActivity {

    TextView tvTitulo, tvUsuario, tvContraseña;
    EditText etUsuario, etContraseña;
    Button btnSiguienteUno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_uno);

        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etContraseña=(EditText) findViewById(R.id.etContraseña);

        btnSiguienteUno=(Button) findViewById(R.id.btnSiguienteUno);
        btnSiguienteUno .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActUno.this, MainActDos.class);
                startActivity(intent);

            }
        });


    }


}
