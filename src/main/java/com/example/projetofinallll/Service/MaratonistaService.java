package com.example.projetofinallll.Service;

import com.example.projetofinallll.Entity.Maratonista;
import com.example.projetofinallll.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonistaService {
    @Autowired
    private MaratonistaRepository maratonistaRepository;


    public MaratonistaService(MaratonistaRepository maratonistaRepository){
        this.maratonistaRepository = maratonistaRepository;
    }
    public Maratonista salvarMaratonista (Maratonista maratonista ){
        return  maratonistaRepository.save(maratonista);
    }
    public Maratonista buscarMaratonista(long id){return  maratonistaRepository.findById(id).get();}

    public List<Maratonista> listarMaratonista(){
        return maratonistaRepository.findAll();}
}

