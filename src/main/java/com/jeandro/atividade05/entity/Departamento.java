package com.jeandro.atividade05.entity;


import javax.persistence.*;


import lombok.*;


@ToString
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "Departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(name = "nome_Departamento")
    private String nomeFuncionario;

}