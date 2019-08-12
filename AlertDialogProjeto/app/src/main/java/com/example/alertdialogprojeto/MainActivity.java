package com.example.alertdialogprojeto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlerta(View view){

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Titulo");
        dialog.setMessage("Aqui fica a Mensagem");

        //configurar um Cancelamento
        dialog.setCancelable(false);

        //Configurar um icon
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);


        //Configurar ações para Sim ou Não

        dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(),"Sim foi pressionado", Toast.LENGTH_SHORT).show();

            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(), "Não foi pressionado", Toast.LENGTH_SHORT).show();

            }
        });

        dialog.create();
        dialog.show();

    }


}
