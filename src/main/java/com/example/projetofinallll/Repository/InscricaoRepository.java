package com.example.projetofinallll.Repository;

import com.example.projetofinallll.Entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InscricaoRepository extends JpaRepository<Inscricao,Long> {
}
