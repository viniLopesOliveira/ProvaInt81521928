package com.example.arqdsis.provaint81521928;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
/**
 * Vinicius Lopes de Oliveira
 * Ra:81521928.
 */
public class MainActivity extends AppCompatActivity {
Activity atividade;
    Times [] times;
    ArrayList<String> nomes;
    public static final String CHAVE = "teste";
    private String continente="todos";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.lista_times);
        TimesAdapter adapter = new TimesAdapter(times, this);
        listView.setAdapter(adapter);

    }
}
