package com.jeandro.atividade05.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Currency;

@ToString
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "Funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome_Funcionario")
    private String nomeFuncionario;
    @Column(name = "dependentes_Funcionario")
    private Integer dependentesFuncionario;
    @Column(name = "salario_Funcionario")
    private Currency salarioFuncionario;
    @Column(name = "cargo_Funcionario")
    private String cargoFuncionario;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "id",referencedColumnName = "id")
    private Departamento departamento;


}
