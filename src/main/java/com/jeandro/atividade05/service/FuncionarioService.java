package com.jeandro.atividade05.service;

import com.jeandro.atividade05.entity.Funcionario;
import com.jeandro.atividade05.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public void salvar(Funcionario funcionario){

        repository.save(funcionario);
    }

    public Optional<Funcionario> buscaPorId(Long id) {

        return repository.findById(id);
    }

    public List<Funcionario> buscarTodos() {
        return repository.findAll();
    }

}
