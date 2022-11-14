package cami.cl.prueba2208;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNombreJ, etApellido;
    Button btnAgregar;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //a la variable creada se le añade el valor del view, del mismo tipo.
        etNombreJ = (EditText) findViewById(R.id.etNombre);
        etApellido=(EditText) findViewById(R.id.etApellido);
        btnAgregar=(Button) findViewById(R.id.btnAgregar);
        tvResultado=(TextView) findViewById(R.id.tvResultado);

        //capturar accion el boton agregar  (new View.onclick / autocompletar

        btnAgregar .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) //accion unir nombre y apellido y print en resultado
            {
                tvResultado.setText(etNombreJ.getText()+" "+etApellido.getText());
            }
        });





    }
}