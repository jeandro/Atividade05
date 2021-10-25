package com.jeandro.atividade05.service;

import com.jeandro.atividade05.entity.Departamento;
import com.jeandro.atividade05.repository.DepartamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository repository;

    public void salvar(Departamento departamento){

        repository.save(departamento);
    }
    public Optional<Departamento> buscaPorId(Long id) {

        return repository.findById(id);
    }

    public List<Departamento> buscarTodos() {

        return repository.findAll();
    }
}
