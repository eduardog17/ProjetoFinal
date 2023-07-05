package com.example.projetofinallll.Repository;

import com.example.projetofinallll.Entity.Maratona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MaratonaRepository extends JpaRepository<Maratona,Long> {
}
