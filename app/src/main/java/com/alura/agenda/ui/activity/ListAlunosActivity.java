package com.alura.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alura.agenda.R;

import com.alura.agenda.dao.AlunoDao;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListAlunosActivity extends AppCompatActivity {
    public static final String TITULO_APPBAR = "Lista de Contatos";
    private  final AlunoDao dao = new AlunoDao();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_alunos);
        setTitle(TITULO_APPBAR);
        configuraFabNovoAluno();
    }

    private void configuraFabNovoAluno() {
        FloatingActionButton botaoNovoAluno = findViewById(R.id.activity_list_alunos_fab_novo_aluno);
        botaoNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abreFormularioAlunoActivity();
            }
        });
    }

    private void abreFormularioAlunoActivity() {
        startActivity(new Intent(this, FormularioAlunoActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        configuraList();
    }

    private void configuraList() {
        ListView listAlunos = findViewById(R.id.activity_list_alunos_listview);
        listAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.todos()));
    }
}
