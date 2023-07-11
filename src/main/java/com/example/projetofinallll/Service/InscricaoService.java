package com.example.projetofinallll.Service;


import com.example.projetofinallll.Entity.Circuito;
import com.example.projetofinallll.Entity.Inscricao;
import com.example.projetofinallll.Entity.Maratonista;
import com.example.projetofinallll.Repository.CircuitoRepository;
import com.example.projetofinallll.Repository.InscricaoRepository;
import com.example.projetofinallll.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.projetofinallll.Entity.EnumCategoria.*;

@Service
public class InscricaoService {
    @Autowired
    private InscricaoRepository inscricaoRepository;
    @Autowired
    private CircuitoRepository circuitoRepository;
    @Autowired
    private MaratonistaRepository maratonistaRepository;



    public InscricaoService(InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository = inscricaoRepository;

    }
    public Inscricao salvarIncricao (Inscricao inscricao){

        Circuito circuito = circuitoRepository.findById(inscricao.getCircuito().getId()).get();
        Maratonista maratonista = maratonistaRepository.findById(inscricao.getMaratonista().getId()).get();


        switch (circuito.getCategoria()) {
            case PEQUENO: // Circuito pequeno
                if (maratonista.getIdade() < 18) {
                maratonista.setValorIncricao(1300L);
                } else {
                    maratonista.setValorIncricao(1500L);
                }
                break;
            case MEDIO: // Circuito médio
                if (maratonista.getIdade() < 18) {
                    maratonista.setValorIncricao(2000L);
                } else {
                    maratonista.setValorIncricao(2300L);
                }
                break;
            case AVANCADO: // Circuito avançado
                if (maratonista.getIdade() >= 18) {
                    maratonista.setValorIncricao(2800L);
                } else {
                    return null;
                    }
                }

        return inscricaoRepository.save(inscricao);
    }
    public Inscricao buscarInscricao(long id){return  inscricaoRepository.findById(id).get();
    }
    public List<Inscricao> listarInscricao(){
        return inscricaoRepository.findAll();}
}
