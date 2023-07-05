package com.example.projetofinallll.Controller;

import com.example.projetofinallll.Entity.Inscricao;
import com.example.projetofinallll.Service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sistema")
public class ControllerInscricao {

    @Autowired
    private InscricaoService inscricaoService;


    @PostMapping("inscricao")
    public ResponseEntity<Inscricao> salvarInscricao(@RequestBody Inscricao inscricao) {
        return ResponseEntity.status(HttpStatus.CREATED).body(inscricaoService.salvarIncricao(inscricao));
    }
    @GetMapping("inscricao/{id}")
    public Inscricao buscarInscricaoPorId(@PathVariable long id){
        return inscricaoService.buscarInscricao(id);
    }
    @GetMapping("incricoes")
    public List<Inscricao> ListarInscricao(){ return inscricaoService.listarInscricao();}
}

