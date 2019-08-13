package com.example.listviewprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;

    private String[] itens = {
            "Angra dos Reis", "Caldas Novas",
            "Campos do Jordão", "Mandaguari",
            "Jandaia do Sul" , "Porto Seguro",
            "Cancún", "Aruba", "Santiago", "Tiradentes",
            "Buenos Aires", "Budapeste", "Pragra", "Apucarana"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Criar adaptador para a Lista

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens

        );

        //Adcionar adaptador para a lista

        listLocais.setAdapter(adaptador);



    }
}
