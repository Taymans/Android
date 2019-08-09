package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btEnviar;
    private CheckBox cbBranco, cbVerde, cbVermelho;
    private TextView tvResultado;
    private TextInputEditText etNomeProduto;

    private RadioGroup rgEstoque;

    List<String> check = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btEnviar = findViewById(R.id.btEnviar);
        tvResultado = findViewById(R.id.tvResultado);
        etNomeProduto = findViewById(R.id.etNomeProduto);

        cbBranco = findViewById(R.id.cbBranco);
        cbVerde = findViewById(R.id.cbVerde);
        cbVermelho = findViewById(R.id.cbVermelho);

        rgEstoque = findViewById(R.id.rgEstoque);
        verificaRadionButton();
    }

    public void validaCheck(){

        check.clear();
        if(cbBranco.isChecked()){
            check.add(cbBranco.getText().toString());
        }
        if(cbVerde.isChecked()){
            check.add(cbVerde.getText().toString());
        }
        if(cbVermelho.isChecked()){
            check.add(cbVermelho.getText().toString());
        }



    }

    public void verificaRadionButton(){

        rgEstoque.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i== R.id.rbSim){
                    tvResultado.setText("Sim");
                }else{
                    tvResultado.setText("Não");
                }
            }
        });

    }


    public void enviarResultado(View view){

    validaCheck();



        if(check.isEmpty()){
            tvResultado.setText("SELECIONE UMA COR!!");
        }else {
            tvResultado.setText(check.toString());
        }

    }


}
