package com.alura.agenda.dao;

import com.alura.agenda.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDao {
    private final static List<Aluno> alunos = new ArrayList<>();
    public void Salva(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
