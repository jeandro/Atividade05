package com.jeandro.atividade05.repository;


import com.jeandro.atividade05.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
