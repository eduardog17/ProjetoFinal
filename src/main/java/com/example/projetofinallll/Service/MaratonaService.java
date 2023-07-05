package com.example.projetofinallll.Service;

import com.example.projetofinallll.Entity.Maratona;
import com.example.projetofinallll.Repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MaratonaService {
    @Autowired
    private MaratonaRepository maratonaRepository ;

    public MaratonaService(MaratonaRepository maratonaRepository) {
        this.maratonaRepository = maratonaRepository;

    }
    public Maratona salvarMaratona (Maratona maratona){
        return maratonaRepository.save(maratona);
    }
    public Maratona buscarMaratona(long id){return  maratonaRepository.findById(id).get();
    }
    public List<Maratona> listarMaratona(){
        return maratonaRepository.findAll();}
    }

