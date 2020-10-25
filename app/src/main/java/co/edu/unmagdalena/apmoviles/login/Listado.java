package co.edu.unmagdalena.apmoviles.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Listado extends AppCompatActivity {

    Button btn_filtrar;
    EditText filtrado;
    ListView lista_contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        btn_filtrar=findViewById(R.id.btn_filtrar);
        filtrado=findViewById(R.id.edt_filtrar);
        lista_contactos=findViewById(R.id.lista_contactos);

        btn_filtrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!filtrado.getText().toString().isEmpty()){
                    //ACA FILTRA LOS ELEMENTOS
                }
            }
        });

        

    }
}