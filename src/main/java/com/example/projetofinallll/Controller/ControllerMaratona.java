package com.example.projetofinallll.Controller;

import com.example.projetofinallll.Entity.Maratona;

import com.example.projetofinallll.Service.MaratonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ControllerMaratona {

    @Autowired
    private MaratonaService maratonaService;


    @PostMapping("maratona")
    public ResponseEntity<Maratona> salvarMaratona(@RequestBody Maratona maratona) {
        return ResponseEntity.status(HttpStatus.CREATED).body(maratonaService.salvarMaratona(maratona));
    }
    @GetMapping("maratona/{id}")
    public Maratona buscarMaratonaPorId(@PathVariable long id){
        return maratonaService.buscarMaratona(id);

    }
    @GetMapping("maratonas")
    public List<Maratona> ListarMaratona(){ return maratonaService.listarMaratona();}
}
