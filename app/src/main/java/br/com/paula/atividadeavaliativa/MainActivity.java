package br.com.paula.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText exemplo1, exemplo2, altura;
    private ProgressBar exemplo3;
    private Button exemplo4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exemplo1 = findViewById(R.id.edt_nome);
        exemplo2 = findViewById(R.id.edt_age);
        exemplo3 = findViewById(R.id.pb_carr);
        exemplo4 = findViewById(R.id.btn_reg);
        altura = findViewById(R.id.edt_alt);

        exemplo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exemplo3.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        exemplo3.setVisibility(View.GONE);

                        Intent intencao = new Intent(MainActivity.this, SegundaActivity.class);
                        intencao.putExtra("nome", exemplo1.getText().toString());
                        intencao.putExtra("age", exemplo2.getText().toString());
                        intencao.putExtra("alt", altura.getText().toString());
                        startActivity(intencao);
                    }
                }, 3000);
            }
        });

    }
}