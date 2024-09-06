package com.example.parcial1_cristian_brito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edt_usuario, edt_contraseña;
    Button btn_ingresar;
    String UsuarioINGRESADO = "uac123";
    String ContraseñaINGRESADO = "12345678";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edt_usuario = findViewById(R.id.edt_usuario);
        edt_contraseña = findViewById(R.id.edt_contraseña);
        btn_ingresar = findViewById(R.id.btn_ingresar);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Usuario = edt_usuario.getText().toString();
                String Contraseña = edt_contraseña.getText().toString();

                if ((Usuario.equals("")) && (Contraseña.equals(""))) {
                    Toast.makeText(MainActivity.this, "Por favor llenar los campos", Toast.LENGTH_LONG).show();

                } else if ((Usuario.equals(UsuarioINGRESADO)) && (Contraseña.equals(ContraseñaINGRESADO))) {
                    Intent Respuestas = new Intent(MainActivity.this, Respuestas.class);
                    startActivity(Respuestas);
                } else {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña invalidos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}