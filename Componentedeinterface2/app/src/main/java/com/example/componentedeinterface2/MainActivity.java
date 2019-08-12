package com.example.componentedeinterface2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleEstado;
    private Switch switchEstado;
    private CheckBox checkEstado;

    private TextView tvResultadoSwitch, tvResultadoToggle, tvResultadoCheck;

    List<String> check = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        toggleEstado = findViewById(R.id.toggleEstado);
        switchEstado = findViewById(R.id.switchEstado);
        checkEstado = findViewById(R.id.checEstado);

        tvResultadoSwitch = findViewById(R.id.tvResultadoSwitch);
        tvResultadoToggle = findViewById(R.id.tvResultadoToggle);
        tvResultadoCheck  = findViewById(R.id.tvResultadoCheck);



    }

    public void verificaSwitch(){
        if(switchEstado.isChecked()){
            tvResultadoSwitch.setText("Switch ligado!");
        }else{
            tvResultadoSwitch.setText("Switch Desligado");
        }

    }

    public void verificaToggle(){
        if(toggleEstado.isChecked()){
            tvResultadoToggle.setText("Toggle ligado!");
        }else{
            tvResultadoToggle.setText("Toggle Desligado");
        }

    }

    public void verificaCheck(){
        if(checkEstado.isChecked()){
            tvResultadoCheck.setText("Check Selecionado!");
        }else{
            tvResultadoCheck.setText("Check Não Selecionado");
        }

    }



    public void enviar(View view){
        verificaSwitch();
        verificaToggle();
        verificaCheck();


        }
    }