package com.jeandro.atividade05;

import com.jeandro.atividade05.entity.Departamento;
import com.jeandro.atividade05.entity.Funcionario;
import com.jeandro.atividade05.service.DepartamentoService;
import com.jeandro.atividade05.service.FuncionarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Atividade05Application {
    private static final Logger Log = LoggerFactory.getLogger(Atividade05Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Atividade05Application.class, args);

}

    @Bean
    public CommandLineRunner demo(DepartamentoService departamentoService,
                                  FuncionarioService funcionarioService) {
        return (arg) -> {
            Log.info("Listagem de todos os departamentos");
            Log.info("----------------------------------");
            for(Departamento departamento : departamentoService.buscarTodos())
                Log.info(departamento.toString());
            Log.info("");

            Log.info("Listagem de todos os funcionários");
            Log.info("----------------------------------");
            for(Funcionario funcionario : funcionarioService.buscarTodos())
                Log.info(funcionario.toString());
            Log.info("");

        };
    }
}