package com.oscarcelis.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


//Desarrollado por Oscar Celis
public class MainActivity extends AppCompatActivity {

    private Button btnToast;
    private EditText edtColorFavorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btnToast);
        edtColorFavorito = findViewById(R.id.edtColorFavorito);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastApp();
            }
        });
    }

    private void toastApp() {
        //Toast.makeText(this, "Mi color favorito es rojo", Toast.LENGTH_SHORT).show();

        Toast toast = Toast.makeText(getApplicationContext(),
                "", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER | Gravity.CENTER_VERTICAL,0,0);
        toast.setText("Tu color favorito es el " + edtColorFavorito.getText());
        toast.show();

        edtColorFavorito.setText("");
    }
}
