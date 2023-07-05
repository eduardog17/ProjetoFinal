package com.example.projetofinallll.Repository;

import com.example.projetofinallll.Entity.Circuito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CircuitoRepository extends JpaRepository<Circuito,Long> {
}
