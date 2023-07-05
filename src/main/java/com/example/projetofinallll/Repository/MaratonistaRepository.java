package com.example.projetofinallll.Repository;

import com.example.projetofinallll.Entity.Maratonista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonistaRepository extends JpaRepository<Maratonista,Long> {
}
