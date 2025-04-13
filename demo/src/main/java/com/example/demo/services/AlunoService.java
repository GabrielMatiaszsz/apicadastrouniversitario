package com.example.demo.services;

import com.example.demo.exceptions.ObjetoAlunoNuloException;
import com.example.demo.models.AlunoModel;
import com.example.demo.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<AlunoModel> findAll() {
        return repository.findAll();
    }

    public Optional<AlunoModel> findById(String id) {
        return repository.findById(id);
    }

    public AlunoModel save(AlunoModel aluno){
        if (aluno == null || aluno.getName() == null || aluno.getName().equals("") ||
                aluno.getTelephone() == null || aluno.getTelephone().equals("") ||
                aluno.getEmail() == null || aluno.getEmail().equals("") ||
                aluno.getAddress() == null || aluno.getAddress().equals("")) {
            throw new ObjetoAlunoNuloException("Objeto aluno não pode ser nulo ou conter campos obrigatórios vazios.");
        }
        repository.save(aluno);
        return aluno;
    }


    public void deleteById(String id){
        repository.deleteById(id);
    }
}
