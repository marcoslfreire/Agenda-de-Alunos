package com.alura.agenda.ui.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alura.agenda.R;
import com.alura.agenda.dao.AlunoDao;
import com.alura.agenda.model.Aluno;

import org.jetbrains.annotations.NotNull;

public class FormularioAlunoActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Novo Usuário";
    private EditText campoNome;
    private EditText campoTelefone;
    private TextView campoEmail;
    private final AlunoDao dao = new AlunoDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        setTitle(TITULO_APPBAR + "");
        inicializacaoDosCampos();

        configuraBotaoSalva();
    }

    private void configuraBotaoSalva() {
        Button bottonSalvar = findViewById(R.id.activity_formulario_aluno_botton_salva);
        bottonSalvar.setOnClickListener((View) -> {
            Aluno alunoCriado = criaAluno();
            salva(alunoCriado);

        });
    }

    private void inicializacaoDosCampos() {
        campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        campoEmail = findViewById(R.id.activity_formulario_aluno_emael);
    }

    private void salva(Aluno aluno) {
        dao.Salva(aluno);
        finish();
    }

    @NotNull
    private Aluno criaAluno() {
        String nome = campoNome.getText().toString();
        String telefone = campoTelefone.getText().toString();
        String email = campoEmail.getText().toString();
        return new Aluno(nome, telefone, email);
    }
}