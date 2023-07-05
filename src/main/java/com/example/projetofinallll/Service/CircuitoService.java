package com.example.projetofinallll.Service;

import com.example.projetofinallll.Entity.Circuito;
import com.example.projetofinallll.Repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircuitoService {
    @Autowired
    private CircuitoRepository circuitoRepository ;

    public CircuitoService (CircuitoRepository circuitoRepository) {
        this.circuitoRepository = circuitoRepository;

    }
    public Circuito salvarCircuito (Circuito circuito){
        return circuitoRepository.save(circuito);
    }
    public Circuito buscarCircuito(long id){return  circuitoRepository.findById(id).get();
    }
    public List<Circuito> listarCircuito() {
        return circuitoRepository.findAll();
    }
    }
