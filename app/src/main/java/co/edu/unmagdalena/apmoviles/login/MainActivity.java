package co.edu.unmagdalena.apmoviles.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    EditText usuario,contraseña;
    Button btn_ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        contraseña  = findViewById(R.id.contraseña);
        btn_ingresar = findViewById(R.id.btn_ingresar);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!usuario.getText().toString().isEmpty() && !contraseña.getText().toString().isEmpty()){
                    Intent intent = new Intent (v.getContext(), Registro.class);
                    startActivityForResult(intent, 0);
                }

            }
        });

    }
}