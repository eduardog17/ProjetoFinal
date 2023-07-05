package com.example.projetofinallll.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maratona {
    @Id
    private long id;
    private String nome;

    @OneToMany(mappedBy = "maratona")
    private List<Circuito> circuito;
}
