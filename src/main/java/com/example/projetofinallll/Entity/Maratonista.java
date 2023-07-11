package com.example.projetofinallll.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Maratonista {
    @Id
        private long id;
    private String rg;
    private String nome;
    private String Sobrenome;
    private Integer idade;
    private String celular;
    private String numeroEmergencia;
    private String grupoSanguineo;
    private Long valorIncricao;




}
