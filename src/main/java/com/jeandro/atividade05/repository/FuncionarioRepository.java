package com.jeandro.atividade05.repository;


import com.jeandro.atividade05.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
