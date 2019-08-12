package com.example.exercicioalertdialog;

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

    public void abrirDialog(View view){

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Exercício");
        dialog.setMessage("É assim que se faz um Alert Dialog?");
        dialog.setCancelable(false);

        dialog.setIcon(android.R.drawable.ic_delete);

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(),"Sim, é desse jeito, parabéns!",Toast.LENGTH_SHORT).show();

            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(),"Não, não é desse Jeito, aprenda Patife!!", Toast.LENGTH_SHORT).show();

            }
        });

        dialog.create();
        dialog.show();


    }

}
