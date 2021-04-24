package com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Contatos");
        List<String>  alunos = new ArrayList(
            Arrays.asList(
                    "Alex Barboasa",
                    "Amanda Freire",
                    "Val Cruz",
                    "Marcos Luciano",
                    "João Marcel","Gael Freire",
                    "Patricia Diogo",
                    "Trindade Costa",
                    "Day Freire",
                    "canudorio"));
        ListView listAlunos = findViewById(R.id.activity_main_lista_de_alunos);
        listAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, alunos
        ));

    }

}
