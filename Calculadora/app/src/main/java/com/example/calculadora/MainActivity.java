package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText itValorConta;
    private SeekBar seekBar;

    private TextView tvPorcentagem, tvValorGorjeta, tvValorTotal;

    double valorDaConta, valorGorjeta, valorTotal;
    int valorPorcentagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itValorConta = findViewById(R.id.itValorConta);
        seekBar = findViewById(R.id.seekBar);

        tvPorcentagem = findViewById(R.id.tvPorcentagem);
        tvValorGorjeta = findViewById(R.id.tvValorGorjeta);
        tvValorTotal = findViewById(R.id.tvValorTotal);



            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                tvPorcentagem.setText(seekBar.getProgress()+"%");
                valorPorcentagem = seekBar.getProgress();
                valorDaConta = Double.parseDouble(itValorConta.getText().toString());

                valorGorjeta = (valorDaConta* valorPorcentagem)/100;

                tvValorGorjeta.setText("R$"+valorGorjeta);

                valorTotal = valorDaConta+valorGorjeta;

                tvValorTotal.setText("R$"+valorTotal);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {




            }
        });



    }

    public void disparaFuncao(){


    }




}
