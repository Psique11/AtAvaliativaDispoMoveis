package br.com.paula.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActivity extends AppCompatActivity {
    Button exemplo5;
    int age;
    float alt;
    TextView nome,idade, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        nome = findViewById(R.id.tv_nome);
        idade = findViewById(R.id.tv_age);
        exemplo5 = findViewById(R.id.exemplo5);
        altura = findViewById(R.id.tv_alt);

        Intent intent = getIntent();
        String nomelocal = intent.getStringExtra("nome");
        age = Integer.parseInt(intent.getStringExtra("age"));
        alt = Float.parseFloat(intent.getStringExtra("alt"));

        nome.setText("Nome: "+ nomelocal);
        idade.setText("Idade: " + age);
        altura.setText("Altura: "+ alt);

        Toast.makeText(getApplicationContext(), "TAREFA COMPLETA!", Toast.LENGTH_LONG).show();

        exemplo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}