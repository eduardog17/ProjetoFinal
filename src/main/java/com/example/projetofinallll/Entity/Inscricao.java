package com.example.projetofinallll.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inscricao {
    @Id
    private long id;
    private  String valorIncricao;
    @JsonIgnore
    @ManyToOne
    private Maratonista maratonista;
    @ManyToOne
    private Circuito circuito;
}
