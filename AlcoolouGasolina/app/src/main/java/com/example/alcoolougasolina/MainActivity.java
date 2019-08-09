package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText tiPrecoAlcool, tiPrecoGasolina;
    private TextView tvResultado;
    private Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tiPrecoAlcool = findViewById(R.id.tiPrecoAlcool);
        tiPrecoGasolina = findViewById(R.id.tiPrecoGasolina);

        tvResultado = findViewById(R.id.tvResultado);
        btCalcular = findViewById(R.id.btCalcular);
    }

    public void calcularPreco(View view){

        double precoAlcool, precoGasolina, resultado;


    precoAlcool = Double.parseDouble(tiPrecoAlcool.getText().toString());
    precoGasolina = Double.parseDouble(tiPrecoGasolina.getText().toString());

    resultado = precoAlcool/precoGasolina;

    if(resultado<0.7){

        tvResultado.setText("Abasteça com Alcool");
    }else {

        tvResultado.setText("Abasteça com Gasolina!");
    }


    }


}
