package co.edu.unmagdalena.apmoviles.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Registro extends AppCompatActivity {
    private Spinner mSpiner;
    EditText nombre,telefono,email;
    Button agregar,listar,cerrar_sesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        mSpiner=findViewById(R.id.mspinner);
        agregar = findViewById(R.id.btn_agregar);
        cerrar_sesion=findViewById(R.id.btn_salir_sesion);
        listar = findViewById(R.id.btn_lista);
        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("casa");
        elementos.add("movil");
        elementos.add("trabajos");

        ArrayAdapter adp= new ArrayAdapter(Registro.this, android.R.layout.simple_spinner_dropdown_item,elementos);
        mSpiner.setAdapter(adp);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!nombre.getText().toString().isEmpty() && !telefono.getText().toString().isEmpty() && !email.getText().toString().isEmpty()){
                    //AGREGA A LA BASE DE DATOS
                }
            }
        });

        listar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Listado.class);
                startActivityForResult(intent, 0);
            }
        });

        cerrar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //ACA CIERRA SESION TENER EN CUENTA LAS SHARED PREFERENCES
            }
        });

        mSpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String elemento=(String) mSpiner.getAdapter().getItem(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}