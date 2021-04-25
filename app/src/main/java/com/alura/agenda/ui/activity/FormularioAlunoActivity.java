package com.alura.agenda.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.alura.agenda.R;
import com.alura.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        final EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final TextView campoEmail = findViewById(R.id.activity_formulario_aluno_emael);

        Button bottonSalvar = findViewById(R.id.activity_formulario_aluno_botton);
        bottonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();

                Aluno alunoCriado = new Aluno(nome,telefone,email);
                Toast.makeText(FormularioAlunoActivity.this,
                        alunoCriado.getNome() + " - "
                                + alunoCriado.getTelefone()
                                + " - " + alunoCriado.getEmail(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}