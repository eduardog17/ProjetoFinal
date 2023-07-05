package com.example.projetofinallll.Service;


import com.example.projetofinallll.Entity.Inscricao;
import com.example.projetofinallll.Repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {
    @Autowired
    private InscricaoRepository inscricaoRepository;

    public InscricaoService(InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository = inscricaoRepository;

    }
    public Inscricao salvarIncricao (Inscricao inscricao){
        return inscricaoRepository.save(inscricao);
    }
    public Inscricao buscarInscricao(long id){return  inscricaoRepository.findById(id).get();
    }
    public List<Inscricao> listarInscricao(){
        return inscricaoRepository.findAll();}
}
