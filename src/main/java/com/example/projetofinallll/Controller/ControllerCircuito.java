package com.example.projetofinallll.Controller;

import com.example.projetofinallll.Entity.Circuito;
import com.example.projetofinallll.Service.CircuitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sistema")
public class ControllerCircuito {

    @Autowired
    private CircuitoService circuitoService;


    @PostMapping("circuito")
    public ResponseEntity<Circuito> salvarCircuito(@RequestBody Circuito circuito) {
        return ResponseEntity.status(HttpStatus.CREATED).body(circuitoService.salvarCircuito(circuito));
    }
    @GetMapping("circuito/{id}")
    public Circuito buscarCircuitoPorId(@PathVariable long id){
        return circuitoService.buscarCircuito(id);
    }
    @GetMapping("circuitos")
    public List<Circuito> ListarCircuito(){ return circuitoService.listarCircuito();}
}
