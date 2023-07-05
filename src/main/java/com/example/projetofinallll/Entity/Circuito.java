package com.example.projetofinallll.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Circuito {

    @Id
    private long id;
    String distancia;
    @JsonIgnore
    @OneToMany (mappedBy = "circuito")
    private List<Inscricao> inscricao;

    @ManyToOne Maratona maratona;

}
