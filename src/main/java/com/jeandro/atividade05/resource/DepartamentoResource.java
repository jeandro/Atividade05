package com.jeandro.atividade05.resource;


import com.jeandro.atividade05.entity.Departamento;
import com.jeandro.atividade05.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departamentos")
public class DepartamentoResource {

    @Autowired
    private DepartamentoService service;


    @GetMapping(value ="all")
    public List<Departamento> findAll() {
           return service.buscarTodos();

    }

}
